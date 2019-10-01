package com.vir.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.RoomService;
import com.service.RoomServiceImpl;

/**
 * Servlet implementation class UpdateRoomStatusServlet
 */
@WebServlet("/UpdateRoomStatusServlet")
public class UpdateRoomStatusServlet extends HttpServlet {
	RoomService roomService=new RoomServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRoomStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String roomid=request.getParameter("roomid");
	String roomname=request.getParameter("roomname");
	String status=request.getParameter("status");
	roomService.updateRoomStatus(roomid,roomname,status);
	}

}
