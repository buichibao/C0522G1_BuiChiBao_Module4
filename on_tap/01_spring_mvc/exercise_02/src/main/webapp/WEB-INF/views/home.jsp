<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/17/2022
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/change" method="get">
      <input name="eng" type="text">
      <button type="submit">Change</button>
  </form>
  <h3>${result}</h3>
</body>
</html>
