<%@page import="dao.StudentDao"%>
<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		StudentDao dao=new StudentDao();
		List<Student> students=dao.getAllStudent();
	%>
	<table>
		<caption>Data table</caption>
	</table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
	</tr>
	<tr>
	<%for(Student student:students){ %>
	</tr>
	<tr>
	<td><%= student.getStudId() %>></td>
	<td><%= student.getStudName() %>></td>
	<td><%= student.getStudEmail() %>></td>
	</tr>
</body>
</html>