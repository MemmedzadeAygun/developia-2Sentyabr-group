package test2;

public class User {

	private String name;
	private int id;
	private String  surname;
	public User(String name, int id, String surname) {
		super();
		this.name = name;
		this.id = id;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", surname=" + surname + "]";
	}

}
