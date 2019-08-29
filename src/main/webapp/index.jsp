<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Here</h1><br>
<%
String message=request.getParameter("message");
if(message!=null)
{
out.println(message);
}
%>
<form action="LoginServlet">
Email: <input type="text" name="email" required/><br>
<br>
Password: <input type="password" name="password" required/><br>
<br>
<button type="submit">Submit</button> 
<button type="reset">Reset</button>
</form>

</body>
</html>