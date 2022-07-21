
DROP TABLE VENTA IF EXISTS ;
DROP TABLE COMPRA IF EXISTS ;
DROP TABLE CLIENTE IF EXISTS ;
DROP TABLE PRODUCTO IF EXISTS ;

CREATE TABLE CLIENTE (
clienteId INTEGER NOT NULL,
dni INTEGER NOT NULL,
apellido VARCHAR(150) NOT NULL,
nombre VARCHAR(150) NOT NULL,
PRIMARY KEY (clienteId)
);

CREATE TABLE PRODUCTO (
productoId INTEGER NOT NULL,
codigo INTEGER NOT NULL,
precio DECIMAL NOT NULL,
cantitdadProducto INTEGER NOT NULL,
descripcion VARCHAR(150) NOT NULL,
PRIMARY KEY (productoId)
);

CREATE TABLE COMPRA (
compraId INTEGER NOT NULL,
clienteId INTEGER NOT NULL,
productoId INTEGER NOT NULL,
cantidadCompra INTEGER NOT NULL,
fecha DATETIME NOT NULL,
total DECIMAL NOT NULL,
PRIMARY KEY (compraId),
FOREIGN KEY (clienteId) REFERENCES Cliente (clienteId),
FOREIGN KEY (productoId) REFERENCES Producto (productoId)
);

CREATE TABLE VENTA (
ventaId INTEGER NOT NULL,
clienteId INTEGER NOT NULL,
compraId INTEGER NOT NULL,
totalVenta DECIMAL NOT NULL,
PRIMARY KEY (ventaId),
FOREIGN KEY (compraId) REFERENCES Compra (compraId)
);