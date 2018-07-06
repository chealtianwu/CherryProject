<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ page import="java.sql.*" %>    
<%@ page import="com.baosight.bean.*" %>    
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
  
  <%   
  String username = request.getParameter("username");  
  String password1 = request.getParameter("password1");  
  String password2 = request.getParameter("password2");  
  String email = request.getParameter("email");  
  if(username==null||"".equals(username.trim())||password1==null||"".equals(password1.trim())||password2==null||"".equals(password2.trim())||!password1.equals(password2)){  
      //out.write("用户名或密码不能为空！");  
      System.out.println("用户名或密码不能为空！");  
      response.sendRedirect("register.jsp");  
      return;  
      //request.getRequestDispatcher("login.jsp").forward(request, response);  
  }  
  UserBean userBean = new UserBean();  
  boolean isExit = userBean.isExist(username);  
  if(!isExit){  
      userBean.add(username, password1, email);  
      System.out.println("注册成功，请登录！");  
      response.sendRedirect("login.jsp");  
      return;  
  }else{  
      System.out.println("用户名已存在！");  
      response.sendRedirect("register.jsp");  
      return;  
  }  
  %>  