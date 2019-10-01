package com.model;

public class ReserveRoom {
	private int id;
	private String roomId;

	private String userName;
	private String resDate;
	private String startTime;
	private String endTime;
	private String status;
	private int priority;
	
	


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRoomId() {
		return roomId;
	}


	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}



	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getResDate() {
		return resDate;
	}


	public void setResDate(String resDate) {
		this.resDate = resDate;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public ReserveRoom() {
		super();
		
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ReserveRoom(int id,String roomId,  String userName, String resDate, String startTime,
			String endTime, int priority,String status) {
		super();
		this.id = id;
		this.roomId = roomId;
		this.userName = userName;
		this.resDate = resDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status=status;
		this.priority = priority;
	}


	@Override
	public String toString() {
		return "ReserveRoom [id=" + id + ", roomId=" + roomId + ", userName=" + userName
				+ ", resDate=" + resDate + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status
				+ ", priority=" + priority + "]";
	}



	



}
