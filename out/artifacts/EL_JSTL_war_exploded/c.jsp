<%@ page import="com.wjs.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wjs
  Date: 2020-09-23
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person=new Person();
    person.setName("wjs");
    person.setPhones(new String[]{"45431323","51151515151"});
    List<String> cities=new ArrayList<String>();
    cities.add("上海");
    cities.add("北京");
    cities.add("广州");
    person.setCity(cities);
    Map<String,Object>map=new HashMap<>();
    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    person.setMap(map);
    pageContext.setAttribute("person",person);

%>
输出person：${person}<br>
//如果不加的数组的下标记则输出的地址值
输出persond的name的属性值：${person.name}<br>
输出persond的phone的属性值：${person.phones}<br>
输出persond的phone的属性值：${person.phones[0]}<br>
输出persond的cities集合中的元素值：${person.city}<br>
输出persond的cities集合中的一个元素值：${person.city[1]}<br>
输出persond的map集合中的元素值：${person.map.key1}<br>
</body>
</html>
