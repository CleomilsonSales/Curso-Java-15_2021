package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuarios;

public class TesteNovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa2"); //nome do xml
		EntityManager em = emf.createEntityManager();
		
		Usuarios usuario = new Usuarios("Saori","saori@gmail.com","Presidente");
		
		em.getTransaction().begin();
		em.persist(usuario); //insert
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
