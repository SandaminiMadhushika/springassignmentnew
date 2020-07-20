<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Registration Form</title>
</head>
<body>
<h2>User details</h2>
<table>
    <thead>
    <tr>
        <th>EID</th>
        <th>DID</th>
        <th>Name</th>
        <th>Edit column</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${emplist}" var="emp">
        <tr>
            <td>${emp.employeeId}</td>
            <td>${emp.departmentId}</td>
            <td>${emp.firstName}</td>
            <td><a href="edit?employeeId=<c:out value='${emp.employeeId}' />&departmentId=<c:out value='${emp.departmentId}' />">Edit</a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>