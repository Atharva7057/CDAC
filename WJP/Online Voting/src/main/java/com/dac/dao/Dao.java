package com.dac.dao;
import static com.dac.DbConfig.DbUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dac.Pojo.User;
public class Dao {
	Connection con ;
	PreparedStatement p1,p2;
	
	public Dao(){
		 try {
			con = getConnection();
			System.out.println("user dao created !");
			p1 = con.prepareStatement("Select * from users where email=? and password=?");
			p2 = con.prepareStatement("update users set status = true where id =?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public User authenticateUser(String email,String password){
		
		try{
			
			p1.setString(1, email);
			p1.setString(2, password);
			System.out.print(email);
			System.out.print(password);
			ResultSet rst= p1.executeQuery();
			if(rst.next())
				return new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8));
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		//invalid login
		return null;
	}
	public String updateVotingStatus(int voterId) throws SQLException{
		//set IN param
	
		p2.setInt(1, voterId);
		int rowCount=p2.executeUpdate();
		if(rowCount == 1)
			return "Updated voting status!";
		
		return "Updation failed !!!!!";
	}
}
