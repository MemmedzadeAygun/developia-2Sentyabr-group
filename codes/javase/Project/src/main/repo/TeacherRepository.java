package main.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.Constants;
import main.entity.TeacherEntity;
import main.exception.MyRuntimeException;

public class TeacherRepository {

	public void add(TeacherEntity teacher) throws MyRuntimeException {

		if (teacher.getName().length() > 45) {
			throw new MyRuntimeException("Ad max 45 simvol ola biler");
		}
		if (teacher.getSurname().length() > 45) {
			throw new MyRuntimeException("Soyad max 45 simvol ola biler");
		}

		String query = "INSERT INTO teacher(name,surname,phone,username,password) VALUES " + "('" + teacher.getName()
				+ "','" + teacher.getSurname() + "','" + teacher.getPhone() + "','" + teacher.getUsername() + "','"
				+ teacher.getPassword() + "')";

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
			st.executeUpdate(query);

			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public boolean checkUsername(String username) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "'";

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
//			st.executeUpdate(query);
			ResultSet result = st.executeQuery(query);
			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return userExists;
	}

	public boolean login(String username, String password) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "' and password='" + password + "'";

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
//			st.executeUpdate(query);
			ResultSet result = st.executeQuery(query);
			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return userExists;
	}

	public TeacherEntity getById(Integer Id) {

		String query = "SELECT * FROM teacher WHERE Id='" + Id + "';";

		TeacherEntity entity = new TeacherEntity();

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(query);

			if (result.next()) {
				entity.setId(result.getInt("Id"));
				entity.setName(result.getString("name"));
				entity.setSurname(result.getString("surname"));
				entity.setPhone(result.getString("phone"));
				entity.setUsername(result.getString("username"));
				entity.setPassword(result.getString("password"));
			} else {
				System.out.println("Id not found!");
			}

			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return entity;

	}

}
