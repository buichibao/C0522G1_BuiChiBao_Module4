<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/21/2022
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   Weclcome ${user.name}
    <form:form>
      <table>
        <tr>
          <td>account</td>
            <td>${user.account}</td>
        </tr>
          <tr>
              <td>password</td>
              <td>${user.password}</td>
          </tr>
          <tr>
              <td>name</td>
              <td>${user.name}</td>
          </tr>
          <tr>
              <td>email</td>
              <td>${user.age}</td>
          </tr>
          <tr>
              <td>age</td>
              <td>${user.email}</td>
          </tr>
      </table>
    </form:form>
</body>
</html>
