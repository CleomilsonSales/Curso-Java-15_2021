package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuarios;

public class AlterarUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa2");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuarios usuario = em.find(Usuarios.class, 2L);
		//comando para tirar o objeto do status gerenciado
		//agora o objeto não esta sincronizado com o banco
		//somente ira atualizar o usuario se for chamdo o merge
		em.detach(usuario); 
		
		usuario.setNome("Ritinha Miranda");
		usuario.setCargo("Diretora");
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
