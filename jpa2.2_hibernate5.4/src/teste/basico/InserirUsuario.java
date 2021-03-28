package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuarios;

public class InserirUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa2"); //nome do xml
		EntityManager em = emf.createEntityManager();
		
		Usuarios usuario = new Usuarios("Mazinha","mainha@gmail.com","Diretora");
		
		em.getTransaction().begin();
		em.persist(usuario); //insert
		em.getTransaction().commit();
		
		System.out.println("O id gerado foi: "+usuario.getId());
		
		em.close();
		emf.close();
	}
}
