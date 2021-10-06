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
public class Categoria {
     //Atributos
    int id_categoria;
    String desc_categoria;
    
   //CONSTRUCTOR
 
    public Categoria(){
     
 }
    
    //ENCAPSULAR 

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDesc_categoria() {
        return desc_categoria;
    }

    public void setDesc_categoria(String desc_categoria) {
        this.desc_categoria = desc_categoria;
    }

    
    // METODOS
    
  public ResultSet consultarCategoria(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM Categoria WHERE idCategoria = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_categoria);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (Exception error) {
            System.out.println("Error en el ID de Categoria: "+ error);
        }
        
        return null; 
    }
    
    public ResultSet listarCategoria(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM Categoria; "; 
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
}
