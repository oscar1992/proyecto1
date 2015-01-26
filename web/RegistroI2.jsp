<%-- 
    Document   : RegistroI2
    Created on : 21/01/2015, 11:28:58 AM
    Author     : (°_°)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
        <script lang="javascript">
            
            function envia(){
                return true;
            }
            
        </script>
    </head>
    <body>
        <h1>Datos Personales</h1>
        <form action="/Serv2" method="post" onsubmit="return envia()">
            Nombres
            <input type="text" name="nom" value=""/><br>
            Correo
            <input type="text" name="cor" value="<%out.println(request.getSession().getAttribute("Correo"));%>"/><br>
            Fecha de Nacimiento
            <input type="text" name="nac" value=""/><br>
            Teléfono de Oficina
            <input type="text" name="ofi" value=""/><br>
            Teléfono Movil
            <input type="text" name="mov" value=""/><br>
            Institución
            <input type="text" name="ins" value=""/><br>
            Nivel de Estudios
            <input type="text" name="niv" value=""/><br>
            <input type="submit" name="bot1" value="Registrar"/><br>
        </form>
    </body>
</html>
