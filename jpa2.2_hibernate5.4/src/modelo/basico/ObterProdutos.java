package modelo.basico;

import java.util.List;

import infra.ProdutoDAO;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDAO dao =  new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("Produto: "+produto.getNome() + " Valor: "
					+produto.getPreco());
		}	
		
		double precoTotal =  produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		
		System.out.println("Preço total em estoque é: "+precoTotal);
		
		dao.fechar();
	}
}
