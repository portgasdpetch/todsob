<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="loginOrLogout" value="${sessionScope.user == null? 'Login':'Logout'}"/>

<table style="background-color: lightgray" >
    <tr>
        <td style="width:10%;"> <a href="index.jsp"><img src="logo.png" style="width:120px"></a> </td>
        <td style="width: 1%">  </td>
        <td style="width: 70%; font-size: x-large;"> ${param.title} </td>
        <td style="width: 10%">  
            <c:if test="${CART != null}">
                <br><br>
                <a href="ViewCart.jsp" title="View/Update Your Cart"><img src="images/cart.png" style="width:50px"></a> <br>
                <br>
                (${CART.size})
            </c:if>
        </td>
        <td style="width: 10%">        
            <a href="${loginOrLogout}" title="${loginOrLogout}">
                <img src="user.png" style="width:80px">
            </a>
            <br>
            
            Hello <c:out value="${user.name}" default="Guest" ></c:out>                    
        </td>

    </tr>
</table>