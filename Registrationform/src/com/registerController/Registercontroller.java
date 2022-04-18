package com.registerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.LoginBean.Bean;
import com.registerDao.RegisterDaoimpl;
import com.registerDao.Registerdao;

@WebServlet("/Registercontroller")
public class Registercontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bean rb=new Bean();
		rb.setFirstname(request.getParameter("firstname"));
		rb.setLastname(request.getParameter("lastname"));
		rb.setCity(request.getParameter("city"));
		rb.setMobile(request.getParameter("mobile"));
		rb.setEmail(request.getParameter("email"));
		rb.setDob(request.getParameter("dob"));
		rb.setAadhar(request.getParameter("aadhar"));
		rb.setGender(request.getParameter("gender"));
		rb.setState(request.getParameter("state"));
		rb.setPasssword(request.getParameter("password"));
		
		Registerdao rd=new RegisterDaoimpl();
		rd.add(rb);
		JOptionPane.showMessageDialog(null,"New record got inserted");
		response.sendRedirect("index.jsp");
	}

}
