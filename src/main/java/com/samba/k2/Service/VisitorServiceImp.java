package com.samba.k2.Service;

import java.util.List;

import com.samba.k2.dto.Visitor;
import com.samba.k2.repository.ImplementationVisitorDAO;
import com.samba.k2.util.AES;
import com.samba.k2.util.AppConstants;

public class VisitorServiceImp implements VisitorService {
	private ImplementationVisitorDAO dao;
	{
		dao=new ImplementationVisitorDAO();
	}

	@Override
	public String saveVisitor(Visitor visitor) {
		String encEmail=AES.encrypt(visitor.getEmail(), AppConstants.SECRET_KEY);
		String encPhone=AES.encrypt(visitor.getPhoneNo(), AppConstants.SECRET_KEY);
		String encAddress=AES.encrypt(visitor.getAddress(), AppConstants.SECRET_KEY);
		String encPassword=AES.encrypt(visitor.getPassword(), AppConstants.SECRET_KEY);
		visitor.setEmail(encEmail);
		visitor.setPhoneNo(encPhone);
		visitor.setAddress(encAddress);
		visitor.setPassword(encPassword);
		
		return dao.saveVisitor(visitor);
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorById(int id) {
		Visitor visitor=dao.getValidVisitorByid(id);
		visitor.setEmail(AES.decrypt(visitor.getEmail(), AppConstants.SECRET_KEY));
		visitor.setPhoneNo(AES.decrypt(visitor.getPhoneNo(), AppConstants.SECRET_KEY));
		visitor.setAddress(AES.decrypt(visitor.getAddress(), AppConstants.SECRET_KEY));
		visitor.setPassword(AES.decrypt(visitor.getPassword(), AppConstants.SECRET_KEY));
		return visitor;
	}

	@Override
	public Visitor deleteVisitor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor visitorLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getAllRegisteredVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getAllValidVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getValidVisitorByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortVisitorByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortVisitorByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortVisitorByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortRegisteredVisitorByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortRegisteredVisitorByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> sortRegisteredVisitorByAge() {
		// TODO Auto-generated method stub
		return null;
	}

}
