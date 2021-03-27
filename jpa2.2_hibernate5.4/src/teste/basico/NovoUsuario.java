package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("jpa2"); //nome do xml
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Rita", "ritamiranda@gmail.com");
		novoUsuario.setId(1L);
		
		em.getTransaction().begin();
		em.persist(novoUsuario); //insert
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
