<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/17/2022
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form method="get" action="/choose">
    <input type="checkbox" name="choose" value="lettuce">lettuce
    <input type="checkbox" name="choose" value="tomato">tomato
    <input type="checkbox" name="choose" value="mustard">mustard
    <input type="checkbox" name="choose" value="sprouts">sprouts
    <br>
    <button type="submit">Save</button>
  </form>
  <h6>Result:
    <c:forEach var="result" items="${resultList}">
      ${result} ,
    </c:forEach>
    </h6>
  </body>
</html>
