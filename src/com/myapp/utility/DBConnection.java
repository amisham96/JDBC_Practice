package com.myapp.utility;

import java.sql.Connection;

public interface DBConnection {

	Connection createConnection();

	String closeConnection();

}
