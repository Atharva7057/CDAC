package com.dac.Pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dac.Pojo.Candidate;
import com.dac.Pojo.User;
import com.dac.dao.CandidateDao;

/**
 * Servlet implementation class CandidateList
 */
@WebServlet("/CandidateList")
public class CandidateList extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();
			
			User user = (User) session.getAttribute("user_details");
			
			if(user != null) {
				CandidateDao cd = (CandidateDao) session.getAttribute("candidate_dao");
				List<Candidate> allCandidates = cd.getAllCandidates();
				pw.print("<h5><form method='POST' action='logout'>");
				for (Candidate c : allCandidates) {
					pw.print("<h5> <input type='radio' name='cid' value='" 
				+ c.getCandidateId() + "'>" + c.getName()+" "+c.getPartyName()
							+ "</input>");
				}
				pw.print("<input type='submit' value='Vote'/>");
				pw.print("</form></h5>");
			}else {
				pw.print("No cookies Available");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
