<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/13/2022
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<html>
<head>
    <title>List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>

<h4 style="color: red">${message}</h4>
<table class="table table-success table-striped">

    <tr>
        <th>STT</th>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
        <th>EDIT</th>
    </tr>

    <c:forEach varStatus="stt" var="setting" items="${listSetting}">
        <tr>
            <td>${stt.count}</td>
            <td>${setting.languages}</td>
            <td>${setting.pageSize}</td>
            <td>${setting.spamsFilter}</td>
            <td>${setting.signature}</td>
            <td>
                <button class="btn btn-danger"><a href="update?id=${setting.id}">EDIT</a></button>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
