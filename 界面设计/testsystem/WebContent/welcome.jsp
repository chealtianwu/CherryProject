<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>My JSP 'welcom.jsp' starting page</title>  
      
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->  
  </head>  
    
  <body>  
    <table>  
        <tr>  
            <td><img src="images/logo4.png" />  
            </td>  
            <td><img src="images/logo2.png" height="90" />  
            </td>  
        </tr>  
        <tr>  
            <td colspan="2"><hr />  
            </td>  
        </tr>  
        <tr>  
            <td>  
                <table>  
                    <tr>  
                        <td><a>主菜单</a>  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><a>修改试题</a>  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><a>查看答卷</a>  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><a>查看得分</a>  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><a>查看考试情况</a>  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><a>关于本系统</a>  
                        </td>  
                    </tr>  
                </table></td>  
            <td>  
                <form action="loginout.jsp" method="post">  
                    <table>  
                        <tr>  
                            <td colspan="2">登录成功!</td>  
                        </tr>  
                        <tr>  
                            <td>欢迎您，我亲爱的主人</td>  
                            <td>${username }</td>  
                        </tr>  
                        <tr>  
                            <td colspan="2"><input type="submit" value="退出" /></td>  
                        </tr>  
                    </table>  
                </form></td>  
        </tr>  
    </table>  
</body>  
</html>  