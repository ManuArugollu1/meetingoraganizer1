package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.Jdbc.Connection.DbConnection;
import com.model.ReserveRoom;

public class ReserveRoomDaoImpl implements ReserveRoomDao {

	private static final Logger logger = Logger.getRootLogger();
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<ReserveRoom> findReservedRooms(String userName) {
		List<ReserveRoom> resList = new ArrayList<>();

		try {
			conn = DbConnection.getConnection();
			ps = conn.prepareStatement("select * from reservation where username=?");
			ps.setString(1, userName);
			rs = ps.executeQuery();
			while (rs.next()) {
				resList.add(getReservationListFromResultSet(rs));
			}
		} catch (Exception e) {
			logger.error(e);
		}

		return resList;
	}

	private ReserveRoom getReservationListFromResultSet(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String roomId = rs.getString("roomid");
			String userName = rs.getString("username");
			String date = rs.getString("reservedate");
			String startTime = rs.getString("starttime");
			String endTime = rs.getString("endtime");
			int priority=rs.getInt("priority");
			String status = rs.getString("status");
			ReserveRoom list = new ReserveRoom(id, roomId, userName, date, startTime, endTime, priority, status);
			logger.trace(list);
			return list;

		} catch (SQLException e) {
			logger.error(e);
		}

		return null;
	}

	@Override
	public ReserveRoom findByRoomId(String roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReserveRoom findByRoomName(String roomName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReserveRoom reserveRoom(ReserveRoom resDetails) {
		String userName = resDetails.getUserName();
		String roomId = resDetails.getRoomId();

		String reserveDate = resDetails.getResDate();
		String startTime = resDetails.getStartTime();

		String endTime = resDetails.getEndTime();

		try {
			conn = DbConnection.getConnection();
			ps = conn.prepareStatement("insert into reservation(id,userName,roomid,reservedate,starttime,endtime,priority,status) values(resid_seq.nextval,?,?,?,?,?,10,'waiting for app')");
			ps.setString(1, userName);
			ps.setString(2, roomId);

			ps.setString(4, reserveDate);
			ps.setString(5, startTime);
			ps.setString(6,endTime);
			rs = ps.executeQuery();
			conn.commit();

		} catch (Exception e) {
			logger.error(e);
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e)
			{
				logger.error(e);
			}
		}
		return null;
	}

	@Override
	public ReserveRoom updateReservedRoom(ReserveRoom resroom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReserveRoom updateStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReserveRoom deleteReservedRoom(ReserveRoom resroom) {
		// TODO Auto-generated method stub
		return null;
	}
}
