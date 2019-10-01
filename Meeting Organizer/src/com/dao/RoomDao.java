package com.dao;

import java.util.List;

import com.model.Room;

public interface RoomDao {
	Room findByRoomId(String roomId);
	Room findByRoomName(String roomName);
	Room addRoomInfo(Room room);
	Room deleteRoomInfo(String roomId);
	Room updateRoomStatus(String roomId,String roomName,String status);
	List<Room> findAll();

}
