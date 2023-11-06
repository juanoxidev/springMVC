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



[Spring API docs](https://docs.spring.io/spring-framework/docs/3.1.1.RELEASE/javadoc-api/)
[Form MVC Tags](https://www.javatpoint.com/spring-mvc-form-tag-library)