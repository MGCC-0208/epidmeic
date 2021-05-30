<%--
  Created by IntelliJ IDEA.
  User: 13041
  Date: 2021/5/30
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>印度疫情可视化</title>
    <style>
        table{

            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;

        }
        table thead th
        {
            background-color: #CCE8EB;
            width: 100px;
        }
        table tr:nth-child(odd)
        {
            background: #fff;
        }
        table tr:nth-child(even)
        {
            background: #F5FAFA;
        }


    </style>
</head>
<body>
<h1 align="center">${state}地区详细信息</h1>
<div>
<table class="table">
    <tr>
        <th>截至时间</th>
        <th>治愈数</th>
        <th>死亡数</th>
        <th>现存确诊</th>
    </tr>
    <c:forEach items="${datas}" var="data">
        <tr>
            <td>${data.date}</td>
            <td>${data.cured}</td>
            <td>${data.deaths}</td>
            <td>${data.confirmed}</td>
        </tr>
    </c:forEach>
</table>
</div>

</body>
</html>
