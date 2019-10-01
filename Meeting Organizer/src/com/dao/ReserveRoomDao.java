package com.dao;

import java.util.List;

import com.model.ReserveRoom;

public interface ReserveRoomDao {
	List<ReserveRoom> findReservedRooms(String userName);
	ReserveRoom findByRoomId(String roomId);
	ReserveRoom findByRoomName(String roomName);
	ReserveRoom reserveRoom(ReserveRoom resDetails);
	ReserveRoom updateReservedRoom(ReserveRoom resroom);
	ReserveRoom updateStatus(String status);
	ReserveRoom deleteReservedRoom(ReserveRoom resroom);

}
