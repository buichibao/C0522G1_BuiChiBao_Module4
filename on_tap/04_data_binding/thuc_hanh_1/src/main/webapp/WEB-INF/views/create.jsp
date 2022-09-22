<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/21/2022
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <form:form method="post" modelAttribute="employee" action="add">
      <table>
           <tr>
               <td>ID</td>
               <td><form:input path="id"/></td>
           </tr>
           <tr>
               <td>Name</td>
               <td><form:input path="name"/></td>
           </tr>
          <tr>
              <td>ConTractName</td>
              <td><form:input path="contactNumber"/></td>
          </tr>
          <tr><input type="submit" value="SUBMIT"/></tr>
      </table>
  </form:form>
</body>
</html>
