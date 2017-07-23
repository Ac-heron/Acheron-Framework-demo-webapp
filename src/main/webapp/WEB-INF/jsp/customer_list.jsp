<%--
  Created by IntelliJ IDEA.
  User: acheron
  Date: 19/07/2017
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Customer</title>
</head>
<body>
<h1>Customer List</h1>
<table>
    <tr>
        <th>name</th>
        <th>contact</th>
        <th>telephone</th>
        <th>email</th>
        <th>operate</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="#" >edit</a>
                <a href="#" >delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
