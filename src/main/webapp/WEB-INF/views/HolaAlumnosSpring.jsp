<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<p>Hola ${param.nombreAlumno}. Bienvenido al curso de Spring</p>

	<br>
	<h3>Atencion</h3>
	<!-- llamamos al atributo agregado al model del request mapping procesarFormulario2 -->
	<p>${mensaje}</p>

	<!-- jsptag pageContext.request.contextPath nos devuelve la raiz del sitio web. osea la carpeta webapp -->
	<img alt="alumno"
		src="${pageContext.request.contextPath}/recursos/img/img.png">
</body>
</html>