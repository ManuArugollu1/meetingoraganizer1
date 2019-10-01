package com.vir.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.service.RoomService;
import com.service.RoomServiceImpl;

/**
 * Servlet implementation class DeleteRoomServlet
 */
@WebServlet("/DeleteRoomServlet")
public class DeleteRoomServlet extends HttpServlet {
	private static final Logger logger=Logger.getRootLogger();
	RoomService roomService=new RoomServiceImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteRoomServlet() {
		super();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("Room deleted successfully");
		String roomId=request.getParameter("roomid");
		//call delete room method and go back to home page
		roomService.deleteRoomInfo(roomId);
		PrintWriter writer=response.getWriter();
		writer.append("click here to go to home page <a href=\"home.jsp\">BACK");
		writer.append("</a>");

	}

}
