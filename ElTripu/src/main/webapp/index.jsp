<%-- 
    Document   : index
    Created on : 5/10/2021, 07:13:39 PM
    Author     : User
--%>
<%@page import="Controladores.ControladorVuelo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelos.Vuelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE jsp>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<jsp lang="es">
    <head>
        <title>Aeropuerto El Cóndor</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="icon" type="image/x-icon" href="favicon.ico">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="./estilos.css" media="all" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    </head>
    <body>
        <script type="text/javascript">
            function confirmar(){
                var respuesta = confirm("¿Desea reservar el vuelo?"); 
                if(respuesta === true){
                    return true; 
                }
                else{
                    return false; 
                }
            }
        </script>
        <div class= "login aTextR">
            <label> Usuario </label>
                    <input type="text" placeholder="ETBG" name="Usuario">
            <label> Contraseña </label>
                    <input type="text" placeholder="1234" name="Contraseña">
            <a href="Administracion">Login</a> 
        </div>            
            
            <div>
                <a href="index.jsp">
                    <img src="assets/img/Logo.jpg" width= 100% height="300" alt="ElTripulante"> 
                </a>
            </div>
            <div class="icon-bar">
                <a class="active" href="index.jsp"><i class="fa fa-home"></i></a> 
                <a href="vuelos_disponibles.jsp"><i class="fa fa-search"></i></a> 
                <a href="index.jsp"><i class="fa fa-money"></i></a> 
                <a href="reserva.jsp"><i class="fa fa-globe"></i></a>
                <a href="index.jsp"><i class="fa fa-plane"></i></a> 
            </div>
            
            <table style="width: 100%" >
            <thead>
                <tr style="height:200px">
                    <td style="width: 20%">
                        <center>              
                            <h3>Aeropuerto el C&oacute;ndor</h3>
                            <br>
                            <img src="assets/img/Isla.jpg" alt="Isla">
                            <br>
                            <h4>Vuela alto, vuela lejos</h4> 
                        </center>
                    </td>
                    
                    <td style="width:300%"> <center><h3>Encuentra el vuelo adecuado</h3> </center>
                    <form method="GET" value="Insertar" action="ControlVuelo">
                            <br>
                            <center>
                            <label> Ida </label>
                            <input type="radio" value="Ida" name="Ida">
                            <label> Ida y Vuelta </label>
                            <input type="radio" value="Ida y Vuelta" name="Ida y Vuelta">
                            <br>
                            <br>
                            <label> Destino: </label>
                            <input type="text" placeholder="Bogotá" name="Destino">
                            <br>
                            <br>
                            <label> Fecha de ida: </label>
                            <input type="date" name="Fecha de ida">
                            <br>
                            <br>
                            <label> Fecha de regreso: </label>
                            <input type="date" name="Fecha de regreso">
                            <br>
                            <br>
                            <label> Pasajeros: </label>
                            <br>
                            <br>
                            <label> Adultos: </label>
                            <input type="number" name="Adultos">
                            <br>
                            <label> Niños: </label>
                            <input type="number" name="Niños">
                            <br>
                            </center>
                            <div>
                            <center>                               
                            <button value="Listar" name="btnBuscar"> BUSCAR</button>
                            </center>
                            </div>
                    </form>
                </tr>
            </thead>
        </table>
                
        <footer class="footer pt-5">
            <center>
                <div>
                    <div>
                      <h5> Síguenos</h5>
                          <a class="navbar-brand" href="https://facebook.com">
                            <img src="assets/img/facebook.png" width="30" height="30" alt="ElTripulante">
                          </a>
                          <a class="navbar-brand" href="https://twitter.com">
                            <img src="assets/img/gorjeo.png" width="30" height="30" alt="ElTripulante">
                          </a>
                          <a class="navbar-brand" href="http://instagram.com">
                            <img src="assets/img/instagram.png" width="30" height="30" alt="ElTripulante">
                          </a>
                    </div>
                </div>

                <div>2021 -
                   <a class="aTextR" href="index.jsp" >El Tripulante ©</a>
                </div>
            </center>
        </footer>
    </body>
</jsp>