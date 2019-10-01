package com.vir.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.model.Room;
import com.service.RoomService;
import com.service.RoomServiceImpl;

/**
 * Servlet implementation class AddRoomServlet
 */
@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
	private static final Logger logger=Logger.getRootLogger();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoomServlet() {
        super();

    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roomid=request.getParameter("roomid");
		String roomname=request.getParameter("roomname");
		logger.debug(roomname);
		String floor=request.getParameter("floor");
		String incharge=request.getParameter("incharge");
		int capacity=Integer.parseInt(request.getParameter("capacity"));
		String status=request.getParameter("status");
	
		Room room=new Room(roomid,roomname,floor,incharge,capacity,status);
		RoomService roomService=new RoomServiceImpl();
		roomService.addRoomInfo(room);
		
		//Call insert into room operation and get back back to home page
		
		PrintWriter writer=response.getWriter();
		writer.append("click here to go to home page <a href=\"home.jsp\">BACK");
		writer.append("</a>");

	}

}
