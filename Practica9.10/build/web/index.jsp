<%-- 
    Document   : index
    Created on : 19/04/2019, 07:27:28 PM
    Author     : PHOBOSDEIMOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <script src="js/main.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        
        <form action="iniciar" method="post" id="forminicio">
            <label>Nombre</label>
            <input type="text" name="usuario" id="txtusuario"/>
            <label>Contraseña</label>
            <input type="password" name="pass" id="txtpass"/>
            <input type="button" value="Iniciar Sesion" id="btniniciar"/>
           
            
        </form>
 
    </body>
</html>
