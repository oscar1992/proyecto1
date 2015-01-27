<%-- 
    Document   : Rol
    Created on : 21/01/2015, 03:42:34 PM
    Author     : (°_°)
--%>

<%@page import="Abajo.Rol"%>
<%@page import="Abajo.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Abajo.adm_registro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script lang="javascript">
            
            function jj(id){
                
                document.getElementById("qq").value=""+id;
                //alert("id "+id);
                //alert(document.getElementById("qq"));                
            }
            
            function envia() {
                return true;
            }
        </script>
    </head>
    <body>
        <h1>Usuarios</h1>
        <%
            adm_registro obj = new adm_registro();
            ArrayList<Persona> lista = new ArrayList<Persona>();
            ArrayList<Rol> lista2 = new ArrayList<Rol>();
            lista2 = obj.L_Rol();
            lista = obj.L_Personas_rol();
        %>
        <form onsubmit="return valida()" action="/Servlet_Persona" method="post">
            <table border="1">
                <tr>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Rol</th>
                </tr>
                <%
                    for (int i = 0; i < lista.size(); i++) {
                %>
                <tr>
                    <td><%out.println(lista.get(i).getNombre());%></td>
                    <td><%out.println(lista.get(i).getCorreo());%></td>
                    <td><%out.println(lista.get(i).getFecha_de_Nacimiento());%></td>
                    <td><%
                        for(int j=0;j<lista2.size();j++){
                            if(lista2.get(j).getId()==lista.get(i).getRol()){
                                out.print(""+lista2.get(j).getRol());
                            }
                        }
                        %>
                    </td>
                    <td><input type="submit" name="<%out.println(""+lista.get(i).getId());%>" value="Modificar" onclick="jj('<%out.print(""+lista.get(i).getId());%>')"/></td>
                    
                </tr>
                <%}%>
            </table>
            <input type="hidden" name="quien" value="" id="qq"/>
        </form>
    </body>
</html>
