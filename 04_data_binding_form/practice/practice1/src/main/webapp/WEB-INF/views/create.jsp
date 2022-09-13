<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/13/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create</title>
</head>
<body>
   <h3>Enter the Employee</h3>
<form:form method="post" action="list" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">ID</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">Contact Number</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr><td><input type="submit" value="Submit"></td></tr>
    </table>
</form:form>
</body>
</html>
