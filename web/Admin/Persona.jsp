<%-- 
    Document   : Persona
    Created on : 26/01/2015, 11:48:45 AM
    Author     : (°_°)
--%>

<%@page import="Abajo.adm_registro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Abajo.Rol"%>
<%@page import="Abajo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script lang="javascript">
            function ee(){
                //return false;
                //alert("gg");
                window.location="/Admin/Rol.jsp";                
            }
            
            function valida(){
                return true;
            }
        </script>
    </head>
    <body>
        <h1>Persona</h1>
        <%
            adm_registro obj = new adm_registro();
            ArrayList<Rol> lista2 = new ArrayList<Rol>();
            lista2 = obj.L_Rol();
            Persona pp=(Persona)request.getSession().getAttribute("Per");
            if(request.getParameter("ee")!=null){
                out.println("<h1>Registro Exitoso</h1>");
            }else{
                
            }
        %>
        <form onsubmit="return valida()" action="/Servlet_IPersona">
            <table border="1">
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nom" value="<%out.println(pp.getNombre());%>"></td>
                </tr>
                <tr>
                    <td>Correo</td>
                    <td><input type="text" name="cor" value="<%out.println(pp.getCorreo());%>"></td>
                </tr>
                <tr>
                    <td>Institución</td>
                    <td><input type="text" name="ins" value="<%out.println(pp.getInstitución());%>"></td>
                </tr>
                <tr>
                    <td>Nivel de Estudios</td>
                    <td><input type="text" name="niv" value="<%out.println(pp.getNivel_de_Estudios());%>"></td>
                </tr>
                <tr>
                    <td>Teléfono Movil</td>
                    <td><input type="text" name="mov" value="<%out.println(pp.getTelefono_Movil());%>"></td>
                </tr>
                <tr>
                    <td>Teléfono Oficina</td>
                    <td><input type="text" name="ofi" value="<%out.println(pp.getTelefono_Oficina());%>"></td>
                </tr>
                <tr>
                    <td>Rol</td>
                    <td><select name="rol">
                            <%
                            for (int j = 0; j < lista2.size(); j++) {%>
                            <option value=<%out.println("0"+lista2.get(j).getId());%>  <%if (pp.getRol() == lista2.get(j).getId()) {
                                    out.println("Selected");
                                }%>><%out.println(lista2.get(j).getRol());%></option>
                            <%}%>
                        </select></td>
                </tr>
            </table>
            <input type="submit" name="bot" value="Modificar" onclick="valida()">
            <input type="button" name="bot" value="Volver" onclick="ee()">
            
        </form>
        
    </body>
</html>
