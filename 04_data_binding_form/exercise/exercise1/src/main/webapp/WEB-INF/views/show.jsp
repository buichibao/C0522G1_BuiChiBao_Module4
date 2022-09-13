<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/13/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Setting Email</h1>
  <form:form action="/save" method="post" modelAttribute="listSetting">
      <table>
          <tr>
              <td>Language :</td>
              <td><form:select path="languages" items="${listLanguage}"/></td>
          </tr>
          <tr>
              <td>Page Size:</td>
              <td><form:select path="pageSize" items="${listSize}"/></td>
          </tr>
          <tr>
              <td>Spams Filter :</td>
              <td><form:checkbox path="spamsFilter" value="1"/></td>
          </tr>
          <tr>
              <td>Signature :</td>
              <td><form:input path="signature"/></td>
          </tr>
          <tr>
             <td><button type="submit">SUBMIT</button></td>
          </tr>
      </table>
  </form:form>
           <button><a href="/">CANCEL</a></button>
</body>
</html>
