<%-- 
    Document   : CustomerDetail
    Created on : 02-Sep-2016, 10:05:13
    Author     : int303
--%>

<%@page import="sit.int303.demo.model.Customer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Customer Detail</title>
    </head>
    <body>
        
        <jsp:include page="/WEB-INF/jsp/Header.jsp?title=G3: C U S T O M E R - D E T A I L :::"/>
        
        
        <form action="SearchCustomer" method="post"> 
            <table class="table" style="background-color:#FF2D00;" >
                <tr>
                    <td> Enter Customer name/id: </td>
                    <td> <input type="text" name="searchParam" /> </td>
                    <td> <input type="submit" /> </td>
                </tr>
            </table>
        </form>
        
       
        <center> <h3 style="color: red"> ${message} </h3>
            
        <table class="table table-striped" width="500px">
            <tr>
                <th >ID</th>
                <td > <input type="text" name="customerId" disabled size="30"
                      value = "${customer.customerId}" >
                </td>
            </tr> 
            <tr>
                <th>Name</th>
                <td>  <input type="text" name="name" size="30"
                      value = "${customer.name}" >
                </td>
            </tr>
            <tr>
                <th>Address</th>
                <td> 
                    <textarea name="addressLine1" rows="2" style="width:450">${customer.addressLine1}</textarea>
                    <br>
                    <textarea name="addressLine2" rows="2" style="width:450">${customer.addressLine1}</textarea>
               </td>
            </tr>   
            <tr>
                <th>Zip Code</th>
                <td> 
                    <input type="text" name="zip" size="30"
                      value = "${customer.zip}">
                </td>
            </tr>
            <tr>
                <th>Discount Code</th>
                <td> 
                    <input type="text" name="discountCode" size="30"
                      value = "${customer.discountCode}" >
                </td>
            </tr>   
            <tr>
                <th>City</th>
                <td> 
                    <input type="text" name="city" disabled size="30"
                      value = "${customer.city}" >
                </td>
            </tr>   
            <tr>
                <th>State</th>
                <td> 
                    <input type="text" name="state" disabled size="30"
                      value = "${customer.state}" >
                </td>
            </tr>   
            <tr>
                <th>Phone</th>
                <td> 
                    <input type="text" name="phone" disabled size="30"
                      value = "${customer.phone}" >
                </td>
            </tr>   
            <tr>
                <th>Fax</th>
                <td> 
                    <input type="text" name="fax" disabled size="30"
                      value = "${customer.fax}" >
                </td>
            </tr>   
            <tr>
                <th>Email</th>
                <td> 
                    <input type="text" name="email" disabled size="30"
                      value = "${customer.email}" >
                </td>
            </tr>   
            <tr>
                <th>Credit Limit</th>
                <td> 
                    <input type="text" name="creditLimit" disabled size="30"
                      value = "${customer.creditLimit}" > 
                </td>      
            </tr>  
        </table>
        </center>
        
    </body>
</html>
