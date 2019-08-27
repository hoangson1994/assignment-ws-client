<%@ page import="mypackage.Place" %><%--
  Created by IntelliJ IDEA.
  User: HOANG SON
  Date: 8/26/2019
  Time: 7:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Place</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<% Place[] listPlaces =  (Place[]) request.getAttribute("colNames");%>
<table>
    <tr>
        <th>#</th>
        <th>Image</th>
        <th>Name</th>
        <th>Province</th>
        <th>Rate</th>
    </tr>
    <c:forEach items="${listPlaces}" var="place">
        <tr>
            <td>${place.id}</td>
            <td>${place.image}</td>
            <td>${place.name}</td>
            <td>${place.province}</td>
            <td>${place.rate}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
