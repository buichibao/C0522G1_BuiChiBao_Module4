<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 10/1/2022
  Time: 3:22 PM
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
   <form action="/search" method="get">
       <input type="text" name="name">
       <input type="submit" value="Search">
   </form>
   <a href="/create" type="button" class="btn btn-info">Add student</a>
   <h6 style="color: brown">${mess}</h6>
   <table class="table table-striped">
       <tr>
           <th>ID</th>
           <th>Name</th>
           <th>Gender</th>
           <th>Language</th>
       </tr>
       <c:forEach var="student" items="${studentList}">
           <tr>
           <td>${student.id}</td>
           <td>${student.name}</td>
           <c:if test="${student.gender==1}">
               <td>Male</td>
           </c:if>
           <c:if test="${student.gender==0}">
               <td>Female</td>
           </c:if>

           <c:forEach var="languge" items="${student.language}">
               <td>${languge}</td>
           </c:forEach>

           </tr>
       </c:forEach>
   </table>
</body>
</html>
