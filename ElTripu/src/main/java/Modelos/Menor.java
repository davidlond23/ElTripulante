/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Menor {
    //Atributos
    int id_menor;
    int id_usuario;
    int tipodoc_menor;
    String numdoc_menor;
    String fecnac_menor;
    
    
    //CONSTRUCTOR
     
    public Menor(){
        
    }
    
    //ENCAPSULAR 

    public int getId_menor() {
        return id_menor;
    }

    public void setId_menor(int id_menor) {
        this.id_menor = id_menor;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getTipodoc_menor() {
        return tipodoc_menor;
    }

    public void setTipodoc_menor(int tipodoc_menor) {
        this.tipodoc_menor = tipodoc_menor;
    }

    public String getNumdoc_menor() {
        return numdoc_menor;
    }

    public void setNumdoc_menor(String numdoc_menor) {
        this.numdoc_menor = numdoc_menor;
    }

    public String getFecnac_menor() {
        return fecnac_menor;
    }

    public void setFecnac_menor(String fecnac_menor) {
        this.fecnac_menor = fecnac_menor;
    }
    
    // METODOS
    
   
        public void crearMenor(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        
        try {
            String sql = "INSERT INTO menor VALUES (?, ?, ?, ?, ?);";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_menor);
            stmt.setInt(2, this.id_usuario);
            stmt.setInt(3, this.tipodoc_menor);
            stmt.setString(4, this.numdoc_menor);
            stmt.setString(5, this.fecnac_menor);
                    
            stmt.execute();
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+ error);
        }
        
    }
    
    public ResultSet consultarMenor(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM menor WHERE id_menor = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_menor);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+ error);
        }
        
        return null;
    }
    
    public ResultSet listarMenor(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM menor; ";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            ResultSet Consulta = stmt.executeQuery();
            stmt.setInt(1, this.id_menor);
            stmt.setInt(2, this.id_usuario);
            stmt.setInt(3, this.tipodoc_menor);
            stmt.setString(4, this.numdoc_menor);
            stmt.setString(5, this.fecnac_menor);
            
            stmt.execute();
                    
            objConector.desconectar();
            
            return Consulta;
                        
        } catch (Exception error) {
            System.out.println("Error en modelo: "+ error);
        }
        return null;
    }
    
   
    public void actualizarMenor(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        
        try {
            
            String sql = "UPDATE menor SET" +
                    "id_menor = ?, " +
                    "id_usuario = ?, " +
                    "tipodoc_menor = ?, " +
                    "numdoc_menor = ?, " +
                    "fecnac_menor = ?, " +
                    "WHERE menor = ?, ";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_menor);
            stmt.setInt(2, this.id_usuario);
            stmt.setInt(3, this.tipodoc_menor);
            stmt.setString(4, this.numdoc_menor);
            stmt.setString(5, this.fecnac_menor);
            
            stmt.execute();
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+ error);
        }
    }
    
    public void eliminarMenor(){
        
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            
            String sql = "DELETE FROM menor " +
                            "WHERE id_menor = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(1, this.id_menor);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+ error);
        }
    }
    
    
    
}
