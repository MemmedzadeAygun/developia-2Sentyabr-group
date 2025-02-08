package az.developia.spring_java_project.other;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component(value = "myComp1")
public class Computer {

	private Integer id;
	private String model;
	
	public Computer() {
		this.id=13;
		this.model="Aspiro";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
