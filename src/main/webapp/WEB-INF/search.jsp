<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
  <link rel="stylesheet" href="/resources/eshop.css" type="text/css">
  </head>
<body>


<div class="header">
<%--    <%@include file="/header.html" %>--%>
    
  </div>





<div class="menu"> 
    <jsp:include  page="menue.jsp"/>
  </div>

<div class="content">
    <c:choose>
        <c:when test="${not empty items}">
    
<h2>Search results</h2>


      <table>
        <tr>
          <th>Name</th>
          <th>Price</th>
          <th>Details</th>
          </tr>
        <c:forEach  items="${items}"  var="item" >              
          <tr>
              <td>${item.name}</td>
            <td>${item.price}</td>
            <td><a class="link1"
              href="/item/${item.id}">
		      Details</a></td>
	        </tr>
        </c:forEach>
          </table>    
      </c:when>
      <c:otherwise>
          <p class="error" > There is no Item with this keyword  </p>
          
      </c:otherwise>
    </c:choose>
  </div>


</body></html>