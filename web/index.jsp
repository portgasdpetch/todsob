<%-- 
    Document   : index
    Created on : 14-Oct-2016, 09:23:47
    Author     : int303
--%>


<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>G3: Home Page</title>
    </head>
            
    <body style="background-color: #F5F5F5;">
        
        <jsp:include page="/WEB-INF/jsp/Header.jsp?title=G3: H O M E - P A G E :::" />
        
        <div style="margin-left:50px; width: 30%;">
            <p><b> M a i n - M e n u </b></p>
            <hr>
            <p> <a href="Page1">Page#01</a> </p>
            <p> <a href="Page2">Page#02</a> </p>
            <p> <a href="Page3">Page#03</a> </p>
            <p> <a href="Page4">Page#04</a> </p>
            <p> <a href="SearchCustomer">Search Customer</a> </p>
            <p> <a href="SearchProduct">Our Product</a> </p>
            <p> <a href="${loginOrLogout}">${loginOrLogout}</a> </p>
        </div>        
    </body>    
</html>
