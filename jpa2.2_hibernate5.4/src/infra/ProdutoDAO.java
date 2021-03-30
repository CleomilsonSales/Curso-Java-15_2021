package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	//resolvendo o generics com herança, entidade so passo uma vez
	//dessa forma evito fica instanciando objeto e tendo que passar o generics,  
	
	public ProdutoDAO() {
		super(Produto.class);
	}
}
