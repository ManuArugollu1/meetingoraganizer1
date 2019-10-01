package com.service;

import java.util.List;

import com.dao.RoomDao;
import com.dao.RoomDaoImpl;
import com.model.Room;

public class RoomServiceImpl implements RoomService {
	RoomDao roomDao=new RoomDaoImpl();

	@Override
	public Room findByRoomId(String roomId) {
		
		return roomDao.findByRoomId(roomId);
	}

	@Override
	public Room findByRoomName(String roomName) {
		
		return roomDao.findByRoomName(roomName);
	}


	

	@Override
	public Room deleteRoomInfo(String roomId) {
	return roomDao.deleteRoomInfo(roomId);
	}

	@Override
	public Room updateRoomStatus(String roomId,String roomName,String status) {
		
		return roomDao.updateRoomStatus(roomId,roomName,status);
	}

	@Override
	public List<Room> findAll() {
		
		return roomDao.findAll();
	}

	@Override
	public Room addRoomInfo(Room room) {
		// TODO Auto-generated method stub
		return roomDao.addRoomInfo(room);
	}

	
	

}
