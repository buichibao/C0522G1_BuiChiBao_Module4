<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/17/2022
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="get" action="/convert">
      <input name="usd" type="number">
      <button type="submit">Convert</button>
    </form>
     <h5>Result :${result}</h5>
  </body>
</html>
