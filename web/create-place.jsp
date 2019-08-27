<%--
  Created by IntelliJ IDEA.
  User: HOANG SON
  Date: 8/26/2019
  Time: 7:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Place</title>
</head>
<body>
<h1>Register Form</h1>
<form action="/create-place" method="post">
    <div>
        Image <input type="text" name="image">
    </div>
    <div>
        Name <input type="text" name="name">
    </div>
    <div>
        Province <input type="text" name="province">
    </div>
    <div>
        Rate <input type="number" name="rate">
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>
</body>
</html>
