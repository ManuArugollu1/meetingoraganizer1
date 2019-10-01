package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.Jdbc.Connection.DbConnection;
import com.model.MOrganizer;

public class MOrganizerDaoImpl implements MOrganizerDao {
	private static final Logger logger = Logger.getRootLogger();
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public MOrganizer findByUserName(String userName) {
		try {
			conn = DbConnection.getConnection();

			ps = conn.prepareStatement("Select * from organizer where username=?");

			ps.setString(1, userName);

			rs = ps.executeQuery();
			conn.commit();
			while (rs.next()) {
				logger.debug(rs.getInt("id"));
				logger.debug(rs.getString("name"));
				logger.debug(rs.getString("username"));
				logger.debug(rs.getString("password"));
				logger.debug(rs.getLong("contact"));

			}

			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public MOrganizer addUser(String name, String userName, String password, long mobileNumber) {

		try {
			conn = DbConnection.getConnection();
			ps = conn.prepareStatement(
					"insert into organizer(name,username,password,contact) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, userName);
			ps.setString(3, password);
			ps.setLong(4, mobileNumber);
			ps.executeUpdate();
			//rs = ps.executeQuery();
			//conn.commit();

			logger.debug("user registered");
			//rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			logger.debug("SQL Exception occurred", e);
		} 
		return null;
	}

	@Override
	public MOrganizer updateUser(MOrganizer org) {
		return null;
	}

	@Override
	public MOrganizer deleteUser(MOrganizer org) {
		return null;
	}

	@Override
	public List<MOrganizer> findAll() {
		List<MOrganizer> orgList = new ArrayList<>();
		try {
			conn = DbConnection.getConnection();

			ps = conn.prepareStatement("select * from organizer");
			rs = ps.executeQuery();

			while (rs.next()) {
				orgList.add(getOrganizerFromResultSet(rs));
			}
			rs.close();
			ps.close();

		} catch (Exception e) {
			logger.error(e);
		}

		return orgList;
	}

	private MOrganizer getOrganizerFromResultSet(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String userName = rs.getString("username");
			String password = rs.getString("password");
			Long mobileNumber = rs.getLong("contact");
			MOrganizer org=new MOrganizer(id, name, userName, password, mobileNumber);
			logger.trace(org);
			return org;
		} catch (SQLException e) {
			logger.error(e);
		}
		return null;

	}

	@Override
	public boolean checkLogin(String userName,String password) {
		boolean stat=false;
		try {
			conn=DbConnection.getConnection();

			ps= conn.prepareStatement("select * from organizer where username=? and password=?");

			ps.setString(1, userName);
			ps.setString(2, password);

			rs=ps.executeQuery();
			stat=rs.next();

		} catch(NullPointerException e) {
			logger.error(e);
		}catch (SQLException e) {
			logger.error("SQL Exception",e);

		} 
		
	
		finally {
			try
			{
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();

			}
			catch(SQLException e)
			{
				logger.error(e);
			}
		}
		return stat;
	
	}
	
	


	}
