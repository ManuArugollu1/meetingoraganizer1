package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestReaderServlet
 */
@WebServlet("/RequestReaderServlet")
public class RequestReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestReaderServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("userid");
		String password=request.getParameter("password");
		String sessionId=request.getParameter("sessionid");
		String sex=request.getParameter("sex");
		String lang1=request.getParameter("lang1");
		String lang2=request.getParameter("lang2");
		String lang3=request.getParameter("lang3");
		String difficulty=request.getParameter("level");
		
		
		
		System.out.println("userid:"+user);
		System.out.println("password:"+password);

		System.out.println("Sessionid:"+sessionId);

		System.out.println("sex:"+sex);

		System.out.println("lang1:"+lang1);

		
		System.out.println("lang2:"+lang2);

		System.out.println("lang3:"+lang3);
		System.out.println("level:"+difficulty);

		
		
	}

}
