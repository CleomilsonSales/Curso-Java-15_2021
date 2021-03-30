package modelo.basico;

import infra.DAO;

public class NovoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("Monitor", 845.45);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		//forma simples
		//dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();
		//forma completa
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("Id do produto é: "+produto.getId());
				
	}
}
