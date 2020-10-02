<%--
  Created by IntelliJ IDEA.
  User: wjs
  Date: 2020-09-23
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
</head>
<body>
<% request.setAttribute("key","wjs");  %>
表达式输出key<%=request.getAttribute("key")%>
EL表达式输出key${key}
</body>
</html>
