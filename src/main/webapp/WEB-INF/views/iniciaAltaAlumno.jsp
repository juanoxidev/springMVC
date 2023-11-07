<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
</head>
<body>
<!-- Form MVC Spring tags -->
<!-- modelAttribute: debemos introducir el nombre identificativo 
que le hemos dado al atributo del modelo en el controlador
en este caso es "inscripto"-->
<!-- action: Url a donde ira la informacion, debe coincidir con el requestMapping del controlador-->
<form:form action="procesarFormulario" modelAttribute="inscripto"> 
<!-- path: hace referencia a los metodos getters y setters que estan construidos en la clase correspondiente, en este caso Alumnos, 
debemos colocar lo que hay despues del get/set pero con minusculas.-->
<!-- Este formulario primero se carga y luego se envia, en el momento que se carga estamos invocando al getter de nombre 
y al momento de enviar llamamos al metodo setter de nombre-->
Nombre: <form:input path="nombre"/>

<!-- Le indicamos que  "nombre" puede contener un error en la validacion, el error lo toma desde la clase -->
<form:errors path="nombre"/>
<br/><br/>
Apellido: <form:input path="apellido"/>
<br/><br/>

Edad: <form:input path="edad"/>
<form:errors path="edad"/>
<br/><br/>

Email: <form:input path="email"/>
<form:errors path="email"/>

C.postal<form:input path="codPostal"/>
<form:errors path="codPostal"/>

<br/><br/>
<!-- Menu desplegable con opciones, input select -->
 
Asignaturas Optativas: <br>
<form:select path="materiaOptativa">
<form:option value="Diseño" label="Diseño"/>
<form:option value="Karate" label="Karate"/>
<form:option value="Comercio" label="Comercio"/>
</form:select>

<%-- Menu desplegable con posibilidad de elegir varias opciones manteniendo tecla Ctrol

Asignaturas Optativas: <br>
<form:select path="materiaOptativa" multiple="true">
<form:option value="Diseño" label="Diseño"/>
<form:option value="Karate" label="Karate"/>
<form:option value="Comercio" label="Comercio"/>
</form:select>

 --%>

<br/><br/>

Buenos Aires<form:radiobutton path="sede" value="Buenos Aires"/>
Mendoza<form:radiobutton path="sede" value="Mendoza"/>
Neuquen<form:radiobutton path="sede" value="Neuquen"/>
Cordoba<form:radiobutton path="sede" value="Cordoba"/>


<br/><br/>
Ingles<form:checkbox path="idioma" value="Ingles"/>
Chino<form:checkbox path="idioma" value="Chino"/>
Frances<form:checkbox path="idioma" value="Frances"/>
<br/><br/>

<input type="submit" value="Enviar">
</form:form>
</body>
</html>