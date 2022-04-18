package com.Logindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Dbconnection.Dbconn;
import com.LoginBean.Bean;

public class Logindaoimpl implements LoginDao {

	@Override
	public boolean logindao(Bean bean2) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean isTrue=false;
		try {
			conn=Dbconn.getConnection();
			String sql="select dob,password from registration where dob=? and password=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, bean2.getDob());
			ps.setString(2, bean2.getPasssword());
			rs=ps.executeQuery();
			if(rs.next()) {
				isTrue=true;
			}
			else {
				bean2=null;
			   
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Dbconn.closeConnection(conn, ps, rs);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return isTrue;
	}

}
