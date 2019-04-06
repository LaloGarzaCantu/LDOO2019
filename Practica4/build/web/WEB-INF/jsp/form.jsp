<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Practica4</h1>
        
        <form:form>
            <p>
            
            <form:label path="correo">Correo</form:label>  
            <form:input path="correo"/>
            
            </p>
            
            <p>
            
            <form:label path="nombre">Nombre</form:label>
            <form:input path="nombre"/>
            
            </p>
            
            <p>
                
            <form:label path="edad">Edad</form:label> 
            <form:input path="edad"/>
            
            </p>
            <hr>
            <form:button>Enviar </form:button>
            
        </form:form>> 
    </body>
</html>
