<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>�����Ƭ</title> 
  </head>
  <body>
  <a href="./Home.jsp">��ҳ</a>
  <form action="cardadddeal.jsp">
		
		<input type="text" name="add" placeholder="�������ַ" /><br /> 
		<input type="text" name="tel" placeholder="������绰" /><br /> 
		<input type="text" name="email" placeholder="����������" /><br /> 
		<input type="text" name="name" placeholder="����������" /><br /> 
		<input type="submit" value="ȷ��"  /> <input type="reset" name="���" />
	</form>
  </body>
</html>
