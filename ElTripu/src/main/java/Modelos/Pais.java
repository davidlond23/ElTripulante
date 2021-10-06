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
public class Pais {
    
    //Atributos
     int id_pais;
     String desc_pais;
     
      //CONSTRUCTOR
 public Pais(){
     
 }
 
 //ENCAPSULAR 

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getDesc_pais() {
        return desc_pais;
    }

    public void setDesc_pais(String desc_pais) {
        this.desc_pais = desc_pais;
    }
 
 // METODOS    
    public ResultSet listarPais(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM pais";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            ResultSet Consulta = stmt.executeQuery();
            objConector.desconectar();
            return Consulta;
            
        } catch (Exception error) {
            System.out.println("Error en el modelo: "+ error);
//        }
        
        return null;
    }
    
}
}
  