/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection; 
import java.sql.DriverManager;
/**
 *
 * @author User
 */
public class Conexion {

    //ATRIBUTOS
    public Connection conn; 
    public String host = "localhost:3306"; 
    public String dataBase = "eltripulante"; 
    public String user = "root"; 
    public String password = ""; 
    
    //METODOS
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.dataBase+"?zeroDateTimeBehavior=CONVERT_TO_NULL",this.user,this.password);
            System.out.println("Conexión exitosa");
        } catch (Exception error) {
            System.out.println("Error de conexión: "+error);
        }
    }
    
    public void desconectar(){
        conn = null; 
    }
}

