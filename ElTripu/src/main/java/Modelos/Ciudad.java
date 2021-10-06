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
public class Ciudad {
    //Atributos
    int id_ciudad;
    String desc_ciudad;
    int id_pais; 

  //CONSTRUCTOR
 public Ciudad(){
 }
   //ENCAPSULAR 

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getDesc_ciudad() {
        return desc_ciudad;
    }

    public void setDesc_ciudad(String desc_ciudad) {
        this.desc_ciudad = desc_ciudad;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
 
        
    public void consultarCiudad(){
        
    }
    
    public ResultSet listarCiudad(){
         Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM ciudad; "; 
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