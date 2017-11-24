<%-- 
    Document   : newUser
    Created on : 1/11/2017, 02:38:34 PM
    Author     : Carlos Ricardo
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrate</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="index.html" method="Post">
            
            <input type="text" name="txtid" placeholder="Identificacion" required="required"/><br/>
            <input type="text" name="txtusuario" placeholder="Usuario" required="required"/><br/>
            <input type="password" name="txtclave" placeholder="Clave" required="required"/><br/>
            <input type="text" name="txtnombre" placeholder="Nombre" required="required"/><br/>
            <input type="text" name="txtapellido" placeholder="Apellido" required="required"/><br/>
 
           
            <input type="submit" value="Crear Sesión"/>
           
            
        </form>
        
        
        
    </body>
</html>
