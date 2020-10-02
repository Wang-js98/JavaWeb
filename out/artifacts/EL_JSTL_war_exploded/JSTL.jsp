<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wjs
  Date: 2020-09-23
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
//使用JSTL标签库之前要导入jar包
//set标签用来往域对象中保存数据
//域对象.steAttribute（key，value）   page表示PageContext域  request和别的表示别的
<%--<c:set scope="page" var="abc" value="wjs"></c:set>--%>


//test表示判断的条件  （用EL表达式输出）
<%--<c:if test=""></c:if>--%>

<%--<c:choose/><c:when test=""/> <c:otherwise/>--%>
<%--注意点：1.标签里不能使用html注释
2.when标签的父标签一定是choos--%>
<%--
<% request.setAttribute("height",178);%>
<c:choose>
    <c:when test="${requestScope.height > 190}"></c:when>
    <h2>小巨人</h2>
    <c:when test="${requestScope.height > 180}"></c:when>
    <h2>小565</h2>
    <c:when test="${requestScope.height > 170}"></c:when>
    <h2>666</h2>
</c:choose>
--%>


</body>
</html>
