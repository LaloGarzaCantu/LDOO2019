
<%
     HttpSession objSession = request.getSession(false);
  String usuario=(String) objSession.getAttribute("usuario");
  if(usuario.equals("")){
      response.sendRedirect("index.jsp");
}
   
    
 %>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Acceso Exitoso</h1>
    </body>
</html>
