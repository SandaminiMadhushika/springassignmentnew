<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employees display form</title>
</head>
<body>
<div align="center">
    <h2>User Registration</h2>
    <%--@elvariable id="employee" type="com.hms.employee.employeemanagement.model.Employee"--%>
    <form:form action="register" method="post" modelAttribute="employee">
        <form:input type="text" name="firstName"
                    placeholder="Enter first name" path="firstName"/><br/>

        <form:input type="text" name="lastName"
                    placeholder="Enter last name" path="lastName"/><br/>
        <form:input type="text" name="email"
                    placeholder="Enter email" path="email"/><br/>

        <form:input type="text" name="age"
                    placeholder="Enter age" path="age"/><br>


        <form:input type="text" name="designation"
                    placeholder="Enter designation" path="designation"/><br/>


        <form:input type="text" name="gender"
                    placeholder="Enter gender" path="gender"/><br/>


        <form:input type="text" name="address"
                    placeholder="Enter eaddress" path="address"/><br/>


        <form:input type="text" name="mobileNumber"
                    placeholder="Enter mobileNumber" path="mobileNumber"/><br/>




        <form:input type="text" name="factionId"
                    placeholder="Enter factionId" path="factionId"/><br/>


        <form:input type="text" name="subId"
                    placeholder="Enter subId" path="subId"/><br/>


        <form:input type="text" name="nic"
                    placeholder="Enter nic" path="nic"/><br/>




        <form:input type="text" name="departmentId"
                    placeholder="Enter departmentId" path="departmentId"/><br/>


        <form:input type="text" name="lastModifiedDate"
                    placeholder="Enter Date" path="lastModifiedDate"/><br/>



        <form:button>Add User</form:button>
    </form:form>
</div>
</body>
</html>