<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'emp_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body style="text-align: center;">
  	<table width="80%" border="1" cellpadding="2" cellspacing="0">
  			<tr>
  				<th>EMPNO</th>
  				<th>ENAME</th>
				<th>JOB</th>
  				<th>MGR</th>
  				<th>HIREDATE</th>
  				<th>SAL</th>
  				<th>COMM</th>
  				<th>DEPTNO</th>
  			</tr>
  			<c:forEach items="${emps}" var="emp">
  				<tr>
  					<td>${emp.empno}</td>
  					<td>${emp.ename}</td>
  					<td>${emp.job}</td>
  					<td>${emp.mgr}</td>
  					<td>${emp.hiredate}</td>
  					<td>${emp.sal}</td>
  					<td>${emp.comm}</td>
  					<td>${emp.deptno}</td>
  				</tr>
  				
  			</c:forEach>
 </table>
  </body>
  
</html>