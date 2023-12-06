package com.samba.k2.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.samba.k2.dto.Visitor;
import com.samba.k2.util.ConnectionUtil;

public class ImplementationVisitorDAO implements VisitorDAO {

	@Override
	public String saveVisitor(Visitor visitor) {
	try {
		String query="INSERT INTO registered_visitor VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
		ps.setInt(1, visitor.getId());
		ps.setString(2, visitor.getName());
		ps.setString(3, visitor.getEmail());
		ps.setString(4, visitor.getPhoneNo());
		ps.setDate(5, visitor.getDob());
		ps.setString(6, visitor.getPassword());
		ps.setInt(7, visitor.getAge());
		ps.setString(8, visitor.getGender());
		ps.setString(9, visitor.getAddress());
		int res=ps.executeUpdate();
		ConnectionUtil.getConnection().close();
		return res+"rows of data stored";
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
		return null;
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		try {
			
			String query="UPDATE registered_visitor SET id=?,name=?,phone=?,dob=?,password=?,age=?,gender=?,address=?,age=?";//dynamic query->first query will execute in JVM then providing the data
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ps.setInt(1, visitor.getId());
			ps.setString(2, visitor.getName());
			ps.setString(3, visitor.getEmail());
			ps.setString(4, visitor.getPhoneNo());
			ps.setString(8, visitor.getGender());
			ps.setDate(5, visitor.getDob());
			ps.setString(7,visitor.getAddress() );
			ps.setString(6, visitor.getPassword());
			ps.setInt(9,visitor.getAge());
			
			int res=ps.executeUpdate();
			ConnectionUtil.getConnection().close();
			return res+"rows of data stored";
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
			return null;
	}

	@Override
	public Visitor getVisitorById(int id) {
		try {
			Visitor visitor =new Visitor();
			String query="SELECT * FROM registered_visitor WHERE id=?";// dynamic query->first query will execute in JVM then providing the data
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ps.setInt(1,id);
			ResultSet set=ps.executeQuery();
			while(set.next()) {
				visitor.setId(set.getInt(1));
				visitor.setName(set.getString(2));
				visitor.setEmail(set.getString(3));
				visitor.setPhoneNo(set.getString(4));
				visitor.setDob(set.getDate(5));
				visitor.setPassword(set.getString(6));
				visitor.setAge(set.getInt(7));
				visitor.setGender(set.getString(8));
				visitor.setAddress(set.getString(9));
				ConnectionUtil.getConnection().close();
				
				return visitor;
				
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Visitor visitorLogin(String email, String password) {
		try {
			Visitor visitor =new Visitor();
			
			String query="SELECT email='?',password='?' FROM registered_visitor";
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ResultSet set=ps.executeQuery();
			ps.setString(3, email);
			ps.setString(6,password);
			while(set.next()) {
				visitor.setEmail(set.getString(3));
				visitor.setPassword(set.getString(6));
				ConnectionUtil.getConnection().close();
				
				return visitor;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Visitor deleteVisitor(int id) {
		try {
			Visitor visitor=new Visitor();
			String query="DELETE FROM registered_visitor WHERE id=?";
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			ConnectionUtil.getConnection().close();
			return visitor;
		}catch(SQLException e) {
			e.printStackTrace();
		}
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
		try {
		Visitor visitor=new Visitor();
		String query="SELECT * FROM valid_visitor WHERE id=?";
			PreparedStatement ps=ConnectionUtil.getConnection().prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set=ps.executeQuery();
			while(set.next()) {
				visitor.setId(set.getInt(1));
				visitor.setName(set.getString(2));
				visitor.setEmail(set.getString(3));
				visitor.setPhoneNo(set.getString(4));
				visitor.setDob(set.getDate(5));
				visitor.setPassword(set.getString(6));
				visitor.setAge(set.getInt(7));
				visitor.setGender(set.getString(8));
				visitor.setAddress(set.getString(9));
				ConnectionUtil.getConnection().close();
				return visitor;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
