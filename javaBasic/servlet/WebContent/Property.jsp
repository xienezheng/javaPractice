<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="JavaBean5.Student" scope="request"></jsp:useBean>
<jsp:setProperty property="age" name="student" value="20"/>
<% out.println(student.sum()); %>
the name is:<jsp:getProperty property="name" name="student"/>
</body>
</html>