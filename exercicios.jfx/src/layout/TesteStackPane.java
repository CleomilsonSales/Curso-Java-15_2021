package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1);
		
		setOnMouseClicked(e -> {
			//pegando o lado esquerdo e direito -> direito é maior que a metade da tela
			if (e.getSceneX() > getScene().getWidth() / 2) {
				//nesse caso eu pego e primeiro objeto e envio para o final da getChildren
				getChildren().get(0).toFront();
			}else {
				getChildren().get(5).toBack();
			}
		});
		
		//usando threads
		//lembrando que () dentro de lambda é pq não recebe nenhum parametro
		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					
					//para evitar erro do FX application
					//pode ser usando alem da Thread, sempre que precisar atualizar a tela isso pode ajudar
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
			
		t.setDaemon(true); //quer dizer que se a thread principal da aplicação morrer a T morre também
		t.start();
	}
}
