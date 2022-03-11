<%--
  Created by IntelliJ IDEA.
  User: othmane
  Date: 28‏/2‏/2022
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>Login</h1>
<div align="center">
    <h2>New Student</h2>
    <%--@elvariable id="student" type=""--%>
    <%--@elvariable id="teacher" type=""--%>
    <form:form action="login" method="POST" modelAttribute="admin">
        <table border="0" cellpadding="5">

            <tr>
                <td>Email : </td>
                <td><form:input path="email" /></td>
            </tr>

            <tr>
                <td>Password : </td>
                <td><form:input path="password" /></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" class="btn btn-primary" value="login"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>