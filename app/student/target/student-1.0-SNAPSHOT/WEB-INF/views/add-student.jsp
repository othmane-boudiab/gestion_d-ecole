<%--
  Created by IntelliJ IDEA.
  User: othmane
  Date: 17‏/2‏/2022
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add student</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <div class="col-md-offset-2 col-md-7">
    <h3 class="text-center">add student</h3>
    <div class="panel panel-info">
      <div class="panel-heading">
        <div class="panel-title">Add Customer</div>
      </div>
      <div class="panel-body">
        <form:form action="saveCustomer" cssClass="form-horizontal"
                   method="post" modelAttribute="customer">

          <!-- need to associate this data with customer id -->
          <form:hidden path="id" />

          <div class="form-group">
            <label for="firstname" class="col-md-3 control-label">First
              Name</label>
            <div class="col-md-9">
              <form:input path="firstName" cssClass="form-control" />
            </div>
          </div>
          <div class="form-group">
            <label for="lastname" class="col-md-3 control-label">Last
              Name</label>
            <div class="col-md-9">
              <form:input path="lastName" cssClass="form-control" />
            </div>
          </div>

          <div class="form-group">
            <label for="email" class="col-md-3 control-label">Email</label>
            <div class="col-md-9">
              <form:input path="email" cssClass="form-control" />
            </div>
          </div>

          <div class="form-group">
            <!-- Button -->
            <div class="col-md-offset-3 col-md-9">
              <form:button cssClass="btn btn-primary">Submit</form:button>
            </div>
          </div>

        </form:form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
