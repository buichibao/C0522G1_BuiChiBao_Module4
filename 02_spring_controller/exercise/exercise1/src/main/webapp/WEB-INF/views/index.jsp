<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/12/2022
  Time: 11:16 AM
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
  <form action="save">
    <input type="checkbox" name="choose" value="lettuce">Lettuce
    <input type="checkbox" name="choose" value="tomato">Tomato
    <input type="checkbox" name="choose" value="mustard">Mustard
    <input type="checkbox" name="choose" value="sprouts">Sprouts

    <p><button type="submit">Save</button></p>
  </form>
  <h3>Result :
     <c:forEach items="${result}" var="str">
        ${str}<br>
     </c:forEach>
  </h3>
  </body>
</html>
