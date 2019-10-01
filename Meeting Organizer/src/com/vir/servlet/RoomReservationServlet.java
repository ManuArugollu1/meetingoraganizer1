package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.model.ReserveRoom;
import com.service.ReserveRoomService;
import com.service.ReserveRoomServiceImpl;

/**
 * Servlet implementation class RoomReservationServlet
 */
@WebServlet("/RoomReservationServlet")
public class RoomReservationServlet extends HttpServlet {
	private static final Logger logger=Logger.getRootLogger();
	ReserveRoomService resService=new ReserveRoomServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomReservationServlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=5;
		String date=request.getParameter("resDate");
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		
		String roomId=request.getParameter("roomid");
		String roomName=request.getParameter("roomname");
		
		String userName=request.getParameter("username");
		int priority=10;
		String status="waiting for app";
		ReserveRoom resDetails=new ReserveRoom(id,roomId,userName,date,startTime,endTime,priority,status);
		resService.reserveRoom(resDetails);
		

		
		}

}
