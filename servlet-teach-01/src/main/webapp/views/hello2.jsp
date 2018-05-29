<%--
  Created by IntelliJ IDEA.
  User: avrabie
  Date: 5/3/2018
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome to HelloWorld  v2.0</h1>
<form method="GET">
    First Name: <input type = "text" name = "first_name">
    <br />
    Last Name: <input type = "text" name = "last_name" value="<%= request.getParameter("last_name")%>"/>
    <input type = "submit" value = "Submit" />
</form>
</body>
</html>
