<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<body>
<% request.setCharacterEncoding("UTF-8");
String mywords=request.getParameter("message");
Object o=application.getAttribute("msg");
String str1=(String)o;
application.log(mywords);
if(mywords!=null)
{
	int len_mywords=mywords.length();
	int flag=1;
	application.log(""+len_mywords);
	for(int i=0;i<len_mywords;i++)
	{
		if(mywords.charAt(i)=='<')
		{
			flag=0;
		}
		if(flag==1)
		{
			
			Object obj=application.getAttribute("words");
			if(obj==null)
			{
				application.setAttribute("words","obj.toString()+<br>");
			}
		}
	}
}
%>
<head>
<form action="talk.jsp"method="post">
<input type="text"name="message"size="50">
<input type="submit"value="发送">
</form>
</head>
</body>
</html>