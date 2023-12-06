package com.samba.k2.dto;

import java.sql.Date;

public class Visitor {
	private int id;
	private String name;
	private String email;
	private String phoneNo;
	private String gender;
	private Date dob;
	private String address;
	private String password;
    private int age;
	public Visitor(int id, String name, String email, String phoneNo, Date dob2, String password, int age,
			String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dob = dob2;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
public Visitor() {
		// TODO Auto-generated constructor stub
	}
	//	public Visitor(int id2, String name2, String email2, String phoneNo2, String gender2, String string, int i,//doughttt
//			String password2, String string2) {
//		// TODO Auto-generated constructor stub
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
		public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", gender="
				+ gender + ", dob=" + dob + ", address=" + address + ", password=" + password + "]";
	}

}
