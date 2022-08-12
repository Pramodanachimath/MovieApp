package com.movies.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.service.ILoginService;
import com.movieapp.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 
		 ILoginService loginServer=new LoginServiceImpl();
		 
		boolean result=loginServer.validateUsername(username, password);
		 if(result) {
			 request.setAttribute("myusername", username);
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				
				dispatcher.forward(request, response);
		 }else{
			 response.sendRedirect("index.jsp");
			 
		 }
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
