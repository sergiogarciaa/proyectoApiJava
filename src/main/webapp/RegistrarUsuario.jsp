<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registar Usuario</title>
</head>
<body>
<form action="InsertarDatos" method="post">
        <label for="dato">Ingresa un Usuario:</label>
        <br>
        
        Nombre:
        <input type="text" id="nombre" name="nombre" required>
        <br>
        
        Apellido:
        <input type="text" id="apellido" name="apellido" required>
        <br>
        Dni:
        <input type="text" id="dni" name="dni" required>
        <br>
        Telefono:
        <input type="text" id="telefono" name="telefono" required>
        <br>
        Email:
        <input type="text" id="email" name="email" required>
        <br>
        Clave:
        <input type="text" id="clave" name="clave" required>
        <br>
        <button type="submit">Enviar</button>
    </form>
</body>
</html>