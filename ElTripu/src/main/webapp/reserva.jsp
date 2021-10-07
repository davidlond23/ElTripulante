<%-- 
    Document   : reserva
    Created on : 6/10/2021, 02:56:56 PM
    Author     : 15db-0005
--%>

<%@page import="Controladores.ControlUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE jsp>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<head>
    <title>Reservas</title>
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
    <br><br><br>
    <hr>
    <table>
        <center>
        <thead>
            <tr>
                <td style= "width: 250px; background-color: #06357a; color: #ffca2c; font-size: 30px;">Datos requeridos</td>
                <td></td>
                <td style= "width: 250px;  background-color:#06357a; color:#ffca2c; font-size: 30px;">Menor</td>
            </tr>
        </thead>
        <tbody>
            <form method="POST" action="ControlUsuario">
                <tr>
                    <td><label for="nombre_usuario">Nombre completo</label></td>
                    <td><input type="text" id="name" name="nombre_usuario" /></td>
                    <td><label for="childName">Nombre completo</label></td>
                    <td><input type="text" id="childName" name="userChildName" /></td>
                </tr>
                <tr>
                    <td>Tipo de identificación</td>
                    <td><select name="tipodoc_usuario">
                        <option value="1">Tarjeta de Identidad</option> 
                        <option value="2">Cedula de Ciudadania</option> 
                        <option value="3">Cédula de Extranjería</option>
                        <option value="4">Pasaporte</option>
                        <option value="5">Registro de Nacimiento</option>
                        </select></td>
                    <td><label for="childIdNum">Número de identificación</label></td>
                    <td><input type="number" id="childIdNum" name="userChildId" /></td>
                </tr>
                <tr>
                    <td><label for="numdoc_usuario">Número de identificación</label></td>
                    <td><input type="text" id="idNum" name="numdoc_usuario" /></td>
                </tr>
                <tr>
                    <td><label for="fecnac_usuario">Fecha de nacimiento</label></td>
                    <td>
                        <input type="date" id="bdate" name="fecnac_usuario"
                               value="2021-09-20"
                               min="1921-01-01" max="2021-09-20">
                        </td>
                </tr>
                <tr>
                    <td><label for="telefono_usuario">Número de teléfono</label></td>
                    <td><input type="text" id="phone" name="telefono_usuario" /></td>
                </tr>
                <tr>
                    <td><label for="correo_usuario">Correo electrónico</label>
                    <td><input type="email" id="mail" name="correo_usuario" /></td>
                    <td style="text-align: right;">
                        <button class="button" value="Insertar" name="btnReservar"> Reservar </button>
                    </td>
                </tr>
            </form>
        </tbody>
        </center>
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


