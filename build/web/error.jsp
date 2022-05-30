<%-- 
    Document   : error
    Created on : 30-may-2022, 13:34:23
    Author     : formación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>ERROR AL AUTENTICAR! <%=request.getParameter("username")%></h1>
    </body>
</html>
