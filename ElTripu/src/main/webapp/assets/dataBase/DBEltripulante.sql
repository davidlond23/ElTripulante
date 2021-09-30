CREATE DATABASE elTripulante; 
USE elTripulante;   
CREATE TABLE usuario  
(     
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
	nombre_usuario VARCHAR(50) NOT NULL,
	tipodoc_usuario INT NOT NULL,
	numdoc_usuario VARCHAR(12) NOT NULL,
	telefono_usuario VARCHAR(13) NOT NULL,
	correo_usuario VARCHAR(50) NOT NULL,
	fecnac_usuario DATE NOT NULL,
	id_menor INT NULL
);  
CREATE TABLE tipodocumento 
(     
    id_tipodoc INT PRIMARY KEY AUTO_INCREMENT,
	desc_tipodoc VARCHAR(20) NOT NULL
); 

CREATE TABLE menor 
(     
	id_menor INT PRIMARY KEY AUTO_INCREMENT,
	id_usuario INT NOT NULL,
	tipodoc_menor INT NOT NULL,
	numdoc_menor VARCHAR(12) NOT NULL,
	fecnac_menor DATE NOT NULL
); 

CREATE TABLE reserva 
(      
    id_reserva INT PRIMARY KEY AUTO_INCREMENT,
	id_usuario INT NOT NULL,
	id_vuelo INT NOT NULL,
	hora_reserva TIME NOT NULL,
	fecha_reserva DATE NOT NULL
); 

CREATE TABLE ciudad 
(     
    id_ciudad INT PRIMARY KEY AUTO_INCREMENT,
	desc_ciudad VARCHAR(50) NOT NULL,
	id_pais INT NOT NULL
); 

CREATE TABLE pais 
(     
    id_pais INT PRIMARY KEY AUTO_INCREMENT,
	desc_pais VARCHAR(50) NOT NULL
); 


CREATE TABLE aerolinea
(
    id_aerolinea INT PRIMARY KEY,
    desc_aerolinea VARCHAR (20) NOT null
);

CREATE TABLE vuelo
(
	id_vuelo INT PRIMARY KEY AUTO_INCREMENT,
	origen_vuelo INT NOT NULL,
	destino_vuelo INT NOT NULL,
	fechaida_vuelo DATE NOT NULL,
	fecharegreso_vuelo DATE NOT NULL,
	horasalida_vuelo TIME NOT NULL,
	horaregreso_vuelo TIME NOT NULL,
	id_categoria INT NOT NULL,
	precio_vuelo FLOAT NOT NULL,
	sillas_vuelo INT NOT NULL,
	id_aerolinea INT NOT NULL
);

CREATE TABLE categoria
(
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
	desc_categoria VARCHAR (15) NOT NULL
);

