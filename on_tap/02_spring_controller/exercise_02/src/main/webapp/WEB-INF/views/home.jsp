<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/18/2022
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Calculator</h1>
<form action="/calculation" method="get">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <br><br>
    <button name="opera" value="add">Addition(+)</button>
    <button name="opera" value="sub">Subtraction(-)</button>
    <button name="opera" value="mul">Multiplication(X)</button>
    <button name="opera" value="div">Division(/)</button>
</form>
<h6>Result:${result}</h6>
</body>
</html>
