<%-- 
    Document   : menu
    Created on : 15/11/2017, 01:01:15 AM
    Author     : Carlos Ricardo
--%>

<%@page import="Controlador.*"%>
<%@page import="Pojo.*"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import='java.util.ArrayList, Modelo.*' %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gracias por Registrarte</title>
    </head>
    <body>
        <h1>Catálogo</h1>
        <form >

            <html>
                <body>
                    <h1 align="center">Catálogo de Productos</h1>
                    <h2>
                        <table border="1" width="800" align="center">
                            <tr bgcolor= "skyblue">
                                <th>Catálogo</th>
                                <th><a href = "menu.jsp">Registrar Productos</a></th>
                                <th><a href = "DentroCarro.jsp">Consultar Ventas</a></th>
                                <th><a href = "index.html">Cerrar Sesión</a></th>
                            </tr>
                        </table>
                    </h2>
                    <table border="0" width="700" align="center">
                        <%
                            ArrayList<Vehiculo> lista = VehiculoDB.obtenerVehiculos();
                            int salto = 0;

                            for (Vehiculo v : lista) {
                                
                        %>

                        <th><img src="Carros/<%=v.getImagenV_Nom()%>" width="200"
                                 height="150" ><br>

                            <%=v.getMarca()%><br>
                            <%=v.getModelo()%><br>
                            <%=v.getPrecio()%><br>
                            <%=v.getImagenV()%><br>
                            <a href = "index.html">Modificar</a>  || 
                            <a href = "anadirCarrito.jsp?id=<%=v.getIdVehiculo() %>">Añadir</a>
                        </th>

                        <%
                            salto++;
                            if (salto == 3) {
                        %>
                        <tr>
                            <%
                                        salto = 0;
                                    }
                                }
                            %>


                    </table>
                </body>
            </html>
        </form>
    </body>
</html>
