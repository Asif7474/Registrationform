package com.registerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Dbconnection.Dbconn;
import com.LoginBean.Bean;

public class RegisterDaoimpl implements Registerdao{

	@Override
	public void add(Bean rb) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=Dbconn.getConnection();
			String query="insert into registration (firstname,lastname,city,mobile,email,dob,aadhar,gender,state,password)values(?,?,?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(query);
			ps.setString(1, rb.getFirstname());
			ps.setString(2, rb.getLastname());
			ps.setString(3, rb.getCity());
			ps.setString(4, rb.getMobile());
			ps.setString(5, rb.getEmail());
			ps.setString(6, rb.getDob());
			ps.setString(7, rb.getAadhar());
			ps.setString(8, rb.getGender());
			ps.setString(9, rb.getState());
			ps.setString(10, rb.getPasssword());
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

}
