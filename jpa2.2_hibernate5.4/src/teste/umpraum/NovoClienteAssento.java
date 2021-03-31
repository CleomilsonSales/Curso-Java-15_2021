package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {
	public static void main(String[] args) {
		Assento assento = new Assento("3A");
		Cliente cliente = new Cliente("Saori", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.fecharTransacao()
			.fechar();
		
		dao = new DAO<>();
		assento = new Assento("2A");
		cliente = new Cliente("Mazinha", assento);
		
		dao.incluirAtomico(cliente);
	}
}
