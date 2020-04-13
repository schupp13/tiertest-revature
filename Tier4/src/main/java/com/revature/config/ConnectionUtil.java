
package com.revature.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class ConnectionUtil {

//	"jdbc:postgresql://database-1.ckje1iono0ve.us-east-2.rds.amazonaws.com:5432/Teir3",
//	"pooker",
//	"password"
	private static String url=System.getenv("url");
	private static String username=System.getenv("username");
	private static String password=System.getenv("password");
	
	
	public static Connection connect() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
}