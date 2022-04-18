package com.Logincontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

import com.LoginBean.Bean;
import com.Logindao.LoginDao;
import com.Logindao.Logindaoimpl;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bean bean=new Bean();
		bean.setDob(request.getParameter("dob"));
		bean.setPasssword(request.getParameter("password"));
		
		LoginDao d=new Logindaoimpl();
		if(d.logindao(bean)) {
			JOptionPane.showMessageDialog(null, "LoGin success ");
		response.sendRedirect("crud.jsp");
		}else {
			JOptionPane.showMessageDialog(null, "Login failed.","Alert",JOptionPane.WARNING_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "LoGin Failed");
			response.sendRedirect("login.jsp");
		}
	}

}
