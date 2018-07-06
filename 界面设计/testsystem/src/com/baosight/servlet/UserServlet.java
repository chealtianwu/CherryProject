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
		if("login".equals(method)){//登录
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if(username==null||"".equals(username.trim())||password==null||"".equals(password.trim())){
				System.out.println("用户名或密码不能为空！");
				response.sendRedirect("login.jsp");
				return;
			}
			UserBean userBean = new UserBean();
			boolean isValid = userBean.valid(username,password);
			if(isValid){
				System.out.println("登录成功！");
				request.getSession().setAttribute("username",username);
				response.sendRedirect("welcome.jsp");
				return;
		}
			else{
				System.out.println("用户名或密码错误！");
				response.sendRedirect("login.jsp");
				return;
				}
			}
		else if("logout".equals(method)){//退出登录
			System.out.println("退出登录");
			request.getSession().removeAttribute("username");
			response.sendRedirect("login.jsp");
			return;
		}
	}
}
