package prueba;

import java.io.IOException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servicios.UsuarioServicio;
import entidades.Usuario;

@WebServlet("/InsertarDatos")
public class InsertarDatos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	
		
    	String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String clave = request.getParameter("clave");
        
        UsuarioServicio pepe = new UsuarioServicio();
        Usuario usu1 = new Usuario(dni,nombre,apellido,telefono,email,clave);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
        // Aquí puedes llamar a un método de una clase Java con el dato recibido
        pepe.InsertUsuario(usu1, em); // Suponiendo que ClaseJava es la clase con el método
        
        // Puedes redirigir a otra página después de procesar los datos si es necesario
        response.sendRedirect("index.jsp");
    }
}
