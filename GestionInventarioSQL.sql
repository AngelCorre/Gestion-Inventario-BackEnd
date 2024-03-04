create database gestioninventario;

use gestioninventario;

drop database gestioninventario;

SELECT * FROM proveedores;
SELECT * FROM direcciones;
SELECT * FROM productos;

INSERT INTO productos values
(1, 2, 10, 'manzana');
describe productos;

INSERT INTO proveedores values
(2, "asdsa", 1, 1);

INSERT INTO direcciones values
(1, '1ra privada', 'San Pedro Atzompa', 'Edo Mex', 12, 23);

SELECT po.producto_descripcion FROM productos po JOIN proveedores pr on po.id = pr.id_producto;
SELECT di.estado FROM direcciones di JOIN proveedores pr ON di.id = pr.id_direccion;

drop table productos;