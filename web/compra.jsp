<%-- 
    Document   : compra
    Created on : 23/11/2017, 07:14:22 PM
    Author     : Carlos Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*"%>
<%@page import="Pojo.*"%>
<%@page import="Controlador.*"%>
<!DOCTYPE html>
<%
    Vehiculo v = VehiculoDB.obtenerProducto(Integer.parseInt(request.getParameter("id")));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Compra en archivo html</h1>
        <table border="0" width="500" align="center">
            <form method="post" action="ServletControlador">
                <tr>
                    <th rowspan="5"><img src="Carros/<%=v.getImagenV_Nom()%>" width="140" height="140" ></th>
                    <th> Código </th>
                    <th><input type="text" name="txtCodigo" value="<%=v.getIdVehiculo()%>" readoly/></th> 
                </tr><tr>
                    <th> Nombre </th>
                    <th><input type="text" name="txtNombre" value="<%=v.getMarca()%>" readoly/></th> 
                </tr><tr>
                    <th> Modelo </th>
                    <th><input type="text" name="txtModelo" value="<%=v.getModelo()%>" readoly/></th>
                </tr><tr>
                    <th> Precio </th>
                    <th><input type="text" name="txtPrecio" value="<%=v.getPrecio()%>" /></th> 
                </tr><tr>
                    <th> Cantidad </th>
                    <th><input type="number" value="0" min="0" name="txtCantidad" value="0"/></th> 
                </tr>
                <th><a href = "menu.jsp">Hacer Compra</a></th>
            </form>

        </table>
        
    </body>
</html>
