<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索结果</title>
</head>
<body>
<a href="./Home.jsp">首页</a></br>
<table>
<tr>
<td>名字</td><td>电话</td><td>地址</td><td>e—mail</td>
</tr>
<c:forEach items="${search}" var="u">
<tr>
<td>${u.name}</td>
<td>${u.tel}</td>
<td>${u.add}</td>
<td>${u.email}</td>
<td><a href="../AddCollection?cardid=${u.id}">添加</a></td>
</tr>
</c:forEach>


</table>
</body>
</html>