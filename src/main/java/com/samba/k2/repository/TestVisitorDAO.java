package com.samba.k2.repository;
import java.sql.Date;
import java.time.LocalDate;

import com.samba.k2.dto.Visitor;
public class TestVisitorDAO {
	public static void main(String[] args) {
//		Visitor visitor=new Visitor(5,"raju","raj@gmail.com","6787878778","2017-05-26","padma@87878",22,"female","marathallli-560037");
//		ImplementationVisitorDAO dao=new ImplementationVisitorDAO();
//		dao.saveVisitor(visitor);
//	//	System.out.println(visitor);
//		//System.out.println(dao.getVisitorLogin("samba@gmail.com","samba@123"));
//		
		ImplementationVisitorDAO iv=new ImplementationVisitorDAO();
		Date dob=null;
		dob=Date.valueOf(LocalDate.of(2000,6,21));
		
		Date.valueOf("2022-09-12");
		System.out.println(dob);
		
		Visitor visitor=new Visitor(3,"saaamba","saaamba@gmail.com","8778934086",dob,"saaamba@123",37,"fmaale","uap");
		System.out.println(iv.saveVisitor(visitor));
		System.out.println(iv.updateVisitor(visitor));
	}

}
