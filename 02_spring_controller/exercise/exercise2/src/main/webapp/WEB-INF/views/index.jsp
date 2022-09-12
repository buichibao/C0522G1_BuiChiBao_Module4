<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/12/2022
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/convert">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <br>
    <br>
    <button type="submit" name="opera" value="add">Addition(+)</button>
    <button type="submit" name="opera" value="sub">Subtraction(-)</button>
    <button type="submit" name="opera" value="mul">Multiplication(*)</button>
    <button type="submit" name="opera" value="div">Division(/)</button>
  </form>
  <h3>Result : ${result}</h3>
  </body>
</html>
