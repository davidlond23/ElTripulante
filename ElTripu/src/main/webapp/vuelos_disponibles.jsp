<%-- 
    Document   : vuelos_disponibles
    Created on : 6/10/2021, 03:04:50 PM
    Author     : 15db-0005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE jsp>
<jsp lang="es">
    <head>
        <title>Disponibilidad</title>
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
                <a href="vuelos_Disponibles.jsp"><i class="fa fa-search"></i></a> 
                <a href="index.jsp"><i class="fa fa-money"></i></a> 
                <a href="reserva.jsp"><i class="fa fa-globe"></i></a>
                <a href="index.jsp"><i class="fa fa-plane"></i></a> 
        </div>
    <center>
        <br>
        <table style="width: 95%" >
            <thead>
                <tr style="height: 200px">
                    <td style="width: 30%">
                    <img src="assets/img/Isla.jpg" alt="ElTripulante"> 
                    </td>
                    <td style="width: 1%"></td>
                    <td style="width: 79%"> 
                        <h2 class="Text">Vuelos disponibles</h2> 
                        
                        <button class="accordion">Vuelo 1</button>
                        <div class="panel">
                            <p>IdVuelo      Aerolinea     Origen     Origen     Destino     Categoria     Precio Fecha ida     Fecha regreso     Hora salida     Hora llegada     Sillas</p>
                            <h4>Precio</h4>
                        </div>

                        <button class="accordion">Vuelo 2</button>
                        <div class="panel">
                            <p>IdVuelo      Aerolinea     Origen     Origen     Destino     Categoria     Precio Fecha ida     Fecha regreso     Hora salida     Hora llegada     Sillas</p>
                            <h4>Precio</h4>
                        </div>

                        <button class="accordion">Vuelo 3</button>
                        <div class="panel">
                            <p>IdVuelo      Aerolinea     Origen     Origen     Destino     Categoria     Precio Fecha ida     Fecha regreso     Hora salida     Hora llegada     Sillas</p>
                            <h4>Precio</h4>
                        </div>
                        
			
                    </td>
        </table>
        </center>
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
    
    <script>
        var acc = document.getElementsByClassName("accordion");
        var i;

        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight) {
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
    </script>
    
    </body>
</jsp>