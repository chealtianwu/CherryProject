package com.baosight.servlet; 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baosight.bean.UserBean;

public class UserServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String method = request.getParameter("method");
		if("login".equals(method)){//��¼
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if(username==null||"".equals(username.trim())||password==null||"".equals(password.trim())){
				System.out.println("�û��������벻��Ϊ�գ�");
				response.sendRedirect("login.jsp");
				return;
			}
			UserBean userBean = new UserBean();
			boolean isValid = userBean.valid(username,password);
			if(isValid){
				System.out.println("��¼�ɹ���");
				request.getSession().setAttribute("username",username);
				response.sendRedirect("welcome.jsp");
				return;
		}
			else{
				System.out.println("�û������������");
				response.sendRedirect("login.jsp");
				return;
				}
			}
		else if("logout".equals(method)){//�˳���¼
			System.out.println("�˳���¼");
			request.getSession().removeAttribute("username");
			response.sendRedirect("login.jsp");
			return;
		}
	}
}
