package controles;

public class BreakContinueRotulado {
	
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3;i++) {
			for (int j=0; j < 3; j++) {
				if (i == 1) {
					//estou informado que o break ser� no la�o marcado e n�o no fluxo que o break esta
					break externo;
					/* O rotulo pode ser com continue tambem
					continue externo;
					*/
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}

}
