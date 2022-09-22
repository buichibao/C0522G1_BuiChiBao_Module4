<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/21/2022
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form:form action="loadding" method="post" modelAttribute="login">
         <fieldset>
           <label>Login</label>
            <table>
              <tr>
                <td>Account:</td>
                <td><form:input path="account"/></td>
              </tr>
              <tr>
                <td>PassWord:</td>
                <td><form:password path="password"/></td>
              </tr>
              <tr>
                <td><input type="submit" value="Login"></td>
              </tr>
            </table>
         </fieldset>
    </form:form>
  </body>
</html>
