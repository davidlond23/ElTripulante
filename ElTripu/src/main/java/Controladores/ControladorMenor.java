/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Menor;
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
 * @author User
 */
@WebServlet(name = "Menor", urlPatterns = {"/Menor"})
public class ControladorMenor extends HttpServlet {

    Menor objMenor = new Menor(); 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
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
            String accion = request.getParameter("btnAccion"); 
            
            if(accion.equals("Reservar")){
                             
                int id_menor = Integer.parseInt(request.getParameter("id_menor"));
                int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                int tipodoc_menor = Integer.parseInt(request.getParameter("tipodoc_menor"));
                String numdoc_menor = request.getParameter("numdoc_menor") == null ? "" : request.getParameter("numdoc_menor"); 
                String fecnac_menor = request.getParameter("fecnac_menor") == null ? "" : request.getParameter("fecnac_menor"); 
                
                objMenor.setId_menor(id_menor);
                objMenor.setId_usuario(id_usuario);
                objMenor.setTipodoc_menor(tipodoc_menor);
                objMenor.setNumdoc_menor(numdoc_menor);
                objMenor.setFecnac_menor(fecnac_menor);
                
                objMenor.crearMenor();
                
                String mensaje = " <html> <body>"+
                                 "<script type='text/javaScript'> "+
                                 "  alert('Menor registrado correctamente'); "+
                                 "  window.location.href='index.jsp'; "+
                                 "</script> </body> </html>"; 
                
                System.out.println(mensaje); 
            }         
                        
        }
        catch(Exception error){
            System.out.println("Error en el controlador: "+error);
        }
   
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
public ArrayList consultar(int id_menor){
        
        try{
            objMenor.setId_menor(id_menor);
            ResultSet consulta = objMenor.consultarMenor(); 
            ArrayList<Menor> listaMenor = new ArrayList<>(); 
            
            while(consulta.next()){
                objMenor = new Menor(); 
                objMenor.setId_menor(consulta.getInt(1));
                objMenor.setId_usuario(consulta.getInt(2));
                objMenor.setTipodoc_menor(consulta.getInt(3));
                objMenor.setNumdoc_menor(consulta.getString(4));
                objMenor.setFecnac_menor(consulta.getString(5));
                listaMenor.add(objMenor); 
            }
            return listaMenor; 
        }
        catch(Exception error){
            System.out.println("Error de controlador: "+ error);
        }  
        return null; 
    }
    
    public ArrayList listar(){
        
        try {
            ResultSet consulta = objMenor.listarMenor();
            ArrayList<Menor> listaMenor = new ArrayList<>();
            
            while(consulta.next()){
                objMenor = new Menor();
                objMenor.setId_menor(consulta.getInt(1));
                objMenor.setId_usuario(consulta.getInt(2));
                objMenor.setTipodoc_menor(consulta.getInt(3));
                objMenor.setNumdoc_menor(consulta.getString(4));
                objMenor.setFecnac_menor(consulta.getString(5));
                listaMenor.add(objMenor);
                               
            }
            return listaMenor;
            
        } catch (Exception error) {
            
            System.out.println("Error de controlador: "+ error);
        }
        
        return null;
    
}
 }
        
