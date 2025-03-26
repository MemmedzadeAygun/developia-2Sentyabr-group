package az.developia.spring_java_project.other;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//@Scope(value = "prototype")
//@Component(value = "myStudent1")
@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Size(min=2,max=40,message="ad min 2,max 40 simvol ola biler")
	private String name;
	
	@Size(min=2,max=40,message="ad min 2,max 40 simvol ola biler")
	private String surname;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
}
