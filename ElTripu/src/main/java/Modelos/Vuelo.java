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
public class Vuelo {
    //Atributos
    int id_vuelo;
    int origen_vuelo;
    int destino_vuelo;
    String des_origen_vuelo;
    String des_destino_vuelo;
    String fechaida_vuelo;
    String fecharegreso_vuelo;
    String horasalida_vuelo;
    String horaregreso_vuelo;
    int id_categoria;
    float precio_vuelo;
    int sillas_vuelo;
    int id_aerolinea;
    
     //CONSTRUCTOR
    
    public Vuelo(){
    }
    
    //ENCAPSULAR 

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getOrigen_vuelo() {
        return origen_vuelo;
    }

    public void setOrigen_vuelo(int origen_vuelo) {
        this.origen_vuelo = origen_vuelo;
    }

    public int getDestino_vuelo() {
        return destino_vuelo;
    }

    public void setDestino_vuelo(int destino_vuelo) {
        this.destino_vuelo = destino_vuelo;
    }

    public String getFechaida_vuelo() {
        return fechaida_vuelo;
    }

    public void setFechaida_vuelo(String fechaida_vuelo) {
        this.fechaida_vuelo = fechaida_vuelo;
    }

    public String getFecharegreso_vuelo() {
        return fecharegreso_vuelo;
    }

    public void setFecharegreso_vuelo(String fecharegreso_vuelo) {
        this.fecharegreso_vuelo = fecharegreso_vuelo;
    }

    public String getHorasalida_vuelo() {
        return horasalida_vuelo;
    }

    public void setHorasalida_vuelo(String horasalida_vuelo) {
        this.horasalida_vuelo = horasalida_vuelo;
    }

    public String getHoraregreso_vuelo() {
        return horaregreso_vuelo;
    }

    public void setHoraregreso_vuelo(String horaregreso_vuelo) {
        this.horaregreso_vuelo = horaregreso_vuelo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public float getPrecio_vuelo() {
        return precio_vuelo;
    }

    public void setPrecio_vuelo(float precio_vuelo) {
        this.precio_vuelo = precio_vuelo;
    }

    public int getSillas_vuelo() {
        return sillas_vuelo;
    }

    public void setSillas_vuelo(int sillas_vuelo) {
        this.sillas_vuelo = sillas_vuelo;
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }
    
    // METODOS


    
    
    public ResultSet listarVuelo(){
        
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM vuelo; "; 
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
    
    public ResultSet consultarVuelo(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM vuelo WHERE fechaida_vuelo = ? AND fecharegreso_vuelo = ? "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setString(1, this.fechaida_vuelo);
            stmt.setString(2, this.fecharegreso_vuelo);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (Exception error) {
            System.out.println("Error en el ID de Aerolínea: "+ error);
        }
        
        return null; 
    }
}
