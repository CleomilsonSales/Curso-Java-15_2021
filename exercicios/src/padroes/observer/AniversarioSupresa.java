package padroes.observer;

public class AniversarioSupresa {
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		//registrando o observer
		Namorada namorada = new Namorada();
		porteiro.registrarObservadores(namorada);
		
		//chamando pela lambda graça a Function Interface
		porteiro.registrarObservadores(e -> {
			System.out.println("Supresa via lambda. Ocorreu em: "+e.getMomento());
		});
		
		porteiro.monitorar();
	}
}
