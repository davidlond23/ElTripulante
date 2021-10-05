USE elTripulante;   

INSERT INTO categoria VALUES (1, "Economica");
INSERT INTO categoria VALUES (2, "Ejecutiva");
INSERT INTO categoria VALUES (3, "Primera Clase");


INSERT INTO tipodocumento VALUES (1, "Tarjeta de Identidad");
INSERT INTO tipodocumento VALUES (2, "Cedula de Ciudadania");
INSERT INTO tipodocumento VALUES (3, "Cédula de Extranjería");
INSERT INTO tipodocumento VALUES (4, "Pasaporte");
INSERT INTO tipodocumento VALUES (5, "Registro de Nacimiento");

INSERT INTO pais VALUES (1, "Colombia");
INSERT INTO ciudad VALUES (1, "Bogota", 1);
INSERT INTO ciudad VALUES (2, "Medellín", 1);
INSERT INTO ciudad VALUES (3, "Cali", 1);
INSERT INTO ciudad VALUES (4, "Santa Marta", 1);
INSERT INTO ciudad VALUES (5, "Cartagena", 1);
INSERT INTO ciudad VALUES (6, "Bucaramanga", 1);
INSERT INTO ciudad VALUES (7, "Pasto", 1);
INSERT INTO ciudad VALUES (8, "Pereira", 1);
INSERT INTO ciudad VALUES (9, "Manizales", 1);
INSERT INTO ciudad VALUES (10, "Cúcuta", 1);

INSERT INTO pais VALUES (2, "Argentina");
INSERT INTO ciudad VALUES (11, "Buenos Aires", 2);
INSERT INTO ciudad VALUES (12, "Córdoba ", 2);
INSERT INTO ciudad VALUES (13, "Rosario ", 2);
INSERT INTO ciudad VALUES (14, "La Plata", 2);
INSERT INTO ciudad VALUES (15, "Mar del Plata", 2);
INSERT INTO ciudad VALUES (16, "Salta ", 2);

INSERT INTO pais VALUES (3, "Peru");
INSERT INTO ciudad VALUES (17, "Lima", 3);
INSERT INTO ciudad VALUES (18, "Arequipa", 3);
INSERT INTO ciudad VALUES (19, "Callao", 3);

INSERT INTO pais VALUES (4, "Brasil");
INSERT INTO ciudad VALUES (20, "São Paulo", 4);
INSERT INTO ciudad VALUES (21, "Rio de Janeiro", 4);
INSERT INTO ciudad VALUES (22, "Salvador", 4);
INSERT INTO ciudad VALUES (23, "Brasilia", 4);

INSERT INTO pais VALUES (5, "Chile");
INSERT INTO ciudad VALUES (24, "Concepción", 5);
INSERT INTO ciudad VALUES (25, "Punta Arenas", 5);
INSERT INTO ciudad VALUES (26, "Valparaíso", 5);
INSERT INTO ciudad VALUES (27, "Viña del Mar", 5);


INSERT INTO aerolinea VALUES (1, "Avianca");
INSERT INTO aerolinea VALUES (2, "Viva Air");
INSERT INTO aerolinea VALUES (3, "Latam");
INSERT INTO aerolinea VALUES (4, "EasyFly");
INSERT INTO aerolinea VALUES (5, "AirFrance");
INSERT INTO aerolinea VALUES (6, "Satena");
INSERT INTO aerolinea VALUES (10, "Delta");
INSERT INTO aerolinea VALUES (11, "Wingo");
INSERT INTO aerolinea VALUES (12, "Regional Express Americas");


INSERT INTO vuelo VALUES (1, 1, 5, '2021-12-24', null, '05:00:00', null, 1, 700000, 1, 3);
INSERT INTO vuelo VALUES (2, 2, 14, '2021-12-24', null, '12:30:00', null, 3, 160000, 2, 1);
INSERT INTO vuelo VALUES (3, 3, 19, '2021-12-24', '2021-12-25', '16:00:00', '11:30:00', 1, 699000, 5, 1);
INSERT INTO vuelo VALUES (4, 4, 21, '2021-12-24', '2021-12-25', '22:30:00', '08:00:00', 2, 450000, 7, 3);
INSERT INTO vuelo VALUES (5, 5, 26, '2021-12-24', '2021-12-25', '09:00:00', '15:30:00', 3, 708000, 5, 4);
INSERT INTO vuelo VALUES (6, 6, 27, '2021-12-25', null, '06:00:00', null, 1, 750000, 10, 12);
INSERT INTO vuelo VALUES (7, 7, 22, '2021-12-25', null, '13:30:00', null, 2, 965000, 3, 10);
INSERT INTO vuelo VALUES (8, 8, 11, '2021-12-25', '2021-12-26', '17:00:00', '12:30:00', 3, 450000, 2, 11);
INSERT INTO vuelo VALUES (9, 9, 10, '2021-12-25', '2021-12-26', '23:30:00', '09:00:00', 2, 836000, 3, 10);
INSERT INTO vuelo VALUES (10, 10, 1, '2021-12-25', '2021-12-26', '10:00:00', '16:30:00', 1, 956000, 2, 11);