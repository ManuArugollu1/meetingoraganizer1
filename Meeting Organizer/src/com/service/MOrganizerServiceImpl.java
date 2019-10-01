package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.log4j.Logger;

import com.dao.MOrganizerDao;
import com.dao.MOrganizerDaoImpl;
import com.model.MOrganizer;

public class MOrganizerServiceImpl implements MOrganizerService {

	private static final Logger logger=Logger.getRootLogger();
	public Connection conn=null;
	public PreparedStatement ps=null;
	public ResultSet rs=null;

	MOrganizerDao dao=new MOrganizerDaoImpl();
	@Override
	public MOrganizer findByUserName(String userName)
	{
		return dao.findByUserName(userName);	
	}

	@Override
	public MOrganizer addUser(String name,String userName,String password,long mobileNumber) {
		return dao.addUser(name,userName,password,mobileNumber);
	}

	@Override
	public MOrganizer updateUser(MOrganizer org) {
		return dao.updateUser(org);
	}

	@Override
	public MOrganizer deleteUser(MOrganizer org) {
		return dao.deleteUser(org);
	}


	@Override
	public boolean checkLogin(String userName,String password) {
	return dao.checkLogin(userName,password);
	}

	@Override
	public MOrganizer getHomePage(String userName) {
		return null;
	}

	@Override
	public List<MOrganizer> findAll() {

		return dao.findAll();
	}

}

