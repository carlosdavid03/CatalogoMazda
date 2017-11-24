<%-- 
    Document   : DentroCarro
    Created on : 23/11/2017, 06:34:14 PM
    Author     : Carlos Ricardo
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*"%>
<%@page import="Pojo.*"%>
<%@page import="Controlador.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="Carros/mazda_logo.gif" width="150" height="150" ><br>
        <h1>SE AÑADIO CON EXITO</h1>
        <h1>Ver Documentos</h1>
        <table border="0" width="700" align="center">
            <%
                ArrayList<Vehiculo> lista = VehiculoDB.obtenerVehiculos();
                int salto = 0;

                for (Vehiculo v : lista) {

            %>

            <th><img src="Carros/<%=v.getImagenV_Nom()%>" width="150"
                     height="150" ><br>

                <%=v.getMarca()%><br>
                <%=v.getModelo()%><br>
                <%=v.getPrecio()%><br>
                <%=v.getImagenV()%><br>

                <a href = "compra.jsp?id=<%=v.getIdVehiculo()%>">Documentos html</a>
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

        <table border="0" width="700" align="center">
            <%
                ArrayList<Vehiculo> lista1 = VehiculoDB.obtenerVehiculos();
                int salto1 = 0;

                for (Vehiculo v : lista1) {

            %>

            <th><img src="Carros/<%=v.getImagenV_Nom()%>" width="150"
                     height="150" ><br>

                <%=v.getMarca()%><br>
                <%=v.getModelo()%><br>
                <%=v.getPrecio()%><br>
                <%=v.getImagenV()%><br>

                <a href = "compra1.jsp?id=<%=v.getIdVehiculo()%>">Documentos pdf</a>
            </th>

            <%
                salto1++;
                if (salto1 == 3) {
            %>
            <tr>
                <%
                            salto1 = 0;
                        }
                    }
                %>


        </table>
    
    <th><a href = "menu.jsp">Volver al Catálogo</a></th>

</body>
</html>
