<%--
  Created by IntelliJ IDEA.
  User: HOANG SON
  Date: 8/26/2019
  Time: 6:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register Form</h1>
<form action="/register" method="post">
    <div>
        Username <input type="text" name="username">
    </div>
    <div>
        Password <input type="password" name="password">
    </div>
    <div>
        Name <input type="text" name="name">
    </div>
    <div>
        Phone <input type="text" name="phone">
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>
</body>
</html>
