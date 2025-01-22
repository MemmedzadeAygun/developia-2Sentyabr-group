package main.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class TeacherGroupEntity {

	private Integer id;
	private String name;
	private LocalDateTime registerDate;
	private Integer teacherId;
	
	public TeacherGroupEntity() {
		super();
	}
	
	
	public TeacherGroupEntity(Integer id, String name, LocalDateTime registerDate, Integer teacherId) {
		super();
		this.id = id;
		this.name = name;
		this.registerDate = registerDate;
		this.teacherId = teacherId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	@Override
	public String toString() {
		return "TeacherGroupEntity [id=" + id + ", name=" + name + ", registerDate=" + registerDate + ", teacherId="
				+ teacherId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, registerDate, teacherId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeacherGroupEntity other = (TeacherGroupEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(registerDate, other.registerDate) && Objects.equals(teacherId, other.teacherId);
	}
	
	
	
}
