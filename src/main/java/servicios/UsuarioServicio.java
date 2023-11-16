package servicios;

import entidades.Usuario;
import jakarta.persistence.EntityManager;

public class UsuarioServicio {

	public void InsertUsuario(Usuario usuario, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}		
