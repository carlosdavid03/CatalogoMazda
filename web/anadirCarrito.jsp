<%-- 
    Document   : anadirCarrito
    Created on : 22/11/2017, 09:16:28 PM
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
        <table border="1" width="800" align="center">
            <tr bgcolor= "skyblue">
                <th><a href = "menu.jsp">Catálogo</a></th>
                <th><a href = "menu.jsp">Registrar Productos</a></th>
                <th><a href = "DentroCarro.jsp">Consultar Ventas</a></th>
                <th><a href = "index.html">Cerrar Sesión</a></th>
            </tr>
        </table>
        <h1 align="center">Producto añadido al Carro de Compras</h1>
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
                <th><a href = "DentroCarro.jsp">Añadir</a></th>
            </form>

        </table>
    </body>
</html>
