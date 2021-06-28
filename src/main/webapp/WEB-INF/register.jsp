<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<meta charset="UTF-8">

<form method="post" modelAttribute="person">
<%--   --%>
    firstname:<input name="fname">
    <form:errors path="fname" cssStyle="color: red"/><br>
    lastname:<input name="lname">
    <form:errors path="lname" cssStyle="color: red"/><br>
    fathername:<input name="faname"><br>
    codemelli:<input name="id">
    <form:errors path="id"/><br>
    <button type="submit" >ثبت </button>
<%--    <input type="submit" value="بازگشت">--%>
<%--    آدرس:<input name="address"><br>--%>
</form>
<%--<form:form method="post">--%>

<%--</form:form>--%>
<%--<form:form method="post">--%>

<%--</form:form>--%>

</html>