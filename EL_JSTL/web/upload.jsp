<%--
  Created by IntelliJ IDEA.
  User: wjs
  Date: 2020-09-23
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>头像上传</title>
</head>
<body>
<form action="http://localhost:8080/EL_JSTL/uploadServlet" method="post"enctype="multipart/form-data">
    用户名：<input type="text" name="username"><br>
    头像:<input type="file" name="photo">


    <input type="submit" value="上传">

</form>
</body>
</html>
