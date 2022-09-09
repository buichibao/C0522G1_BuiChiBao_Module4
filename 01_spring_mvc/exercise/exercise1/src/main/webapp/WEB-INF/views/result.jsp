<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/9/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <form action="/calculation" method="get">
    <input type="text" name="number">
    <button type="submit">Convert</button>
   </form>
    <h1>Result :${result}</h1>
</body>
</html>
