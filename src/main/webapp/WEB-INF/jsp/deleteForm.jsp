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
        <th>Delete column</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${empdeletelist}" var="empdelete">
        <tr>
            <td>${empdelete.employeeId}</td>
            <td>${empdelete.departmentId}</td>
            <td><a href="delete?employeeId=<c:out value='${empdelete.employeeId}' />&departmentId=<c:out value='${empdelete.departmentId}' />">Delete</a>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>