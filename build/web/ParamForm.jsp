<%-- 
    Document   : ParamForm
    Created on : 07-Oct-2016, 09:04:57
    Author     : int303
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Map<String, String> subjects = new HashMap();
            subjects.put("INT102", "Java Programming 1");
            subjects.put("INT105", "Java Programming 2");
            subjects.put("INT303", "Web Programming");
            subjects.put("GEN101", "Physical Education");
            subjects.put("LNG101", "General English");
            subjects.put("INT107", "Computing Platform Technology");
            subjects.put("INT104", "Discrete Math");
            subjects.put("INT101", "IT Fundamental");
            subjects.put("INT201", "Networks");
            subjects.put("INT203", "Information Management 1");
            application.setAttribute("subjects", subjects);

            Map<String, String> faculty = new HashMap();
            faculty.put("sit", "School of Information Technology");
            faculty.put("eng", "Faculty of Engineering");
            faculty.put("sci", "Faculty of Science");
            application.setAttribute("faculty", faculty);
        %>
        <form action = "ViewParam.jsp?programId=1457995" method="POST">
            Student Id: <input type="text" name="sid" value="${psram.sid}" />
            <br>
            Student Name: <input type="text" name="sname" value="${param.sname}" />
            <br>
            Faculty: <select name="faculty">
                            <option value="sit"> ${faculty.sit} </option>
                            <option value="eng"> ${faculty.eng} </option>
                            <option value="sci"> ${faculty.sci} </option>
                     </select>
            <br>
            Favourite Subjects: <br>
                <input type="checkbox" name="subjects" value="INT102"/>${subjects["INT102"]}<br>
                <input type="checkbox" name="subjects" value="INT105"/>${subjects["INT105"]}<br>
                <input type="checkbox" name="subjects" value="INT303"/>${subjects["INT303"]}<br>
                <input type="checkbox" name="subjects" value="GEN101"/>${subjects["GEN101"]}<br>
                <input type="checkbox" name="subjects" value="LNG101"/>${subjects["LNG101"]}<br>
                <input type="checkbox" name="subjects" value="INT107"/>${subjects["INT107"]}<br>
                <input type="checkbox" name="subjects" value="INT104"/>${subjects["INT104"]}<br>
                <input type="checkbox" name="subjects" value="INT101"/>${subjects["INT101"]}<br>
                <input type="checkbox" name="subjects" value="INT201"/>${subjects["INT201"]}<br>
                <input type="checkbox" name="subjects" value="INT203"/>${subjects["INT203"]}<br>                
            <input type="submit" value="Submit Query">         
        </form>
    </body>
</html>
