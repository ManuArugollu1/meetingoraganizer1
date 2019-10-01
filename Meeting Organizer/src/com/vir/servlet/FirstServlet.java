package com.vir.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int  count=1;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
    }
    @Override
    public void init() 
    {
    	
    	 
    	
    }
    @Override
    public void destroy()
    {
    	
    	
    	System.out.println("Destroying the first Servlet");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.append(request.getContentType());
		System.out.println("content type:"+request.getContentType());
		System.out.println("local Address:"+request.getLocalAddr());
		System.out.println("local port"+request.getLocalPort());
		System.out.println("Remote Address:"+request.getRemoteAddr());
		System.out.println("remote port:"+request.getRemotePort());
		Enumeration<String> headerNames =request.getHeaderNames();
		while(headerNames.hasMoreElements())
		{
			String headerName=headerNames.nextElement();
			System.out.println("Header NAme:"+headerName);
			System.out.println("Header VAlue:"+request.getHeader(headerName));
		}
		response.setContentType("text/html");
		writer.append("<html><head><title>FIRST SERVLET </title></head>");
		writer.append("<body><h1>");
		writer.append("Served At:").append(request.getContextPath());
		writer.append("</h1>");
		writer.append("You are customer or visitor:"+ count++ +"<br>");
		writer.append("time on the server is:"+new Date()+"<br>");
		
		writer.append("click here to go to home page <a href=\"webLibrary\">HOME");
		writer.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
