package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MOrganizerService;
import com.service.MOrganizerServiceImpl;

/**
 * Servlet implementation class SearchOrganizerServlet
 */
@WebServlet("/SearchOrganizerServlet")
public class SearchOrganizerServlet extends HttpServlet {
	MOrganizerService orgservice=new MOrganizerServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchOrganizerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		orgservice.findByUserName(username);
	
	
		
	}

}
