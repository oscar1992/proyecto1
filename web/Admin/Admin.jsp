<%-- 
    Document   : Admin
    Created on : 21/01/2015, 03:35:01 PM
    Author     : (°_°)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script lang="javascript">
            
            function envia(){
                return true;
            }
        </script>
    </head>
    <body>
        <h1>Administrador</h1>
        <form onsubmit="return envia()" action="/ServRoles" method="post">
            <input type="submit" name="bot1" value="Usuarios"/>
        </form>
        
    </body>
</html>
