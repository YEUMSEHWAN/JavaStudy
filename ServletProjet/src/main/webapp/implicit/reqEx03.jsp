<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 목록 출력</title>
</head>
<body>
<%
	Enumeration enumData = request.getHeaderNames();

	while(enumData.hasMoreElements()){
		String headerName = (String)enumData.nextElement();
		String headervalue = request.getHeader(headerName);
%>

<%=headerName %> = <%=headervalue %><br><br>

<% } %>

</body>
</html>