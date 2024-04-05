<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Juego Ninja Gold</title>
	<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<p class="textoOro">Tu oro es: <span class="cantidadOro"><c:out value="${oro}"/></span></p>
	<div class="cuadros">
	
		<form class="cuadros_" action="/" method="POST">
			<h1>Granja</h1>
			<h3>(Ganas 10-20 de oro)</h3>
			<button type="submit" name="granja" value="granja">
				Encuentra Oro!
			</button>
		</form>
		
		<form class="cuadros_" action="/" method="POST">
			<h1>Cueva</h1>
			<h3>(Ganas 5-10 de oro)</h3>
			<button type="submit" name="cueva" value="cueva">
				Encuentra Oro!
			</button>
		</form>
		
		<form class="cuadros_" action="/" method="POST">
			<h1>Casa</h1>
			<h3>(Ganas 2-5 de oro)</h3>
			<button type="submit" name="casa" value="casa">
				Encuentra Oro!
			</button>
		</form>
		
		<form class="cuadros_" action="/" method="POST">
			<h1>Casino!</h1>
			<h3>(Ganas o Pierdes entre 0 - 50 de oro)</h3>
			<button type="submit" name="casino" value="casino">
				Encuentra Oro!
			</button>
		</form>
		
	</div>
	<div class="cuadroAbajo">
		<div style="display:flex; justify-content: center;">
			<p class="textoOro">Actividades</p>
		</div>
		<div class="cuadroComentario">
			<ul>
       			<c:forEach items="${registroActividades}" var="actividad">
                    <c:choose>
                        <c:when test="${actividad.oro < 0}">
                            <li style="color: red;"><b>Haz entrado a ${actividad.tipoActividad} </b> | Su transaccion fue: <c:out value="${actividad.oro}"/> de Oro perdidos! | A fecha de: ${actividad.fechaHora}</li>
                        </c:when>
                        <c:otherwise>
                            <li style="color: green;"><b>Haz entrado a ${actividad.tipoActividad} </b> | Su transaccion fue: ${actividad.oro} de Oro! | A fecha de: ${actividad.fechaHora}</li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
   			 </ul>
		</div>
	</div>
</body>
</html>