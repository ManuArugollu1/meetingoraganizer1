package com.service;

import java.util.List;

import com.dao.ReserveRoomDao;
import com.dao.ReserveRoomDaoImpl;
import com.model.MOrganizer;
import com.model.ReserveRoom;

public class ReserveRoomServiceImpl implements ReserveRoomService{

	ReserveRoomDao resdao=new ReserveRoomDaoImpl(); 

	@Override
	public ReserveRoom findByRoomId(String roomId) {
		return null;
	}

	@Override
	public ReserveRoom findByRoomName(String roomName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReserveRoom reserveRoom(ReserveRoom resDetails) {
		// TODO Auto-generated method stub
		return resdao.reserveRoom(resDetails);
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

	@Override
	public boolean checkRoomId(String roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkRoomName(String roomName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MOrganizer getRoomInfo(String room) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public MOrganizer getReservationPage(String roomid, String roomName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReserveRoom> findReservedRooms(String userName) {

		return resdao.findReservedRooms(userName);
	}

}
