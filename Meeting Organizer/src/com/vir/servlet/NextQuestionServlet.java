package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class NextQuestionServlet
 */
@WebServlet("/NextQuestionServlet")
public class NextQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String[] questions= {"Who is th PM of India","Name the Finance Minister of India?","Which company owns JDK?","Hibernate is framework for which framework"};
	String[][] options= {{"Manmohan Singh","Narendra Modi","Indhira Gandhi","Pranab Mukherji"},{"RajNath","Amith","Arun","Nirmala"},{"Oracle","Microsoft","Google","Apple"},{"Testing","Developing","Desinging","Framework"}};
	String answersClicked="";
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NextQuestionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		int currentQno=-1;
		for(Cookie ck:cookies)
		{
			System.out.println(ck.getName()+":"+ck.getValue());
			if(ck.getName().equals("questionNumber"))
				currentQno=Integer.parseInt(ck.getValue());


		}
		currentQno++;
		if(currentQno>=questions.length) currentQno=0;
		if(currentQno==0)
		{
			request.setAttribute("answersClicked", "");
			answersClicked="";
		}
		Cookie ckq=new Cookie("questionNumber",""+currentQno);
		response.addCookie(ckq);
		request.setAttribute("question", questions[currentQno]);
		request.setAttribute("optionsForQ",options[currentQno]);
		
		
		String ansClicked=request.getParameter("answersClicked");
		response.addCookie(ckq);
		request.setAttribute("question", questions[currentQno]);
		request.getRequestDispatcher("ShowQuestion.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
	}

}
