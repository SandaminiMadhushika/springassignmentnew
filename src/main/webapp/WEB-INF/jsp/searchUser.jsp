<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee display form</title>
</head>
<body>
<div align="center">
    <h2>Search User Name</h2>
    <%--@elvariable id="employee" type="com.hms.employee.employeemanagement.model.Employee"--%>
    <form method="post"  action="/viewEmp">
        <input  type="text" placeholder="Search By Name" aria-label="Search"  name="firstName" id="firstName">
        <button type="submit">Search</button>
    </form>
</div>
</body>
</html>