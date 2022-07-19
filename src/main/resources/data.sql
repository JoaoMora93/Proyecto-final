INSERT INTO CLIENTE
(clienteId, dni, apellido, nombre )
VALUES
(0001, 11112222, "Morales", "Raul"),
(0002, 11113333, "Rodriguez", "Rodrigo"),
(0003, 22221111, "Gonzalez", "Enrique"),
(0004, 33334444, "Morales", "Juan");

INSERT INTO PRODUCTO
(productoId, codigo, precio, cantitdadProducto, descripcion)
VALUES
(0001, 00112233, 300, 1500, "Limpiador de pelo para perros chicos"),
(0002, 00112234, 1000, 1000,"Pelelas para adultos"),
(0003, 00112235, 250, 3000, "Posa vasos de bamboo"),
(0004, 00112236, 35, 500, "Manteca vegetal de girasol");

INSERT INTO COMPRA
(compraId, clienteId, productoId, cantidadCompra, fecha, total)
VALUES
(0001, 0002, 0003, 2, "2022-07-04 20:01:00", 0),
(0002, 0001, 0002, 2, "2022-07-04 20:02:00", 0),
(0003, 0004, 0001, 2, "2022-07-04 20:03:00", 0),
(0004, 0003, 0004, 2, "2022-07-04 20:04:00", 0);

INSERT INTO VENTA
(ventaId, clienteId, compraId, totalVenta)
VALUES
(0001, 0002, 0001, 0),
(0002, 0001, 0002, 0),
(0003, 0004, 0003, 0),
(0004, 0003, 0004, 0);
