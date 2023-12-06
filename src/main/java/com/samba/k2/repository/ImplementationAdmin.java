package com.samba.k2.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.samba.k2.dto.Admin;
import com.samba.k2.util.ConnectionUtil;

public class ImplementationAdmin implements AdminDAO{

	@Override
	public String saveAdmin(Admin admin) {
		int res=0;
		try {
			String query="INSERT INTO admin VALUES(?,?,?)";
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ps.setInt(1, admin.getId());
			ps.setString(2,admin.getUserName());
			ps.setString(3, admin.getPassword());
			 res=ps.executeUpdate();
			ConnectionUtil.getConnection().close();
			return res+"no of rows affected";
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Admin adminLogin(String userName, String password) {
		try {
		Admin admin=new Admin(userName,password);
		String query="SELECT userName='?',password='?' FROM admin";
		PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
		ResultSet set=ps.executeQuery();
		ps.setString(2, admin.getUserName());
		ps.setString(3, admin.getPassword());
		while(set.next()) {
			admin.setUserName(set.getString(2));
			admin.setPassword(set.getString(3));
		}
		boolean res=ps.execute();
		ConnectionUtil.getConnection().close();
	return admin;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
