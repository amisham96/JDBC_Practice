package com.myapp.utility.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.myapp.utility.DBConnection;

public class DBConnectionImpl implements DBConnection {

	static Connection myConnection = null;

	@Override
	public Connection createConnection() {
		// TODO Auto-generated method stub
		String db_url = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "Welcome@123";
		if (myConnection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				myConnection = DriverManager.getConnection(db_url, username, password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myConnection;
	}

	@Override
	public String closeConnection() {
		// TODO Auto-generated method stub
		String result = "";
		try {
			if(myConnection != null && !myConnection.isClosed()) {
				result = "Connection is not opened yet.";
			}else {
				try {
					myConnection.close();
					result = "Connection close successfully";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
