<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="au" value="${requestScope['autor']}" />
	<h2>Registrar Capitulo</h2>

	<form action="/ZhirzhanCabrera-Examen/IngresarCapitulo" method="POST">
		<label for="fname">Numero Capitulo:</label><br> <input
			type="text" id="fname" name="numeroCapitulo"><br> <label
			for="lname">Titulo:</label><br> <input type="text" id="lname"
			name="titulo"><br> <label for="fname">Autor:</label>
		<br> <select name="tip" id="seleccion" class="custom-select mb-3">
			<option selected>Seleccionar</option>
			<c:forEach var="autor" items="${au}">
				<option>${autor.nombre}</option>
			</c:forEach>

		</select> 
		<input type="submit" name="ingresarCapitulo" value="IngresarCapitulo" >
	</form>

</body>
</html>