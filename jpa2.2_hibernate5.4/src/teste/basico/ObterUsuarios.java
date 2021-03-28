package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuarios;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa2"); 
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuarios u";
		//TypedQuery<Usuarios> query = em.createQuery(jpql, Usuarios.class);
		//query.setMaxResults(5);
		
		//List<Usuarios> usuarios = query.getResultList();
		
		List<Usuarios> usuarios = em
				.createQuery(jpql,Usuarios.class)
				.setMaxResults(5)
				.getResultList();
		
		for (Usuarios usuario: usuarios) {
			System.out.println("Id: "+usuario.getId() 
				+ " E-mail: "+ usuario.getEmail() 
				+ " nome: "+ usuario.getNome()
				+ " cargo: " + usuario.getCargo());
		}
		
		em.close();
		emf.close();
	}
}
