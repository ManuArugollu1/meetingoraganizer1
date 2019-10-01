package com.service;

import java.util.List;

import com.model.MOrganizer;
import com.model.ReserveRoom;

public interface ReserveRoomService {
	
	List<ReserveRoom> findReservedRooms(String userName);
	ReserveRoom findByRoomId(String roomId);
	ReserveRoom findByRoomName(String roomName);
	ReserveRoom reserveRoom(ReserveRoom resDetails);
	ReserveRoom updateReservedRoom(ReserveRoom resroom);
	ReserveRoom updateStatus(String status);
	ReserveRoom deleteReservedRoom(ReserveRoom resroom);
	
	boolean checkRoomId(String roomId);
	boolean checkRoomName(String roomName);
	MOrganizer getRoomInfo(String room);
	
	MOrganizer getReservationPage(String roomid,String roomName);
	

}
