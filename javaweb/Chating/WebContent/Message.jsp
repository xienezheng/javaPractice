<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="REFRESH" content="6;URL=message.jsp">

<script LANGUAGE="javaScript1.1">
function scrollWindows()
{
	this.scroll(0,65000);
	setTimeout('scrollWindows()',200);
	}
	scrollWindows();
	

</script>
<title>聊天室</title>
</head>


<%=application.getAttribute("words");%>
</html>