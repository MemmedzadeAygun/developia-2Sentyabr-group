package az.developia.teacher.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import az.developia.teacher.Constant;
import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.exception.MyRuntimeException;

public class TeacherRepository {

	public void add(TeacherEntity teacher) throws MyRuntimeException {

		if (teacher.getName().length() > 45) {
			throw new MyRuntimeException("Ad max 45 simvol ola biler");
		}

		String query = "INSERT INTO teacher(name,surname,phone,address,username,password) VALUES " + "('"
				+ teacher.getName() + "','" + teacher.getSurname() + "','" + teacher.getPhone() + "','"
				+ teacher.getAddress() + "','" + teacher.getUsername() + "','" + teacher.getPassword() + "')";

		try {
			Connection conn = DriverManager.getConnection(Constant.url,
					Constant.username, Constant.password);		//url,username,password

			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	//Librarian Kitabxanaciucun
	//members

	public boolean checkUser(String username) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "';";

		try {
			Connection conn = DriverManager.getConnection(Constant.url,
					Constant.username, Constant.password);

			Statement st = conn.createStatement();

//			st.executeUpdate(query);
			ResultSet result = st.executeQuery(query);

			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return userExists;

	}
	
	
	public boolean login(String username, String password) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "' and password='"+password+"';";

		try {
			Connection conn = DriverManager.getConnection(Constant.url,
					Constant.username, Constant.password);

			Statement st = conn.createStatement();

//			st.executeUpdate(query);
			ResultSet result = st.executeQuery(query);

			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return userExists;

	}
	
	public TeacherEntity getById(Integer Id) {
		
		TeacherEntity teacher=new TeacherEntity();
		
		String query="SELECT * FROM teacher WHERE Id='"+Id+"'";
		
		try {
			Connection conn = DriverManager.getConnection(Constant.url,
					Constant.username, Constant.password);		//url,username,password

			Statement st = conn.createStatement();

//			st.executeUpdate(query);
			ResultSet result=st.executeQuery(query);
			if(result.next()) {
				teacher.setId(result.getInt("Id"));
				teacher.setName(result.getString("name"));
				teacher.setSurname(result.getString("surname"));
				teacher.setAddress(result.getString("address"));
				teacher.setPhone(result.getString("phone"));
				teacher.setUsername(result.getString("username"));
				teacher.setPassword(result.getString("password"));
			}else {
				System.out.println("Id-si " +Id+ " olan muellim tapilmadi");
			}

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return teacher;
	}
}
