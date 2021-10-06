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
 * @author 15db-0005
 */
public class Aerolinea {

//Atributos
    
    int id_aerolinea;
    String desc_aerolinea;
    
    
    //CONSTRUCTOR
     public Aerolinea(){
     }
     
     //ENCAPSULAR 

    public int getid_aerolinea() {
        return id_aerolinea;
    }

    public void setid_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public String getaerolinea() {
        return desc_aerolinea;
    }

    public void setdesc_aerolinea(String desc_aerolinea) {
        this.desc_aerolinea = desc_aerolinea;
    }

    // METODOS

   
    public void consultarAerolinea(){
        
    }
    
    public ResultSet listarAerolinea(){
        
         Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM aerolinea; "; 
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






