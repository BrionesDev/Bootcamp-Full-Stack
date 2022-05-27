<%-- 
    Document   : newJsp
    Created on : 27-may-2022, 13:37:09
    Author     : formación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- El porcentaje con el '=' es como un ECHO de PHP --%>
<%  
    out.println("<p>Nombre: " + request.getParameter("nombre") + "</p>");
    out.println("<p>Apellidos: " + request.getParameter("apellidos") + "</p>");
    out.println("<p>Edad: " + request.getParameter("edad") + "</p>");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
