package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MOrganizer;
import com.service.MOrganizerService;
import com.service.MOrganizerServiceImpl;

/**
 * Servlet implementation class Registrationact
 */
@WebServlet("/Registrationact")
public class Registrationact extends HttpServlet {

	MOrganizerService orgService=new MOrganizerServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrationact() {
        super();
    }
    
    
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String username=request.getParameter("uname");
		String pswd=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
	
		
	
			orgService.addUser(name,username,pswd,mobile);
			response.sendRedirect("Login.jsp");
		
}
}

	
