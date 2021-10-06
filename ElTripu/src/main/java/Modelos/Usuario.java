/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 15db-0005
 */
public class Usuario {


//Atributos
    
    int id_usuario;
    String nombre_usuario;
    int tipodoc_usuario;
    String numdoc_usuario;
    String telefono_usuario;
    String correo_usuario;
    String fecnac_usuario;
    int id_menor;
    
    //CONSTRUCTOR
     public Usuario(){
     }
     
     //ENCAPSULAR 

    public int getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getnombre_usuario() {
        return nombre_usuario;
    }

    public void setnombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int gettipodoc_usuario() {
        return tipodoc_usuario;
    }

    public void settipodoc_usuario(int tipodoc_usuario) {
        this.tipodoc_usuario = tipodoc_usuario;
    }

    public String getnumdoc_usuario() {
        return numdoc_usuario;
    }

    public void setnumdoc_usuario(String numdoc_usuario) {
        this.numdoc_usuario = numdoc_usuario;
    }

    public String gettelefono_usuario() {
        return telefono_usuario;
    }

    public void settelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }
     
      public String getcorreo_usuario() {
        return correo_usuario;
    }

    public void setcorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    
      public String getfecnac_usuario() {
        return fecnac_usuario;
    }

    public void setfecnac_usuario(String fecnac_usuario) {
        this.fecnac_usuario = fecnac_usuario;
    }
    
    public int getid_menor() {
        return id_menor;
    }

    public void setid_menor(int id_menor) {
        this.id_menor = id_menor;
    }
      

// METODOS

    public void crearUsuario(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {

            String sql = "INSERT INTO usuario VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(1, this.id_usuario);
            stmt.setString(2, this.nombre_usuario);
            stmt.setInt(3, this.tipodoc_usuario);
            stmt.setString(4, this.numdoc_usuario);
            stmt.setString(5, this.telefono_usuario);
            stmt.setString(6, this.correo_usuario);
            stmt.setString(7, this.fecnac_usuario);
            stmt.setInt(8, this.id_menor);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (SQLException error) {
            System.out.println("Error en modelo: "+error);
        }
    }
    
    public ResultSet consultarUsuario(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM usuario WHERE id_usuario = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_usuario);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (SQLException error) {
            System.out.println("Error modelo: "+ error);
        }
        
        return null; 
    }
    
    public ResultSet listarUsuario(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM Usuario; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (Exception error) {
            System.out.println("Error modelo: "+ error);
        }
        
        return null; 
    }
    
    public void actualizarUsuario(){
         Conexion objConector = new Conexion(); 
        objConector.conectar();

        try {
            
            String sql = "UPDATE usuario SET " +
                            "nombre_usuario = ?, "+
                            "tipodoc_usuario = ?, "+
                            "numdoc_usuario = ?, "+
                            "telefono_usuario = ? "+
                            "correo_usuario = ? "+
                            "fecnac_usuario = ? "+
                            "id_menor = ? "+
                            "WHERE id_usuario = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(8, this.id_usuario);
            stmt.setString(1, this.nombre_usuario);
            stmt.setInt(2, this.tipodoc_usuario);
            stmt.setString(3, this.numdoc_usuario);
            stmt.setString(4, this.telefono_usuario);
            stmt.setString(5, this.correo_usuario);
            stmt.setString(6, this.fecnac_usuario);
            stmt.setInt(7, this.id_menor);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (SQLException error) {
            System.out.println("Error en modelo: "+error);
        }
    }
    
    public void eliminarUsuario(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            
            String sql = "DELETE FROM usuario " +
                            "WHERE id_usuario = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(1, this.id_usuario);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (SQLException error) {
            System.out.println("Error en modelo: "+error);
        }
    }
 
}
