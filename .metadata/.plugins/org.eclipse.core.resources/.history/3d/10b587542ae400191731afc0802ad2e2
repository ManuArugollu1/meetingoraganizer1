package com.Jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;



public class DbConnection {
	private static Connection conn=null;
	private static final Logger logger=Logger.getRootLogger();
	
	
	
	private DbConnection() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/organiser", "root", "system");
		
		}
		catch(SQLException e)
		{
			logger.fatal("Sql exception occurred",e);
		}
		catch(ClassNotFoundException e)
		{
			logger.fatal("class not found exception",e);
		}
	
		
	}


	public static Connection getConnection() throws SQLException
	{
		if(conn==null ||conn.isClosed())
		{
			new DbConnection();
		}
		return conn;
	}

}
