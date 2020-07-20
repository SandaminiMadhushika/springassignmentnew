<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User View Form</title>
</head>
<body>
<h2>Search users by name</h2>
<table>
    <thead>
    <tr>
        <th>first Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Employee Id</th>
        <th>Department Id</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${employee}" var="emp">
        <tr>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.age}</td>
            <td>${emp.employeeId}</td>
            <td>${emp.departmentId}</td>


        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>