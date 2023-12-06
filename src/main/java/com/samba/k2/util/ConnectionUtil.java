package com.samba.k2.util;

import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConnectionUtil {

	public static Connection getConnection() {
			Connection connection=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/k2_m11";
				FileInputStream stream=new FileInputStream("mydbinfo.properties");
				 
				Properties pro=new Properties();
				pro.load(stream);
				connection =DriverManager.getConnection(url, pro);
				
			}catch(ClassNotFoundException|SQLException|IOException e) {
				e.printStackTrace();
			}
		
		
		return connection;
	}

}
