<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	this is index jsp12
	<form:form method="GET" action="/test">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</form:form>
<%-- 	<%
		response.sendRedirect("/test");
	%> --%>
	<form action="/test" method="POST">
		<input type="submit" value="전송" name="btn"/>
	</form>
</body>
</html>