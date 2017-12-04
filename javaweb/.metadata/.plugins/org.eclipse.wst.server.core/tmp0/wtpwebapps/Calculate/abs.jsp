<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="abs.jsp"method="post">
<input type="radio"name="onlyone"value="苹果">苹果<br>
<input type="radio"name="onlyone"value="梨">梨<br>
<input type="radio"name="onlyone"value="xigua">西瓜<br>
<input type="submit"value="提交">
</form>
<%request.setCharacterEncoding("utf-8"); //解决汉语，解决math
String s=request.getParameter("onlyone");
out.println(s);%>
</body>
</html>