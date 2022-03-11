<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Customer Manager</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">--%>
<%--    <link rel="stylesheet" href="<c:url value="css/style.css" />">--%>
</head>
<body>
<div align="center" class="con">
    <h2>School Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/student_war_exploded/new">New Customer</a></h3>
    <h3><a href="/student_war_exploded/logout">Logout</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>E-mail</th>
            <th>Phone</th>
            <th>Language</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${teacherlist}" var="teacher">
            <tr>
                <td>${teacher.id}</td>
                <td>${teacher.firstName}</td>
                <td>${teacher.lastName}</td>
                <td>${teacher.email}</td>
                <td>${teacher.phone}</td>
                <td>${teacher.language}</td>
                <td>
                    <a href="/student_war_exploded/school/edit?id=${teacher.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/student_war_exploded/school/delete?id=${teacher.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
