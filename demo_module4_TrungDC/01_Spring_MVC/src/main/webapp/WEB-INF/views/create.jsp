<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 10/1/2022
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
  <form method="post" action="/save">
      <pre>ID            :<input type="number" name="id"></pre>
      <pre>Name          :<input type="text" name="name"></pre>
      <pre>Gender        :<input type="radio" name="gender" value="1"> Male <input type="radio" name="gender" value="0"> Famale</pre>
      <pre>Language      :<input type="checkbox" name="language" value="Java">JAVA  <input type="checkbox" name="language" value="C++"> C++<input type="checkbox" name="language" value="C"> C <input type="checkbox" name="language" value="PHP"> PHP</pre>
      <input type="submit" value="Create">
  </form>
</body>
</html>
