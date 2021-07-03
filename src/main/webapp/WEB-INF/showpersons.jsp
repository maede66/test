<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<body>


<table>
    <tr>
        <th>Name</th>
        <th>famili</th>
        <th>father name</th>
        <th>nationalCode</th>
        <th>sobricate name</th>
    </tr>

        <tr>
            <td>${person.fname}</td>
            <td>${person.lname}</td>
            <td>${person.faname}</td>
            <td>${person.code}</td>
            <td>${sobricate}</td>

        </tr>

</table>

<%--<table>--%>
<%--    <tr>--%>
<%--        <th>Name</th>--%>
<%--        <th>FamiliName</th>--%>
<%--&lt;%&ndash;        <th>Update</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Sobricate</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Delete</th>&ndash;%&gt;--%>
<%--    </tr>--%>

<%--    <c:forEach  items="${person}"  var="item" >--%>
<%--        <tr>--%>
<%--            <td>${item.lname}</td>--%>
<%--            <td>${item.fname}</td>--%>
<%--            --%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    --%>
<%--   &lt;%&ndash; <c:forEach items="${person}" var="person" >--%>
<%--        <c:set var="person"  value="${person}"></c:set>--%>
<%--        <tr>--%>
<%--            <td>${person.name}  </td>--%>
<%--            <td>${person.fname}</td>--%>
<%--            <td><form action="/shoppingCart/updateItem">--%>
<%--                <input type="hidden" name="id"--%>
<%--                       value="${person.id}"/>--%>

<%--                <input type="submit" value="Update"/>--%>
<%--            </form></td>--%>
<%--            <td>--%>
<%--                    ${persons }--%>
<%--                <c:set var="total"  value="${total+item.price*cartItem.value.qty }"></c:set>--%>
<%--            </td>--%>

<%--            <td><form action="/shoppingCart/deleteItem">--%>
<%--                <input type="hidden" name="id"--%>
<%--                       value="${item.id}"/>--%>
<%--                <input type="submit" value="Delete"/>--%>
<%--            </form></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>&ndash;%&gt;--%>

<%--</table>--%>



<%--Id:${person.id}--%>
<%--First Name:${person.fname}--%>
<%--Last Name:${person.lname}--%>
</body>
</html>