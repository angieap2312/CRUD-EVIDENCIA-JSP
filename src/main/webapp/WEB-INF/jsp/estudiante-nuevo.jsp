<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Estudiante</title>
</head>
<body>
    <h2>${nuevoEstudiante.docEst == null ? 'Crear' : 'Actualizar'} Estudiante</h2>
    <form action="${nuevoEstudiante.docEst == null ? '/estudiante/crear' : '/estudiante/actualizar-estudiante'}" method="post">
        <label for="documento">Documento:</label>
        <input type="text" name="docEst" id="documento" value="${nuevoEstudiante.docEst}" required><br><br>

        <label for="nombre">Nombre:</label>
        <input type="text" name="nomEst" id="nombre" value="${nuevoEstudiante.nomEst}" required><br><br>

        <label for="apellido">Apellido:</label>
        <input type="text" name="apeEst" id="apellido" value="${nuevoEstudiante.apeEst}" required><br><br>

        <label for="edad">Edad:</label>
        <input type="number" name="edadEst" id="edad" value="${nuevoEstudiante.edadEst}" required><br><br>

        <button type="submit">${nuevoEstudiante.docEst == null ? 'Crear' : 'Actualizar'}</button>
    </form>
</body>
</html>