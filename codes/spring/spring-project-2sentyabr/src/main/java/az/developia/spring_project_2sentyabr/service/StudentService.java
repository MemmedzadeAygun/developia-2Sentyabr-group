package az.developia.spring_project_2sentyabr.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_2sentyabr.dto.StudentRequestDto;
import az.developia.spring_project_2sentyabr.dto.StudentResponseDto;
import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.repository.StudentRepository;
import az.developia.spring_project_2sentyabr.response.StudentResponse;
import jakarta.validation.Valid;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentResponse getStudents() {
		StudentResponse response = new StudentResponse();
		response.setStudents(studentRepository.findAll());
		response.setLength(1.50);
		return response;
	}

	public List<Student> search(String query) {
		List<Student> all = studentRepository.findAll();
		if (query == null) {
			return all;
		}
		return all.stream().filter(student -> student.getName().toLowerCase().contains(query.toLowerCase()))
				.collect(Collectors.toList());
	}

	public void create(StudentRequestDto dto) {

		Student s = new Student();
		s.setId(null);
		s.setName(dto.getName());
		s.setSurname(dto.getSurname());

		studentRepository.save(s);

	}

	public void update(@Valid StudentRequestDto dto) {

		if (dto.getId() == null || dto.getId() <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}

		Optional<Student> byId = studentRepository.findById(dto.getId());

		if (byId.isPresent()) {
			Student student = byId.get();
			student.setId(dto.getId());
			student.setName(dto.getName());
			student.setSurname(dto.getSurname());

			studentRepository.save(student);
		} else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}

	public void delete(Integer id) {
		// null, 0, not found, found
		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			studentRepository.deleteById(id);
		} else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}

	public StudentResponseDto getById(Integer id) {
		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			Student student = byId.get();
			StudentResponseDto response = new StudentResponseDto();
			response.setId(student.getId());
			response.setName(student.getName());
			response.setSurname(student.getSurname());

			return response;
		} else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}

}
