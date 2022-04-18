package com.Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dbconn {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
			System.out.println("connection success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}

	public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
		if(conn!=null) {
			conn.close();
			conn=null;
		}
		 if(ps!=null) {
			ps.close();
			ps=null;
		}
		 if(rs!=null) {
			rs.close();
			rs=null;
		}
		
	}

	public static void closeConnectionRs(Connection conn, PreparedStatement ps) throws SQLException {
		if(conn!=null) {
			conn.close();
			conn=null;
		}
		 if(ps!=null) {
			ps.close();
			ps=null;
		}
		
		
	}

	public static void closeConnection(Connection con, ResultSet rs) throws SQLException {
		if(con!=null) {
			con.close();
			con=null;
		}
		
		 if(rs!=null) {
			rs.close();
			rs=null;
		}
		
	}
	
	


	
}
