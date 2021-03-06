/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PHOBOSDEIMOS
 */
public class Consultas extends Conexion {
    
    public boolean aunteticacion(String usuario, String contraseña){
        PreparedStatement pst=null;
        ResultSet rs= null;
        
        
        try {
            String consulta="select * from usuario where usuario= ? and pass=?"; 
            pst= getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs= pst.executeQuery();
            
            if(rs.absolute(1)){
            return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                 if(getConexion()!=null) getConexion().close();
                 if(pst !=null) pst.close();
                 if(rs!=null)rs.close();
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
    return false;
    }
    
    public boolean registrar(String Usuario,String Password){
    
        PreparedStatement pst=null;
        
        try {
            String consulta="insert into  usuarios(Usuario, Passoword )values(?,?)";
            pst=getConexion().prepareStatement(consulta);
            pst.setString(1, Usuario);
            pst.setString(2, Password);
            
            if(pst.executeUpdate()==1)
                return true; 
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                 if(getConexion()!=null) getConexion().close();
                if(pst != null)pst.close();
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        
        return false;
    
    }
}

