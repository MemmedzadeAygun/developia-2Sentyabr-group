package az.developia.spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {

}
