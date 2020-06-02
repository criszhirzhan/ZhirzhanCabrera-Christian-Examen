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

	<form action="/ZhirzhanCabrera-Examen/IngresarLibro" method="POST">
		<label for="fname">ISBN:</label><br> <input
			type="text" id="fname" name="ISBN"><br> <label
			for="lname">Nombres:</label><br> <input type="text" id="lname"
			name="titulo"><br><br> <label for="fname">Numero Paginas:</label><br>
			<input type="text" id="lname"
			name="paginas"><br><br>
			
			
			<input type="submit" name="ingresarCapitulo" value="IngresarCapitulo" >
	</form>

</body>
</html>