package com.insertController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.Dao.Dao;
import com.Dao.Daoimpl;
import com.LoginBean.Bean;


@WebServlet("/InsertController")
public class InsertController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bean bean1=new Bean();
		int id=Integer.parseInt(request.getParameter("userid"));
		bean1.setUserid(id);
		Dao d1=new Daoimpl();
		d1.delete(bean1);
		JOptionPane.showMessageDialog(null," record Deleted");
		response.sendRedirect("crud.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Bean bean=new Bean();
		
		bean.setFirstname(request.getParameter("firstname"));
		bean.setLastname(request.getParameter("lastname"));
		bean.setCity(request.getParameter("city"));
		bean.setMobile(request.getParameter("mobile"));
		bean.setEmail(request.getParameter("email"));
		bean.setDob(request.getParameter("dob"));
		bean.setAadhar(request.getParameter("aadhar"));
		bean.setGender(request.getParameter("gender"));
		bean.setState(request.getParameter("state"));
		bean.setPasssword(request.getParameter("password"));
		
		Dao d=new Daoimpl();
		
		String btn=request.getParameter("submit");
		
		
	if(btn.equals("save")) {
		d.insert(bean);
		JOptionPane.showMessageDialog(null," record got inserted");
		response.sendRedirect("index.jsp");
	}
		
		else if (btn.equals("update")) {
			bean.setUserid(Integer.parseInt(request.getParameter("userid")));
			d.update(bean);
			JOptionPane.showMessageDialog(null," record got Updated");
			response.sendRedirect("index.jsp");	
		}			
	}

}
