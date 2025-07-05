package test2;

public class MainClass_2 {
	public static void main(String[] args) {

//	Manager<String> m=new Manager<>();
//	m.addList("nese");
//	m.addList("nese1");
//	m.addList("nese2");
//	m.addList("nese3");
//	m.showList();
//	
//	Manager<Integer> m2=new Manager<>();
//	m2.addList(1);
//	m2.addList(2);
//	m2.addList(3);
//	m2.addList(4);
//	m2.showList();

		Manager<Employee, String> employee = new Manager<>();
		employee.addList(new Employee(1, "Jhon Wick", "IT"));
		employee.addList(new Employee(2, "Jessica William", "IT"));
		employee.addList(new Employee(3, "Jhon Wick", "Business"));
		employee.showList();
	}
}
