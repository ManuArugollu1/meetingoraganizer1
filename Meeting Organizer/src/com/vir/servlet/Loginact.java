
package com.vir.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

//import com.model.MOrganizer;
import com.model.ReserveRoom;
import com.service.MOrganizerService;
import com.service.MOrganizerServiceImpl;
import com.service.ReserveRoomService;
import com.service.ReserveRoomServiceImpl;

/**
 * Servlet implementation class Loginact
 */
@WebServlet({ "/Loginact" })
public class Loginact extends HttpServlet {
	private static final Logger logger=Logger.getRootLogger();
	ReserveRoomService resService=new ReserveRoomServiceImpl();
	private static final long serialVersionUID = 1L;
	
       MOrganizerService orgService=new MOrganizerServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginact() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String pswd=request.getParameter("password");
	
		
		if( orgService.checkLogin(username,pswd))
		{
			logger.debug("login successful");
			HttpSession session=request.getSession();
			session.setAttribute("userid",username);
			List<ReserveRoom> resList=resService.findReservedRooms(username);
			request.setAttribute("resList", resList);
			request.getRequestDispatcher("/home.jsp").forward(request,response);
			
		}
		else
		{
			request.setAttribute("errorMessage", "Invalid Username or password");
			request.getRequestDispatcher("/Login.jsp").forward(request,response);
		}
		
		
		
	}

	
}
