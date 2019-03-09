<%-- 
    Document   : Index
    Created on : 9/03/2019, 05:10:09 PM
    Author     : PHOBOSDEIMOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica3</title>
        <link rel="stylesheet" type="text/css" href=Estilo.css media all">
    </head>
    <body>
       <form action="Usuarios" method="post">
            
            
            <input type="text" name="nombre" placeholder="Escribe tu nombre">
            
            <br>
            <br>
            
            <input type="text" name="apellidos" placeholder="Escribe tus apellidos">
            
            <br>
            <br>
            
            <input type="Email" name="correo" placeholder="Ingresa tu correo">
            
            <br>
            <br>
            
            <input type="password" name="contraseña" placeholder="Password">
            
            <br>
            <br>
            
           <input type="submit" value="Enviar" >
            
        </form>
         
    </body>
</html>
