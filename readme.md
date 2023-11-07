## SRC/WEBAPP/WEB-INF

### WEB.XML
servlet-name por convencion es dispatcher
init-param value debe ser igual al nombre del servidor de servlet

url del servlet 
servlet-mapping desde WEB-INF donde se encuentra el archivo indicado init-param value
en este caso esta en / carpeta raiz (WEB-INF) 

### SPRING_MVC_SERVLET.XML

context:component-scan en que paquete se encuentran los componentes a escanear

como resuelve las url de las vistas:
indicandode la clase, un prefijo y un sufijo

prefix: apunta a una carpeta donde se encuentran las vistas/view
suffix: la extension que van a tener las vistas (.jsp)


## Que es el modelo en Spring?
No es exclusivamente la base de datos, es el contenedor de datos de la aplicacion, se pueden agregar datos adicionales para que los muestre la vista, podemos agregar datos almacenados en la BBDD, objetos java, colecciones. Para agregar informacion al modelo podemos usar la intergaz Model con el metodo addAtributte. El model es un puente entre las views y los controllers. 

## Rutas relativas con RequestMapping
Debajo de la annotation Controller indicamos con un @RequestMapping("/rutaprincipaldelcontroller") la ruta pricipal de ese controller.
En el primer llamado al requestMapping del controller hay que pasarle /rutaprincipal/urlrequestmapping

## Form MVC TAGS
Son etiquetas reutlizables que construyen bloques HTML (componentes de formulario)
Sirven de "puente" (data-binding) capaces de enviar y recibir informacion de objetos Java (beans) desde codigo HTML. 

## Validaciones con Hibernate Validator y Javax-Validation
Debemos detectar cual es el metodo del controlador que procesa el formulario.
Una vez alli, debemos especificar la validacion que estamos queriendo hacer.
Cuando utilizamos validacion, el resultado de la misma ya sea positiva o negativa se almacena en un objeto de tipo BindingResult, debemos contrurir un objeto de ese tipo dentro de los argumentos del metodo que procesa el formulario. 

## @InitBinder
- Comprueba la peticion al controlador antes de que llegue a este.
- Se aplica la anotacion a un metodo que sera el encargado de procesar previamente la peticion.
- Se ejecuta el metodo.
- Se ejecuta el resto de la peticion en caso de que la validacion sea correcta.
- No sigue el flujo del metodo en caso de que la validacion de resultado incorrecto.


- [Spring API docs](https://docs.spring.io/spring-framework/docs/3.1.1.RELEASE/javadoc-api/)
- [Form MVC Tags](https://www.javatpoint.com/spring-mvc-form-tag-library)
- [Spring Form Tags Docu](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/spring-form-tld.html)
- [Spring Form Tags Ejemplos](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/view.html)
- [Bean Validation](https://www.baeldung.com/java-validation)
- [Hibernate Validator](https://hibernate.org/validator/)
- [Hibernate Validator 4.3 Docu](https://docs.jboss.org/hibernate/validator/4.3/reference/en-US/html_single/#validator-usingvalidator-annotate)
- [MVC Validation Example](https://www.javatpoint.com/spring-mvc-validation)
-[Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)