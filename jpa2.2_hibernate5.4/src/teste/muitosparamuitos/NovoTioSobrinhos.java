package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinhos;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinhos {
	public static void main(String[] args) {
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("Jo�o");
		
		Sobrinhos sobrinho1 = new Sobrinhos("Davi");
		Sobrinhos sobrinha2 = new Sobrinhos("Ana");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinha2)
			.fecharTransacao()
			.fechar();
		
	}
}
