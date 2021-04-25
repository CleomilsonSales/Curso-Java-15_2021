package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	//baixando biblioteca do ControlsFX >> 11.0.0
	
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passField;
	
	public void entrar() {
		boolean emailValido = emailField.getText().equals("teste@teste.com.br");
		boolean senhaValida = passField.getText().equals("123");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		}else {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Usuário ou Senha inválidos!")
				.showError();
		}
			
	}
}
