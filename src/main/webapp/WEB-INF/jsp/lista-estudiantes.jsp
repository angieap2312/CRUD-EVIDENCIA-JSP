<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Estudiantes</title>
</head>
<body>
    <h2>Lista de Estudiantes</h2>
    <a href="/estudiante/crear-nuevo-estudiante">Agregar Articulo</a>
    <table border="1">
        <tr>
            <th>Número Documento</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Edad</th>
            <th>Acciones</th>
        </tr>
        <c:forEach var="estudiante" items="${estudiantes}">
            <tr>
                <td>${estudiante.docEst}</td>
                <td>${estudiante.nomEst}</td>
                <td>${estudiante.apeEst}</td>
                <td>${estudiante.edadEst}</td>
                <td>
                    <a href="/estudiante/editar/${estudiante.docEst}">Editar</a>
                    <a href="/estudiante/eliminar/${estudiante.docEst}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>