package az.developia.spring_project_2sentyabr.entity;

public class Book {
private String name;
private String author;

public Book(String name, String author) {
	super();
	this.name = name;
	this.author = author;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [name=" + name + ", author=" + author + "]";
}


}
