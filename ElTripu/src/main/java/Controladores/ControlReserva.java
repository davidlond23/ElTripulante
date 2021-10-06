/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Reserva;
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
@WebServlet(urlPatterns = {"/ControlReserva"})
public class ControlReserva extends HttpServlet {

Reserva objReserva = new Reserva();

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
            out.println("<title>Servlet ControlReserva</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControlReserva at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
if(accion.equals("Insertar")){
                
                int reserva = Integer.parseInt(request.getParameter("reserva"));
                int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                int id_vuelo = Integer.parseInt(request.getParameter("id_vuelo"));
                String hora_reserva = request.getParameter("hora_reserva"); 
                String fecha_reserva = request.getParameter("fecha_reserva"); 
                
                objReserva.setReserva(reserva);
                objReserva.setId_Reserva(id_reserva);
                objReserva.setId_Vuelo(id_vuelo);
                objReserva.setHora_Reserva(hora_reserva);
                objReserva.setFecha_Reserva(fecha_reserva);
                
                objReserva.crearReserva();
                
                String mensaje = " <html> <body>"+
                                 "<script type='text/javaScript'> "+
                                 "  alert('Vuelo reservado correctamente!!'); "+
                                 "  window.location.href='reserva.jsp'; "+
                                 "</script> </body> </html>"; 
                
                out.println(mensaje); 
            }
            else if (accion.equals("Actualizar")){
                int reserva = Integer.parseInt(request.getParameter("reserva"));
                int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                int id_vuelo = Integer.parseInt(request.getParameter("id_vuelo"));
                String hora_reserva = request.getParameter("hora_reserva"); 
                String fecha_reserva = request.getParameter("fecha_reserva"); 

                objReserva.setReserva(reserva);
                objReserva.setId_Reserva(id_reserva);
                objReserva.setId_Vuelo(id_vuelo);
                objReserva.setHora_Reserva(hora_reserva);
                objReserva.setFecha_Reserva(fecha_reserva);              

              
                objReserva.actualizarReserva();
                
                String mensaje = " <html> <body>"+
                                 "<script type='text/javaScript'> "+
                                 "  alert('Reserva actualizada correctamente!!'); "+
                                 "  window.location.href='reserva.jsp'; "+
                                 "</script> </body> </html>"; 
                
                out.println(mensaje); 
            }
            else if (accion.equals("Eliminar")){
                
                int reserva = Integer.parseInt(request.getParameter("reserva"));
                                
                objReserva.setReserva(reserva);
                
                objReserva.eliminarReserva();
                
                String mensaje = " <html> <body>"+
                                 "<script type='text/javaScript'> "+
                                 "  alert('Reserva eliminada!!'); "+
                                 "  window.location.href='reserva.jsp'; "+
                                 "</script> </body> </html>"; 
                
               out.println(mensaje); 
            }
            
            
            
        }
        catch(Exception error){
            System.out.println("Error en el controlador: "+error);
        }
    }
    
    public ArrayList listar(){
        try{
            ResultSet reserva = objReserva.listarReserva(); 
            ArrayList<Reserva> listaReserva = new ArrayList<>(); 
            
            while(consulta.next()){
                objReserva = new Reserva(); 
                objReserva.setRserva(consulta.getInt(1));
                objReserva.setId_Reserva(consulta.getInt(2));
                objReserva.setId_Vuelo(consulta.getInt(3));
                objReserva.setHora_Reserva(consulta.getString(4));
                objReserva.setFecha_Reserva(consulta.getString(5));
                listaReserva.add(objReserva); 
            }
            return listaReserva; 
        }
        catch(Exception error){
            System.out.println("ERROR: "+error);
        }  
        return null; 
    }
    
    public ArrayList consultar(int reserva){
        try{
            objReserva.setReserva(reserva);
            ResultSet consulta = objReserva.consultarReserva(); 
            ArrayList<Reserva> listaReserva = new ArrayList<>(); 
            
            while(consulta.next()){
                objReserva = new Reserva(); 
                objReserva.setRserva(consulta.getInt(1));
                objReserva.setId_Reserva(consulta.getInt(2));
                objReserva.setId_Vuelo(consulta.getInt(3));
                objReserva.setHora_Reserva(consulta.getString(4));
                objReserva.setFecha_Reserva(consulta.getString(5));
                listaReserva.add(objReserva); 


            }
            return listaProducto; 
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
