
import Modelos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Reserva {
    //Atributos
    
    int reserva;
    int id_usuario;
    int id_vuelo;
    String hora_reserva;
    String fecha_reserva;
    
    
    //CONSTRUCTOR
     public Reserva(){
     }
     
     //ENCAPSULAR 

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getHora_reserva() {
        return hora_reserva;
    }

    public void setHora_reserva(String hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
     
     

// METODOS

   public void crearReserva(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            

            String sql = "INSERT INTO reserva VALUES (?,?,?,?,?);";
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(1, this.reserva);
            stmt.setInt(2, this.id_usuario);
            stmt.setInt (3, this.id_vuelo);
            stmt.setString(4, this.hora_reserva);
            stmt.setString(5, this.fecha_reserva);
            
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+error);
        }
    }
    
    public ResultSet consultarReserva(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM reserva WHERE reserva = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.reserva);
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();
            return consulta; 
            
        } catch (Exception error) {
            System.out.println("Error modelo: "+ error);
        }
        
        return null; 
    }
    
    public ResultSet listarReserva(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            String sql = "SELECT * FROM reserva; "; 
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
    
    public void actualizarReserva(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
           
            String sql = "UPDATE reserva SET " +
                            "id_usuario = ?, "+
                            "id_vuelo = ?, "+
                            "hora_reserva = ? "+
                            "fecha_reserva = ? "+
                            "WHERE reserva = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, this.reserva);
            stmt.setInt(2, this.id_usuario);
            stmt.setInt(3, this.id_vuelo);
            stmt.setString(4, this.hora_reserva);
            stmt.setString(5, this.fecha_reserva);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+error);
        }
    }
    
    public void eliminarReserva(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try {
            
            String sql = "DELETE FROM reserva " +
                            "WHERE reserva = ?; "; 
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            stmt.setInt(1, this.reserva);
            
            stmt.execute(); 
            
            objConector.desconectar();
            
        } catch (Exception error) {
            System.out.println("Error en modelo: "+error);
        }
    }
}

    
    
    
    
    

