<%--
  Created by IntelliJ IDEA.
  User: cungl
  Date: 9/13/2022
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: red">${masse}</h2>
<table class="table table-striped table-bordered">
    <tr class="bg-primary">
        <th>họ tên:</th>
        <th>Năm sinh:</th>
        <th>giới tính:</th>
        <th>quốc tịch:</th>
        <th>số hộ chiếu:</th>
        <th>Thông tin đi lại:</th>
        <th>số hiệu phương tiện:</th>
        <th>số ghế:</th>
        <th>ngày khởi hành:</th>
        <th>ngày kết thúc:</th>
        <th>tình trạng đi lại:</th>
    </tr>
    <c:forEach var="dec" items="${declarationList}">
        <tr>
            <td>${dec.name}</td>
            <td>${dec.birthday}</td>
            <td>${dec.gender}</td>
            <td>${dec.nationality}</td>
            <td>${dec.passportId}</td>
            <td>${dec.travelInformation}</td>
            <td>${dec.vehicleNumber}</td>
            <td>${dec.seats}</td>
            <td>${dec.departureDay}</td>
            <td>${dec.endDate}</td>
            <td>${dec.status}</td>
        </tr>
    </c:forEach>
</table
</body>
</html>
