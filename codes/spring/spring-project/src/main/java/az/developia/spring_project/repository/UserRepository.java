package az.developia.spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project.entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity, String>{

}
