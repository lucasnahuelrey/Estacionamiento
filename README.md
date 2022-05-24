# Estacionamiento

ESPAÑOL (SPANISH)
Esta es una aplicación creada en Java, con uso de base de datos MySQL, que permite gestionar un estacionamiento. Esto es un trabajo en progreso, por lo que algunas características no están todavía implementadas. Versión en español únicamente.

Características generales:
Permite almacenar vehículos estacionados en la base de datos (automóviles, camionetas, motocicletas y bicicletas) y eliminarlos cuando éstos abandonan el estacionamiento.
Permite mostrar una lista de los vehículos estacionados actualmente.
Permite mostrar los ingresos de dinero.

Características de la aplicación:
Ventana principal: contiene una imagen, los botones Ingresar vehículo, Retirar vehículo, Listar vehículos estacionados, Listar ingresos y Salir. Los primeros cuatro botones permiten acceder a otras ventanas mencionadas a continuación, mientras que el último permite salir de la aplicación. Se muestran los vehículos estacionados por tipo (aún no implementado)
Ventana Ingresar vehículo: permite ingresar un nuevo vehículo estacionado a la base de datos. Para ello es obligatorio completar todos los campos requeridos (tipo de vehículo, nombre propietario, DNI propietario, marca, modelo, color, patente). Una vez completados todos los campos, al pulsar en el botón Guardar, el vehículo es ingresado a la base de datos y se le asigna un número de Ticket. El botón Cancelar permite salir de la ventana y regresar a la ventana principal.
Ventana Retirar vehículo: muestra una tabla con todos los vehículos estacionados y sus datos. Se puede filtrar la tabla completando un DNI de propietario y haciendo clic en el botón Buscar. Cuando un vehículo es seleccionado de la tabla y se pulsa el botón Retirar vehículo, éste es removido de la base de datos. El botón Cancelar cierra la ventana y permite volver a la ventana principal.
Ventana Vehículos estacionados: muestra una tabla con todos los vehículos estacionados y sus datos. El botón Cerrar cierra la ventana.
Ventana Ingresos: muestra una lista con los ingresos de dinero producidos por el estacionamiento. El botón Cerrar cierra la ventana.



INGLÉS (ENGLISH)
This is an application created in Java, with use of MySQL database, that allows a parking area management. This is a work in progress, so some features are not yet implemented. Spanish version only.

General features:
Allows storing of parked vehicules in database (cars, pickups, motorbikes and bikes), and removal of them when they leave the parking.
Allows listing of currently parked vehicles.
Allows listing of money income.

Application features:
Main Window: contains an image, the Enter vehicle button, the Withdraw vehicle button, the List parked vehicles button, the List income button and the Exit button. The first four buttons allow to open other windows mentioned below, and the last one allows to exit the application. The number and type of vehicles is shown (not yet implemented)
Enter vehicle window: allows to store a new vehicle in database. All fields are required to do so (vehicle type, owner name, PIN of owner, brand, model, color and license plate of the vehicle). When all fields are filled, and the Save button is clicked, the vehicle is stored in database and is assigned a Ticket number. The Cancel button exits the window, allowing to go back to the main window.
Withdraw vehicle window: shows a table with all parked vehicles and its data. The table can be filtered by writing an Owner PIN and clicking the Search button. When a vehicle is selected in the table and the Withdraw vehicle is clicked, it is removed from the database. The Cancel button closes this window.
Parked vehicles button: shows a table with parked vehicles and its data. The Close button closes this window.
Income button: show a list of all money income produced by the parking area. The Close button closes this window.
