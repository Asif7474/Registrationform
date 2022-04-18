package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Dbconnection.Dbconn;
import com.LoginBean.Bean;


public class Daoimpl implements Dao{

	@Override
	public void insert(Bean bean) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=Dbconn.getConnection();
			ps=conn.prepareStatement("insert into registration(firstname,lastname,city,mobile,email,dob,aadhar,gender,state,password)values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, bean.getFirstname());
			ps.setString(2, bean.getLastname());
			ps.setString(3, bean.getCity());
			ps.setString(4, bean.getMobile());
			ps.setString(5, bean.getEmail());
			ps.setString(6, bean.getDob());
			ps.setString(7, bean.getAadhar());
			ps.setString(8, bean.getGender());
			ps.setString(9, bean.getState());
			ps.setString(10, bean.getPasssword());
			ps.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Dbconn.closeConnectionRs(conn, ps);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	@Override
	public List<Bean> fetch() {
		Connection con=null;
		ResultSet rs=null;
		List<Bean>list=new ArrayList<Bean>();
		try {
			con=Dbconn.getConnection();
			String sql="select * from registration";
			PreparedStatement ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Bean bean=new Bean();
				bean.setUserid(Integer.parseInt(rs.getString("userid")));
				bean.setFirstname(rs.getString("firstname"));
				bean.setLastname(rs.getString("lastname"));
				bean.setCity(rs.getString("city"));
				bean.setMobile(rs.getString("mobile"));
				bean.setEmail(rs.getString("email"));
				bean.setAadhar(rs.getString("aadhar"));
				bean.setDob(rs.getString("dob"));
				bean.setGender(rs.getString("gender"));
				bean.setState(rs.getString("state"));
				bean.setPasssword(rs.getString("password"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				Dbconn.closeConnection(con,  rs);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void delete(Bean bean) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=Dbconn.getConnection();
			ps=conn.prepareStatement("delete from registration where userid=?");
			ps.setInt(1, bean.getUserid());
			ps.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				Dbconn.closeConnectionRs(conn, ps);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	@Override
	public void update(Bean bean) {
		Connection con=null;
		PreparedStatement ps=null;
		
		
		try {
			con=Dbconn.getConnection();
			String query= "update registration set firstname=?,lastname=?,city=?,mobile=?,email=?,dob=?,aadhar=?,gender=?,state=?,password=? where userid=?";
			ps=con.prepareStatement(query);
			
			
			ps.setString(1, bean.getFirstname());
			ps.setString(2, bean.getLastname());
			ps.setString(3, bean.getCity());
			ps.setString(4, bean.getMobile());
			ps.setString(5, bean.getEmail());
			ps.setString(6, bean.getDob());
			ps.setString(7, bean.getAadhar());
			ps.setString(8, bean.getGender());
			ps.setString(9, bean.getState());
			ps.setString(10, bean.getPasssword());
			ps.setInt(11, bean.getUserid());
			
			
			
			ps.executeUpdate();
			
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Dbconn.closeConnectionRs(con, ps);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	} 

}
