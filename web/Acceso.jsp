<%-- 
    Document   : index
    Created on : 3/12/2014, 10:32:27 AM
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
        <h1>Juju</h1>
        <%@ page import="org.netbeans.saas.*, org.netbeans.saas.google.*" %>
                
        <form onsubmit="return envia()" action="/Serv1" method="post">
            email<input type="text" name="email" value=""/>
            pass<input type="password" name="pass" value=""/>
            
            
            <input type="submit" name="sub" value="VAMOSSSS" onclick="envia()"/>
        </form>


    </body>
</html>
