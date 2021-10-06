/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Modelos.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 15db-0005
 */
@WebServlet(name="ControlUsuario", urlPatterns={"/ControlUsuario"})
public class ControlUsuario extends HttpServlet {
    Usuario objUsuario = new Usuario();
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
String accion = request.getParameter("btnInsertar Reserva");    
            
            if(accion.equals("Insertar")){
                
                int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                int id_menor = Integer.parseInt(request.getParameter("id_menor"));
                int tipodoc_usuario = Integer.parseInt(request.getParameter("tipodoc_usuario"));
                String nombre_usuario = request.getParameter("nombre_usuario"); 
                String numdoc_usuario = request.getParameter("numdoc_usuario"); 
                String telefono_usuario = request.getParameter("telefono_usuario"); 
                String correo_usuario = request.getParameter("correo_usuario"); 
                String fecnac_usuario = request.getParameter("fecnac_usuario"); 
 
                objUsuario.setid_usuario(id_usuario);
                objUsuario.setnombre_usuario(nombre_usuario);
                objUsuario.settipodoc_usuario(tipodoc_usuario);
                objUsuario.setnumdoc_usuario(numdoc_usuario);
                objUsuario.settelefono_usuario(telefono_usuario);
                objUsuario.setcorreo_usuario(correo_usuario);
                objUsuario.setfecnac_usuario(fecnac_usuario);
                objUsuario.setid_menor(id_menor);
                
                objUsuario.crearUsuario();
                
                String mensaje = " <html> <body>"+
                                 "<script type='text/javaScript'> "+
                                 "  alert('Vuelo reservado correctamente!!'); "+
                                 "  window.location.href='reserva.jsp'; "+
                                 "</script> </body> </html>"; 
                
                System.out.println(mensaje); 
            }
    }
    }
    
    public ArrayList listar(){
        try{
            ResultSet consulta = objUsuario.listarUsuario(); 
            ArrayList<Usuario> listaUsuario = new ArrayList<>(); 
            
            while(consulta.next()){
                objUsuario = new Usuario(); 
                objUsuario.setid_usuario(consulta.getInt(1));
                objUsuario.setnombre_usuario(consulta.getString(2));
                objUsuario.settipodoc_usuario(consulta.getInt(3));
                objUsuario.setnumdoc_usuario(consulta.getString(4));
                objUsuario.settelefono_usuario(consulta.getString(5));
                objUsuario.setcorreo_usuario(consulta.getString(6));
                objUsuario.setfecnac_usuario(consulta.getString(7));
                objUsuario.setid_menor(consulta.getInt(8));
                listaUsuario.add(objUsuario); 
            }
            return listaUsuario; 
        }
        catch(Exception error){
            System.out.println("ERROR: "+error);
        }  
        return null; 
    }
    
    public ArrayList consultar(int id_usuario){
        try{
            objUsuario.setid_usuario(id_usuario);
            ResultSet consulta = objUsuario.consultarUsuario(); 
            ArrayList<Usuario> listaUsuario = new ArrayList<>(); 
            
            while(consulta.next()){
                objUsuario = new Usuario(); 
                objUsuario.setid_usuario(consulta.getInt(1));
                objUsuario.setnombre_usuario(consulta.getString(2));
                objUsuario.settipodoc_usuario(consulta.getInt(3));
                objUsuario.setnumdoc_usuario(consulta.getString(4));
                objUsuario.settelefono_usuario(consulta.getString(5));
                objUsuario.setcorreo_usuario(consulta.getString(6));
                objUsuario.setfecnac_usuario(consulta.getString(7));
                objUsuario.setid_menor(consulta.getInt(8));
                listaUsuario.add(objUsuario);  
            }
            return listaUsuario; 
        }
        catch(Exception error){
            System.out.println("ERROR: "+error);
        }  
        return null; 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
