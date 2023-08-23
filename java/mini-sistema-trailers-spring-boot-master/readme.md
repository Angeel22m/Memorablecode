AdminControlador
En resumen, este controlador maneja las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para películas en una aplicación web. Gestiona la interacción con la base de datos, las validaciones de entrada y la gestión de archivos (como las portadas de películas).
1.	Clase del Controlador: La clase AdminControlador es un controlador de Spring que se encarga de las operaciones relacionadas con la administración de películas en la aplicación.
2.	Inyección de Dependencias: El controlador utiliza la anotación @Autowired para inyectar instancias de diferentes repositorios y servicios, como PeliculaRepositorio, GeneroRepositorio y AlmacenServicioImpl. Estas dependencias se utilizan para interactuar con la base de datos y para gestionar el almacenamiento de archivos.
3.	Mapeo de Rutas y Métodos HTTP:
•	@GetMapping(""): Maneja las solicitudes GET a la ruta raíz "/admin". Muestra una lista paginada de películas en la vista "admin/index".
•	@GetMapping("/peliculas/nuevo"): Maneja las solicitudes GET para mostrar el formulario de creación de nuevas películas en la vista "admin/nueva-pelicula".
•	@PostMapping("/peliculas/nuevo"): Maneja las solicitudes POST para registrar una nueva película. Valida la entrada y, si es válida, almacena la película en la base de datos y redirige al usuario a la página principal.
•	@GetMapping("/peliculas/{id}/editar"): Maneja las solicitudes GET para mostrar el formulario de edición de una película existente en la vista "admin/editar-pelicula".
•	@PostMapping("/peliculas/{id}/editar"): Maneja las solicitudes POST para actualizar una película existente. Realiza validaciones, actualiza los datos en la base de datos y redirige al usuario a la página principal.
•	@PostMapping("/peliculas/{id}/eliminar"): Maneja las solicitudes POST para eliminar una película. Borra la película de la base de datos y elimina el archivo de portada asociado.
4.	ModelAndView: Se utiliza para modelar la vista y los datos que se pasarán a la vista. En las operaciones mostrarFormularioDeNuevaPelicula(), registrarPelicula(), mostrarFormilarioDeEditarPelicula(), actualizarPelicula(), y en otras, se crea un objeto ModelAndView y se agregan objetos como pelicula (una instancia de Pelicula) y generos (una lista de Genero).
5.	Validación y BindingResult: Las anotaciones @Validated y BindingResult se utilizan para realizar validaciones en las entradas de los formularios. Si hay errores de validación, se manejan y se devuelve la vista correspondiente para mostrar los errores.
	
AssetsControlador
En resumen, este controlador está diseñado para servir recursos estáticos, como archivos, desde el servidor. Esto podría incluir imágenes, hojas de estilo CSS, archivos JavaScript u otros tipos de recursos. El nombre del archivo se pasa como parte de la URL, y el controlador utiliza un servicio AlmacenServicioImpl para cargar el recurso y devolverlo como respuesta al cliente.
HomeControlador
En resumen, este controlador maneja las rutas relacionadas con la página de inicio, la lista de películas y la visualización de detalles de una película en una aplicación web. Utiliza el repositorio PeliculaRepositorio para obtener y mostrar información de la base de datos en diferentes vistas.

Genero.java
En resumen, la clase Genero es una entidad JPA que representa un género cinematográfico. Se utiliza para interactuar con la base de datos y almacenar información sobre los géneros de películas. Los constructores permiten crear instancias de la clase con diferentes combinaciones de atributos, y los métodos getter y setter facilitan el acceso y la modificación de los valores de los atributos.
Película.java
En resumen, la clase Pelicula representa una película en una aplicación, con todos los atributos necesarios y anotaciones para definir cómo se mapea a la base de datos. Los constructores permiten crear instancias con diferentes combinaciones de atributos, y los métodos getter y setter facilitan el acceso y la modificación de los valores de la película.
AlmacenServicio
En resumen, esta interfaz AlmacenServicio define un conjunto de operaciones para gestionar el almacenamiento y manipulación de archivos en una aplicación. Implementar esta interfaz en una clase concreta permitiría establecer la lógica real detrás de cada uno de estos métodos, como almacenar archivos, cargar archivos, eliminar archivos, etc.
AlmacenServicioImpl
En resumen, esta implementación de AlmacenServicio se encarga de administrar el almacenamiento y manejo de archivos en una aplicación. Proporciona métodos para crear directorios de almacenamiento, almacenar y cargar archivos, obtener recursos y eliminar archivos. Cada método maneja excepciones específicas y proporciona un flujo controlado para las operaciones de almacenamiento de archivos.
