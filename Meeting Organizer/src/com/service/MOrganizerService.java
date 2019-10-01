package com.service;

import java.util.List;

import com.model.MOrganizer;

public interface MOrganizerService {
	
	MOrganizer findByUserName(String userName);
	MOrganizer addUser(String name,String userName,String password,long mobileNumber); 
	MOrganizer updateUser(MOrganizer org); 
	MOrganizer deleteUser(MOrganizer org);
	List<MOrganizer> findAll();
	
	boolean checkLogin(String userName,String password);
	MOrganizer getHomePage(String userName);
	

}
