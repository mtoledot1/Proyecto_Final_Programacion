
# Proyecto Final de Programación

# _OBJETIVOS:_

•	Modelación mediante diagramas de clase.

•	Implementación de herencia.

•	Implementación de arquitectura MVC-DAO.

•	Desarrollo de aplicaciones con capacidad de situar datos en archivos. 

•	Poner en práctica control de excepciones en el desarrollo de aplicaciones.

•	Uso de interfaz gráfica en el desarrollo de la aplicación.

•	Uso de la Interfaz Maestro-Detalle.


# _PROYECTO:_

1.	La tarea principal del proyecto será el desarrollo de un sistema que permita realizar la facturación de una distribuidora de productos para el hogar. La distribuidora cuenta con varios productos que se encuentran almacenados en diferentes bodegas ubicadas geográficamente a lo largo del país. 

Las funcionalidades del sistema son:

El sistema debe permitir iniciar sesión. Una vez iniciada sesión el sistema debe permitir:

o	Gestionar bodegas.

o	Gestionar productos.

o	Gestionar clientes.

o	Gestionar facturas (disminuir stock, anulación de facturas). Considerar que las facturas se deben generar, y una vez guardadas, no pueden ser ni modificadas ni eliminadas. Sin embargo, en caso de que una factura tenga algún error podrá ser anulada. La facturación deberá aplicar el modelo de maestro - detalle.

o	Consulta de inventario de los productos de la distribuidora.

o	Consulta de inventario por bodega de la distribuidora.

•	El sistema debe soportar Internacionalización de la Interfaz Gráfica de Usuario para los idiomas español e inglés.

•	El sistema debe utilizar archivos binarios para la persistencia de datos.

•	El sistema debe ser implementado usando el patrón de diseño MVC y DAO.


# *RESOLUCIÓN:*

Establecemos un diagrama UML donde se describe las propiedades, comportamientos y relaciones específicas de interfaz y clases.

![Diagrama](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/WhatsApp%20Image%202020-07-28%20at%2014.16.45.jpeg)




Con paquetes y sus respectivas clases, interfaz y Ventanas:

![Proyecto]()

En el paquete ec.edu.ups.modelo encontraremos las clases:

Clase “Persona”:

![Persona](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Persona.java)

Clase “Usuario” que hereda de persona:


![Usuario](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Usuario.java)

Clase “Cliente”:

![Cliente](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Cliente.java)

Clase “Producto”:

![Producto](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Producto.java)

Clase “Bodega”:

![Bodega](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Bodega.java)

Clase “Factura”:

![Factura](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/modelo/Factura.java)

En el paquete ec.edu.ups.dao encontraremos:

Clase “PersonaDAO”:

![PersonaDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/PersonaDAO.java)

Clase “UsuarioDAO”:

![UsuarioDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/UsuarioDAO.java)

Clase “ClienteDAO”:

![ClienteDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/ClienteDAO.java)

Clase “ProductoDAO”:

![ProductoDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/ProductoDAO.java)

Clase “BodegaDAO”:

![BodegaDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/BodegaDAO.java)

Clase “FacturaDAO”: 

![FacturaDAO](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/76ba14843a2040df8f0ffd2c87d799e2d1a3a010/src/ec/edu/ups/dao/FacturaDAO.java)


En el paquete ec.edu.ups.controlador encontraremos:

Clase “ControladorProducto”: 

![ProductoC]()

Clase “ControladorCliente”: 

![ClienteC](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/07ce37d6ebc312a7ec40b867ac6bf04bb77ffbe8/src/ec/edu/ups/controlador/ControladorCliente.java)

Clase “ControladorUsuario”: 

![UsuarioC](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/16598f4646df54727654439be08de33d213513d8/src/ec/edu/ups/controlador/ControladorUsuario.java)

Clase “ControladorBodega”: 

![BodegaC](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/07ce37d6ebc312a7ec40b867ac6bf04bb77ffbe8/src/ec/edu/ups/controlador/ControladorBodega.java)

