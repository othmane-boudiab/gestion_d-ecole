<%--
  Created by IntelliJ IDEA.
  User: othmane
  Date: 17‏/2‏/2022
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

    <title>new student</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<%--    <link rel="stylesheet" href="">--%>
</head>
<body>

<div align="center">
    <h2>New Student</h2>
    <%--@elvariable id="student" type=""--%>
    <%--@elvariable id="teacher" type=""--%>
    <form:form action="save" method="POST" modelAttribute="teacher">
        <table border="0" cellpadding="5">
            <tr>
                <td>First Name: </td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Phone: </td>
                <td><form:input path="phone" /></td>
            </tr>
            <tr>
                <td>Language: </td>
                <td><form:input path="language" /></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" class="btn btn-primary" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>

</html>
