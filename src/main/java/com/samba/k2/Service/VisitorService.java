package com.samba.k2.Service;

import java.util.List;

import com.samba.k2.dto.Visitor;

public interface VisitorService {
	public String saveVisitor(Visitor visitor);
	public String updateVisitor(Visitor visitor);
	public Visitor getVisitorById(int id);//register visitor
	public Visitor deleteVisitor(int id);//register visitor
	public Visitor  visitorLogin(String email,String password);
	public List<Visitor> getAllRegisteredVisitor();
	public List<Visitor> getAllValidVisitor();
	public Visitor getValidVisitorByid(int id);
	
	public List<Visitor> sortVisitorByName();
	public List<Visitor> sortVisitorByEmail();
	public List<Visitor> sortVisitorByAge();
	public List<Visitor> sortRegisteredVisitorByName();
	public List<Visitor> sortRegisteredVisitorByEmail();
	public List<Visitor> sortRegisteredVisitorByAge();

}
