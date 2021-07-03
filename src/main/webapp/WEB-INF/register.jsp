<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<form:form method="post" modelAttribute="person">
    firstname:<form:input path="fname"/>
    <form:errors path="fname" cssStyle="color: red"/><br>
    lastname:<form:input path="lname"/>
    <form:errors path="lname" cssStyle="color: red"/><br>
    fathername:<form:input path="faname"/><br>
    codemelli:<form:input path="code"/>
    <form:errors path="code"/>
<button type="submit" >Register </button>
<input type="submit" value="بازگشت">


<%--address:<input name="address"><br>--%>



<%--    Province: <select name="province" onchange="">--%>
<%--    <fore >--%>
<%--        <option value="{}"></option>--%>
<%--    </fore>--%>
<%--    </select>--%>
<%--City: <select name="city">--%>
<%--     <option value="value 1" ></option>--%>
<%--</select>--%>
<%--    </br>--%>
   </br>


<h5>اطلاعات تماس</h5><br>

</form:form>
</body>
</html>