Clase “ControladorFactura”: 

![FacturaC](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/07ce37d6ebc312a7ec40b867ac6bf04bb77ffbe8/src/ec/edu/ups/controlador/ControladorFactura.java)

En el paquete ec.edu.ups.idioma encontraremos:

Mensajes_es_EC.propeties:

![EC](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/16598f4646df54727654439be08de33d213513d8/build/classes/ec/edu/ups/idiomas/mensajes_es_EC.properties)

Mensajes_en_UK.propeties:

![UK](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/16598f4646df54727654439be08de33d213513d8/build/classes/ec/edu/ups/idiomas/mensajes_en_UK.properties)

En el paquete ec.edu.ups.ventana encontraremos:

VentanaPrincipal:

![PrincipalP](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaPrincipal.PNG)

VentanaClientes:

![ClientesP](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaCliente.PNG)

VentanaBodega:

![BodegaP](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaBodegas.PNG)


VentanaFactura:

![FacturaP](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaFactura.PNG)



VentanaGestionFactura:

![GestionFacturaV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaGestionFacturas.PNG)


VentanaIniciarSesion:

![IniciarSesion](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaIniciarSesion.PNG)


VentanaInventario:

![InventarioV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaInventario.PNG)

VentanaInventarioBodega:

![InventarioBodegaV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaInventarioBodega.PNG)

VentanaProducto:

![ProductoV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaProductos.PNG)


VentanaSeleccionCliente:

![SeleccionClienteV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaSeleccionCliente.PNG)


VentanaSeleccionProducto:

![SeleccionProductoV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaSeleeccionProducto.PNG)


VentanaUsuario:

![UsuarioV](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/VentanaUsuario.PNG)



# *HERRAMIENTAS:*

•	IDE:Apache NetBeans 11.3

•	Java JDK 14

# *RESULTADOS:*

•	Correcta modelación de diagramas de clase (UML).

•	Correcto manejo de Herencia entre clases.

•	Correcta implementación de arquitectura MVC-DAO para mejor funcionabilidad del programa.

•	Implementación de Internacionalización en los idiomas Español e Inglés.

•	Correcto manejo de archivos binarios con la clase “RandomAccessFile” para manipulación de archivos binarios.

•	Correcta implementación de la clase “Exception” para una adecuada manipulación de los archivos binarios.

•	Uso correcto de la Interfaz Maestro-Detalle.

# *CONCUSIONES:*

Para concluir, el realizar un trabajo grupal sobre el proyecto realizado nos ayudó a trabajar en equipo utilizando GitHub, ya que, al trabajar entre todos, nos ayudábamos a realizar el código cuando lo necesitábamos, también  una mayor comprensión y aplicación sobre casi todo lo estudiado en la materia; El manejo de archivos binarios nos ayudó a obtener datos ya creados y no tener que realizar casi todo el proceso de nuestro proyecto nuevamente, la interfaz gráfica nos sirvió de mucho para un mejor entendimiento de la aplicación y dentro de esto se aplicó la interfaz Maestro-Detalle donde se puede observar una lista maestra y los detalles del elemento, en nuestro proyecto aplicado a la Factura.

# *FIRMAS:*

Nombre de estudiante: Sebastián Toledo.

Firma:
![Firma](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/WhatsApp%20Image%202020-07-30%20at%2023.25.20.jpeg)

Nombre de estudiante: Bryam Parra.

Firma:
![Firma](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/WhatsApp%20Image%202020-07-30%20at%2020.16.58.jpeg)

Nombre de estudiante: Lisseth Reinoso.

Firma:
![Firma](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/img114.jpg)

Nombre de estudiante: Nicolás Orellana.

Firma:
![Firma](https://github.com/mtoledot1/Proyecto_Final_Programacion/blob/rama3/WhatsApp%20Image%202020-07-30%20at%2017.52.07.jpeg)






