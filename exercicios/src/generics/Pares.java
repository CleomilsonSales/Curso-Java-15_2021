package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares <C extends Number, V>{
	//private final Set<Par<C, V>> itens = new HashSet<>();
	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); //garante a ordem de inclusão
	
	public void adicionar(C chave, V valor) {
		//quando usa apenas o return em um void quer dizer que se a condiçao for verdadeira apeans sai do metodo
		if (chave == null) return;
		
		//Verificando se ja existe, se sim, exclui e insere de novo
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		//obs.: set ignora valores repetidos
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if (chave == null) return null; 
		
		Optional<Par<C, V>> parOpicional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		//ternario
		return parOpicional.isPresent() ? parOpicional.get().getValor() : null;
	}
	
	
}
