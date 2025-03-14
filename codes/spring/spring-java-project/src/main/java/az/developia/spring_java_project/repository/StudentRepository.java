package az.developia.spring_java_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_java_project.other.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
