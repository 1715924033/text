<%--
  Created by IntelliJ IDEA.
  User: qiyuegai
  Date: 2019-03-22
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.address}</td>
            <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></td>
            <td>${user.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
