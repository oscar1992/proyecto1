<%-- 
    Document   : Bandeja
    Created on : 26/01/2015, 03:57:34 PM
    Author     : (°_°)
--%>

<%@page import="Abajo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bandeja</h1>
        <%
            Persona pp=new Persona();
            pp=(Persona)request.getSession().getAttribute("Quien");
            out.println("Bienvenido: "+pp.getNombre());
        %>
    </body>
</html>
