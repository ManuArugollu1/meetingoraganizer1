package com.model;

public class MOrganizer {

	private int id;
	private String name;
	private String userName;
	private String password;
	private long mobileNumber;







	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public MOrganizer() {
		super();

	}


	public MOrganizer(int id,String name, String userName, String password, long mobileNumber) {
		super();
		this.id=id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;

	}


	@Override
	public String toString() {
		return "MOrganizer [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", mobileNumber=" + mobileNumber +"]";
	}









}
