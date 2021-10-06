<%-- 
    Document   : reserva
    Created on : 6/10/2021, 02:56:56 PM
    Author     : 15db-0005
--%>

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
            <tr>
                <td><label for="name">Nombre completo</label></td>
                <td><input type="text" id="name" name="userName" /></td>
                <td><label for="childName">Nombre completo</label></td>
                <td><input type="text" id="childName" name="userChildName" /></td>
            </tr>
            <tr>
                <td>Tipo de identificación</td>
                <td><select name="idType">
                    <option value="1">Cédula de ciudadanía</option> 
                    <option value="2">Cédula de extranjería</option> 
                    <option value="3">Pasaporte</option>
                    </select></td>
                <td><label for="childIdNum">Número de identificación</label></td>
                <td><input type="number" id="childIdNum" name="userChildId" /></td>
            </tr>
            <tr>
                <td><label for="idNum">Número de identificación</label></td>
                <td><input type="number" id="idNum" name="userId" /></td>
            </tr>
            <tr>
                <td><label for="bdate">Fecha de nacimiento</label></td>
                <td>
                    <input type="date" id="bdate" name="userBirthDate"
                           value="2021-09-20"
                           min="1921-01-01" max="2021-09-20">
                    </td>
            </tr>
            <tr>
                <td><label for="phone">Número de teléfono</label></td>
                <td><input type="number" id="phone" name="userPhone" /></td>
            </tr>
            <tr>
                <td><label for="mail">Correo electrónico</label>
                <td><input type="email" id="mail" name="userEmail" /></td>
                <td style="text-align: right;">
                    <button class="button"> Reservar </button>
                </td>
            </tr>
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


