package az.developia.spring_project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

	@Id
	private String username;
	private String password;
	private String email;
	private Integer enabled;
	private String type;
}
