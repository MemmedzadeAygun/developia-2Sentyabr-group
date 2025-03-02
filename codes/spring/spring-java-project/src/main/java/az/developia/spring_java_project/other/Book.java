package az.developia.spring_java_project.other;

public class Book {

	private String name;
	private String autohor;
	public Book(String name, String autohor) {
		super();
		this.name = name;
		this.autohor = autohor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutohor() {
		return autohor;
	}
	public void setAutohor(String autohor) {
		this.autohor = autohor;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", autohor=" + autohor + "]";
	}
	
}
