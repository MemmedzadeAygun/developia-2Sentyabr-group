package az.developia.spring_java_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_java_project.other.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
