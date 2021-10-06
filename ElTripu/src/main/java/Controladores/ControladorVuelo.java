/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelos.Vuelo;
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
@WebServlet(name = "ControladorVuelo", urlPatterns = {"/ControladorVuelo"})
public class ControladorVuelo extends HttpServlet {
     
    Vuelo objVuelo = new Vuelo();
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorVuelo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorVuelo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


public ArrayList listar(){

 try{
     ResultSet consulta = objVuelo.listarVuelo();
     ArrayList<Vuelo> listaVuelo = new ArrayList<>();

     while(consulta.next()){
         objVuelo = new Vuelo ();

         objVuelo. setid_vuelo(consulta.getInt(1));
         objVuelo. setorigen_vuelo(consulta.getInt(2));
         objVuelo. setdestino_vuelo(consulta.getInt(3));
         objVuelo. setfechaida_vuelo(consulta.getString(4));
         objVuelo. setfecharegreso_vuelo(consulta.getString(5));
         objVuelo. sethorasalida_vuelo(consulta.getString(6));
         objVuelo. sethoraregreso_vuelo(consulta.getString(7));
         objVuelo. setid_categoria(consulta.getInt(8));
         objVuelo. setprecio_vuelo(consulta.getFloat(9));
         objVuelo. setsillas_vuelo(consulta.getInt(10));
         objVuelo. setid_aerolinea(consulta.getInt(11));
        
         listaVuelo.add(objVuelo);   

     }
     return listaVuelo;
     }
        catch(Exception error){
     System.out.println("Error controlador:" + error );

        }
        return null;

    }
/**------------------*/

public ArrayList consultar(int id_vuelo){
        try{
            objCategoria.setid_vuelo(id_vuelo);
            ResultSet consulta = objVuelo.consultarVuelo(); 
            ArrayList<Vuelo> listaVuelo = new ArrayList<>(); 
            
            while(consulta.next()){
                objVuelo = new Vuelo(); 
                objVuelo. setid_vuelo(consulta.getInt(1));
                objVuelo. setorigen_vuelo(consulta.getInt(2));
                objVuelo. setdestino_vuelo(consulta.getInt(3));
                objVuelo. setfechaida_vuelo(consulta.getString(4));
                objVuelo. setfecharegreso_vuelo(consulta.getString(5));
                objVuelo. sethorasalida_vuelo(consulta.getString(6));
                objVuelo. sethoraregreso_vuelo(consulta.getString(7));
                objVuelo. setid_categoria(consulta.getInt(8));
                objVuelo. setprecio_vuelo(consulta.getFloat(9));
                objVuelo. setsillas_vuelo(consulta.getInt(10));
                objVuelo. setid_aerolinea(consulta.getInt(11));
                listaVuelo.add(objVuelo); 
            }
            return listaVuelo; 
        }
        catch(Exception error){
            System.out.println("ERROR: "+error);
        }  
        return null; 
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

}
