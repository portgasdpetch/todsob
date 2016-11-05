<%-- 
    Document   : ListCustomer
    Created on : 02-Sep-2016, 09:35:04
    Author     : int303
--%>

<%@page import="java.util.List"%>
<%@page import="sit.int303.demo.model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Customer : JSP Page</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        
    <jsp:include page="/WEB-INF/jsp/Header.jsp?title=G3: C U S T O M E R - L I S T I N G :::"/>
    
    <jsp:useBean id="customers" scope="session" type="java.util.List<Customer>" />
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <form action="SearchCustomer" method="post"> 
        <table class="table" style="background-color:#FF2D00;" >
            <tr>
                <td> Enter Customer name/id: </td>
                <td> <input type="text" name="searchParam" value="${param.searchParam}"/> </td>
                <td> <input type="submit" /> </td>
            </tr>
        </table>
    </form>   

    <c:if test="${customers != null}">
        <table class="table table-striped" >
            <tr>
                <th>No</th>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Zip Code</th>
                <th>Discount Code</th>
                <th>City</th>
                <th>State</th>
                <th>Phone</th>
                <th>Fax</th>
                <th>Email</th>
                <th>Credit Limit</th>
            </tr>
            <c:forEach items="${customers}" var="cust" varStatus="vs">
                <tr>
                    
                    <td> ${vs.count} </td>
                    <td> ${cust.customerId}  </td>
                    <td> <a href="SearchCustomer?searchParam=${cust.customerId}"> ${cust.name} </a>  </td>
                    <td> ${cust.addressLine1}+${addressLine2}</td>
                    <td> ${cust.zip} </td>
                    <td> ${cust.discountCode} </td>
                    <td> ${cust.city} </td>
                    <td> ${cust.state} </td>
                    <td> ${cust.phone} </td>
                    <td> ${cust.fax} </td>
                    <td> ${cust.email} </td>
                    <td> ${cust.creditLimit} </td>                        
                </tr>            
            </c:forEach>

        </table>   

    </c:if>
                
    <hr>
    <h3 style="color:red; text-align: center"> ${message} </h3>
    <hr>


</body>

</html>
