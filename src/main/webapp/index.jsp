<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
        <!-- Aquí puedes colocar tu barra de navegación si es necesario -->
        <h1>Inicio</h1>
    </header>

    <div id="content">
       <button onclick="cargarContenido('RegistrarUsuario.jsp')">Registrar</button>
       <button onclick="cargarContenido('IniciarUsuario.jsp')">Inicio</button>
       <button onclick="cargarContenido('MostrarUsuarios.jsp')">MostrarUsuarios</button>
    </div>

    <script src="tu_script.js"></script>
</body>
</html>