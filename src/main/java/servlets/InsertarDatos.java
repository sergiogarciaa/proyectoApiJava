package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;

import entidades.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

@WebServlet("/InsertarDatos")
public class InsertarDatos extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 241566496352402022L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	
		
    	String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellidos");
        String dni = request.getParameter("dni");
        String telefono = request.getParameter("tlf");
        String email = request.getParameter("email");
        String clave = request.getParameter("contrase�a");
        
        Usuario usuario = new Usuario(dni, nombre, apellido, telefono, email, clave);
        
        String url = "http://192.168.30.154:8080/usuarios"; // Reemplaza con la URL correcta de tu API
        
        // Convertir el objeto a JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonUsuario;
        try {
            jsonUsuario = objectMapper.writeValueAsString(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
     // Crear cliente HTTP
        HttpClient httpClient = HttpClients.createDefault();

        // Crear solicitud POST
        HttpPost httpPost = new HttpPost(url);

        // Configurar encabezados y cuerpo de la solicitud
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity(jsonUsuario, "UTF-8"));

        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse httpResponse = httpClient.execute(httpPost);

            // Procesar la respuesta
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            System.out.println("Código de respuesta: " + statusCode);

            // Aquí puedes leer la respuesta si es necesario
            // InputStream inputStream = httpResponse.getEntity().getContent();
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // String linea;
            // while ((linea = bufferedReader.readLine()) != null) {
            //     System.out.println(linea);
            // }

            // Cerrar recursos si es necesario
            // bufferedReader.close();
            // inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("index.jsp");
    }
}
