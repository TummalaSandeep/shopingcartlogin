  package com.niit.ShopinngCart; 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet .ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{	
		// TODO Auto-generated method stub
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		System.out.println(userId);
		System.out.println(password);
		
		
		LoginDAO logindao=new LoginDAO();
		
		RequestDispatcher dispatcher;
		System.out.println(userId);
		System.out.println(password);
             
		
		//Object Object;
		if(logindao.isValidUser(userId,password)==true)
		//if(Object.equals("sandeep")&& password.equals("sandy"))
		{
		dispatcher=request.getRequestDispatcher("Home.html");
		
		dispatcher.forward(request,response);
		}
	
		else
		{
			System.out.println("Invalid credentials");
PrintWriter writer=response.getWriter();
			writer.println("please enter valid credentials");
			
			 dispatcher=request.getRequestDispatcher("login2.html");
			dispatcher.include(request, response);
		}
		
	}
  
 }
