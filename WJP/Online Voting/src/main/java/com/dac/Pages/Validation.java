package com.dac.Pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dac.Pojo.User;
import com.dac.dao.CandidateDao;
import com.dac.dao.Dao;
import static  com.dac.DbConfig.DbUtil.openConnection;

/**
 * Servlet implementation class Validation
 */
@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class Validation extends HttpServlet {
	Dao d;
	CandidateDao cd;
	private static final long serialVersionUID = 1L;
   
	public void init(ServletConfig config) throws ServletException {
		try {
			openConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d = new Dao();
		cd = new CandidateDao();
		System.out.print("Inside init");
	}

	
	public void destroy() {
	
		System.out.print("Inside Destroy");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			String email = request.getParameter("em");
			String pass = request.getParameter("pass");
			System.out.print(email);
			System.out.print(pass);
			User user = d.authenticateUser(email, pass);
			if(user == null) {
				pw.print("<h5> invalid login <a href = 'login.html'> Retry </a> </h5>");
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("user_dao", d);
				session.setAttribute("user_details", user);
				session.setAttribute("candidate_dao",cd );
				
				if(user.isStatus()) {					
					response.sendRedirect("logout");
				}else {
					response.sendRedirect("CandidateList");
				}
				pw.print(user.getFirstName());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
