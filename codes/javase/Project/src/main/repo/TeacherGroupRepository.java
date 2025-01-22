package main.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import main.entity.TeacherGroupEntity;

public class TeacherGroupRepository {

	public void add(TeacherGroupEntity teacherGroup) {
		
		String query="INSERT INTO teacher_group(name,register_date,teacher_id) VALUES"
				+ "('"+teacherGroup.getName()
				+"','"+teacherGroup.getRegisterDate()
				+"','"+teacherGroup.getTeacherId()+"')";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/teacher_db?useSSL=false", "root",
					"2004");

			Statement st = con.createStatement();
			st.executeUpdate(query);

			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	public ArrayList<TeacherGroupEntity> findGroupByTeacherId(int teacherId) {
		
		String query="SELECT * FROM teacher_group WHERE teacher_id='"+teacherId+"'";
		
		ArrayList<TeacherGroupEntity> groups=new ArrayList<TeacherGroupEntity>();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/teacher_db?useSSL=false", "root",
					"2004");

			Statement st = con.createStatement();
//			st.executeUpdate(query);
			
			ResultSet result=st.executeQuery(query);
			
			while(result.next()) {
				TeacherGroupEntity group=new TeacherGroupEntity();
				group.setId(result.getInt("Id"));
				group.setName(result.getString("name"));
				group.setRegisterDate(result.getTimestamp("register_date").toLocalDateTime());
				group.setTeacherId(result.getInt("teacher_id"));
				groups.add(group);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return groups;
	}
	
	
	public void deleteById(Integer Id) {
		
		String query="DELETE FROM teacher_group WHERE Id='"+Id+"';";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/teacher_db?useSSL=false", "root",
					"2004");

			Statement st = con.createStatement();
			st.executeUpdate(query);

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
