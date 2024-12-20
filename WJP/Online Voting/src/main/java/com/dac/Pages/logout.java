package com.dac.Pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dac.Pojo.User;
import com.dac.dao.CandidateDao;
import com.dac.dao.Dao;

@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// Get PW
		try (PrintWriter pw = response.getWriter()) {
			HttpSession session = request.getSession();
			// get voter details
			User voter = (User) session.getAttribute("user_details");
			if (voter != null) {
				pw.print("<h5>You have already voted ! </h5>" + voter.getFirstName());
			} else
				pw.print("<h5>No cookies , no sesison tracking!!!!!</h5>");
			// discard HttpSession
			session.invalidate();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			Dao userDao = (Dao) session.getAttribute("user_dao");
			User user = (User) session.getAttribute("user_details");
			CandidateDao cd = (CandidateDao) session.getAttribute("candidate_dao");
			if(user != null) {
				out.print("<h1>"+userDao.updateVotingStatus(user.getUserId()) +"</h1>");
				int candidateId = Integer.parseInt(request.getParameter("cid"));
				out.print("<h1>"+cd.incrementVotes(candidateId) +"</h1>");
			}else {
				out.print("<h1>Hello "+user.getFirstName()+" </h1>");
				out.print("<h1> You have already voted </h1>");
			}
			
			session.invalidate();
		}catch(Exception E) {
			E.printStackTrace();
		}
	
	}
	

}
