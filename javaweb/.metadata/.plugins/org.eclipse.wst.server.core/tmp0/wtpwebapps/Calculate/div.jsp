<%@ page language="java" import="java.lang.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
double one1,two1,thr=1.0;
double b=-1.0;
String one,two;
one=request.getParameter("one");
two=request.getParameter("two");
one1=Integer.parseInt(one);
two1=Integer.parseInt(two);
b=Math.abs(b);
out.println(b);
thr=Math.pow(one1, two1);
out.println(thr);
out.println(one1+"乘以"+two1+"等于"+thr);
%>
</body>
</html>