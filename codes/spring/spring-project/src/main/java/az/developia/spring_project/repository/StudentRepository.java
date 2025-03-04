package az.developia.spring_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {

	List<Students> findAllByTeacherId(Integer teacherId);

}
