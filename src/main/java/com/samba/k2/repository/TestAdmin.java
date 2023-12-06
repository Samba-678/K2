package com.samba.k2.repository;
import com.samba.k2.dto.Admin;
public class TestAdmin {
public static void main(String[] args) {
	Admin admin=new Admin(55,"ramaa","raama@123");
	
	ImplementationAdmin dao=new ImplementationAdmin();
	dao.saveAdmin(admin);
	//dao.adminLogin("sam","sam@123");
}
}
