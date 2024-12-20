package dac.assignment1.DaoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dac.assignment1.DbUtil.DbUtil.estConnection;

public class Dao {
	Connection con;
	PreparedStatement p1,p2,p3,p4,p5;
	
	public Dao(){
		con = estConnection();
		try {
			p1 = con.prepareStatement("insert into students (name,age,grade,email) values (?,?,?,?)");
			p2 = con.prepareStatement("select * from students");
			p3 = con.prepareStatement("update students set ? = ? where id = ?");
			p4 = con.prepareStatement("delete from students where id = ?");
			p5 = con.prepareStatement("select * from students where name = ? and email = ? ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerStudent(String name, int age, String grade, String email) {
		int ra = 0;
		try {
			p1.setString(1, name);
			p1.setInt(2, age);
			p1.setString(3, grade);
			p1.setString(4, email);
			ra = p1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ra == 1) { System.out.println("Student Registered");} else {System.out.println("Registration Failed");}
	}
	
	public void viewStudents() {
		try {
			ResultSet rs = p2.executeQuery();
			while(rs.next()) {
				System.out.print("Id: "+ rs.getInt(1)+" ");
				System.out.print("Name: "+ rs.getString(2)+" ");
				System.out.print("Age: "+ rs.getInt(3)+" ");
				System.out.print("Grade: "+ rs.getString(4)+" ");
				System.out.print("Email: "+ rs.getString(5)+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudent(String key,String value, int id) {
		int ra = 0;
		try {
			p3.setString(1, key);
			p3.setInt(3, id);
			p3.setString(2, value);
			ra = p3.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ra == 1) { System.out.println("Updated Registered");} else {System.out.println("Updation Failed");}
	}
	
	public void deleteStudent(int id) {
		int ra = 0;
		try {
			
			p4.setInt(1, id);
			
			ra = p4.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ra == 1) { System.out.println("Deleted");} else {System.out.println("Deletion Failed");}
	
	}
	public void search(String name,String email) {
		try {
			p5.setString(1,name);
			p5.setString(2,email);
			ResultSet rs = p5.executeQuery();
			while(rs.next()) {
				System.out.print("Id: "+ rs.getInt(1)+" ");
				System.out.print("Name: "+ rs.getString(2)+" ");
				System.out.print("Age: "+ rs.getInt(3)+" ");
				System.out.print("Grade: "+ rs.getString(4)+" ");
				System.out.print("Email: "+ rs.getString(5)+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
