package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{
	
	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador:");
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button bDescremento = new Button("-");
		bDescremento.getStyleClass().add("botoes");
		bDescremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		Button bIncremento = new Button("+");
		bIncremento.getStyleClass().add("botoes");
		bIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		Button bSair = new Button("Sair");
		bSair.getStyleClass().add("botoes");
		bSair.setOnAction(e -> System.exit(0));
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(bDescremento);
		boxBotoes.getChildren().add(bIncremento);
		boxBotoes.getChildren().add(bSair);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.setSpacing(10);
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String caminhoCSS = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCSS);
		//no site https://fonts.google.com/ tem muita fonte otima e dar pra apenas linkar
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));

		label.getStyleClass().remove("vermelho");
		label.getStyleClass().remove("verde");
		
		if (contador > 0) {
			label.getStyleClass().add("verde");
		}else if (contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}
}
