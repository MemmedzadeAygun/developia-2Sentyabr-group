package main.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import main.Constants;
import main.entity.TeacherEntity;
import main.entity.TeacherGroupEntity;

public class TeacherGroupRepository {

	public void add(TeacherGroupEntity teacherGroup){

		String query = "INSERT INTO teacher_group(name,register_date,teacher_id) VALUES"
				+ "('"+teacherGroup.getName()
				+"','"+teacherGroup.getRegister_date()
				+"','"+teacherGroup.getTeacher_id()+"')";

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
			st.executeUpdate(query);

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public ArrayList<TeacherGroupEntity> getAllGroupByTeacherId(Integer teacherId){
		ArrayList<TeacherGroupEntity> teacherGroups=new ArrayList<TeacherGroupEntity>();
		
		String query="SELECT * FROM teacher_group WHERE teacher_id='"+teacherId+"';";
		
		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
//			st.executeUpdate(query);
			
			ResultSet resultSet=st.executeQuery(query);
			
			
			while (resultSet.next()) {
				TeacherGroupEntity teacherGroupEntity=new TeacherGroupEntity();
				teacherGroupEntity.setId(resultSet.getInt("Id"));
				teacherGroupEntity.setName(resultSet.getString("name"));
				teacherGroupEntity.setRegister_date(resultSet.getTimestamp("register_date").toLocalDateTime());
				teacherGroupEntity.setTeacher_id(resultSet.getInt("teacher_id"));
				teacherGroups.add(teacherGroupEntity);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return teacherGroups;
	}
	
	
	public void deleteGroup(Integer  Id){

		String query = "DELETE FROM teacher_group  WHERE Id='"+Id+"';";

		try {
			Connection con = DriverManager.getConnection(Constants.url, Constants.username,
					Constants.password);

			Statement st = con.createStatement();
			st.executeUpdate(query);

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
