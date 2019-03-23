
package com.laboratorio.perfilservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PerfilServlet", urlPatterns = {"/PerfilServlet"})
public class PerfilServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Perfil at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            request.getRequestDispatcher("link.html").include(request, response);
        
        Cookie ck[]=request.getCookies();
        
        if(ck!=null){
            String name= ck[0].getValue();
            if(!name.equals("")||name!=null){
                out.print("<b>Bienvenido a tu perfil</b>");
                out.print("<br>Bienvenido"+ name);
            }
        }
        else{
        
        out.println("Porfavor primero ingresar usuario y contraseña");
         request.getRequestDispatcher("login.html").include(request, response);
        }
            
            
            
            
            
            
            
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        
        Cookie ck[]=request.getCookies();
        
        if(ck!=null){
            String name= ck[0].getValue();
            if(!name.equals("")||name!=null){
                out.print("<b>Bienvenido a tu perfil</b>");
                out.print("<br>Bienvenido"+ name);
            }
        }
        else{
        
        out.print("Porfavor primero ingresar");
         request.getRequestDispatcher("login.html").include(request, response);
        }
        
        
        
    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
