package com.dao;

import java.util.List;

import com.model.MOrganizer;

public interface MOrganizerDao {
	
	MOrganizer findByUserName(String userName);
	MOrganizer addUser(String name,String userName,String password,long mobileNumber); 
	MOrganizer updateUser(MOrganizer org); 
	MOrganizer deleteUser(MOrganizer org);
	List<MOrganizer> findAll();
	boolean checkLogin(String userName,String password);

}
