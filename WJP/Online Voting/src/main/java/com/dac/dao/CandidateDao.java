package com.dac.dao;
import static com.dac.DbConfig.DbUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dac.Pojo.*;
public class CandidateDao {
	Connection con;
	PreparedStatement pst1,pst2;
	
	public CandidateDao() {
		con = getConnection();
		try {
			pst1 = con.prepareStatement("Select * from candidates");
			pst2 = con.prepareStatement("update candidates set votes = votes+1 where id = ? ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Candidate> getAllCandidates(){
		List<Candidate> candidates=new ArrayList<>();
		try {
			ResultSet rst = pst1.executeQuery();
			while(rst.next()) {
				candidates.add(new Candidate(rst.getInt(1), 
						rst.getString(2), rst.getString(3),rst.getInt(4)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return candidates;
	}
	public String incrementVotes(int candidateId) throws SQLException {
		//set In param : candidate id
		pst2.setInt(1, candidateId);
		int rowCount=pst2.executeUpdate();
		if(rowCount==1)
			return "Incremented votes !";
		return "Incrementing votes failed !!!!!";
	}
}
