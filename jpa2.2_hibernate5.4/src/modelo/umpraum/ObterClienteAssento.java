package modelo.umpraum;

import infra.DAO;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorId(1L);
		
		System.out.println(cliente.getAssento().getNome());
		//bidirecionamento
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Assento assento = daoAssento.obterPorId(1L);
		
		System.out.println(assento.getCliente().getNome());
		//bidirecionamento
		System.out.println(assento.getCliente().getAssento().getNome());
		
		daoAssento.fechar();
	}
}
