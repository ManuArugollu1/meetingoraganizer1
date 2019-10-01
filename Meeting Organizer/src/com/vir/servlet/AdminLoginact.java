package com.vir.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.model.MOrganizer;
import com.service.MOrganizerService;
import com.service.MOrganizerServiceImpl;

/**
 * Servlet implementation class AdminLoginact
 */
@WebServlet("/AdminLoginact")
public class AdminLoginact extends HttpServlet {
	MOrganizerService orgService=new MOrganizerServiceImpl();
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger=Logger.getRootLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginact() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String pswd=request.getParameter("password");
		if(username.equals("admin") && pswd.equals("admin"))
		{
			HttpSession session=request.getSession();
			
			session.setAttribute("userid",username);
			//session.setAttribute("usertype", "admin");
			
			request.getRequestDispatcher("/adminhome.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("errorMessage", "Invalid Username or password");
			request.getRequestDispatcher("/Login.jsp").forward(request,response);
		}
	}

}
