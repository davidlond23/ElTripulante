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
public class TipoiDocumento {

//Atributos
    
    int id_tipodocumento;
    String desc_tipodoc;
    
    
    //CONSTRUCTOR
     public TipoiDocumento(){
     }
     
     //ENCAPSULAR 

    public int getid_tipodocumento() {
        return id_tipodocumento;
    }

    public void setid_tipodocumento(int id_tipodocumento) {
        this.id_tipodocumento = id_tipodocumento;
    }

    public String getdesc_tipodoc() {
        return desc_tipodoc;
    }

    public void setdesc_tipodoc(String desc_tipodoc) {
        this.desc_tipodoc = desc_tipodoc;
    }

    // METODOS
    
    public ResultSet consultarTipoiDocumento(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM tipodocumento WHERE id_tipodocumento = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.id_tipodocumento);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (SQLException error) {
            System.out.println("Error modelo: "+ error);
        }
        
        return null;
    }
    
    
    public ResultSet listarTipoiDocumento(){
                Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM tipodocumento; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (SQLException error) {
            System.out.println("Error modelo: "+ error);
        }
        
        return null; 
    }






}
