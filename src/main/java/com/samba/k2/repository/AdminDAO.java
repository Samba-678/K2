package com.samba.k2.repository;

import com.samba.k2.dto.Admin;

public interface AdminDAO {
	public String saveAdmin(Admin admin);
	public Admin adminLogin(String userName,String password);

}
