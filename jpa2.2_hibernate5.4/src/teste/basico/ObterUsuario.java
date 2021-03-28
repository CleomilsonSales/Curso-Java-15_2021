package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuarios;

public class ObterUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa2"); 
		EntityManager em = emf.createEntityManager();
		
		Usuarios usuario = em.find(Usuarios.class, 1L);  //1L - porque é do tipo long então preciso do L
		
		System.out.println("Usuario encontrado: "+usuario.getNome());
		
		em.close();
		emf.close();
		
	}
}
