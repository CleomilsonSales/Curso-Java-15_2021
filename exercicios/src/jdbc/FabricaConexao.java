package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	final static Connection getConexao() {
		//final String url = "jdbc:mysql://localhost:3306";  //n�o funcionou no driver que estou usando
		//vm - banco
		//verifyServerCertificate - n�o procurar certificado no servidor
		//useSSL - conex�o segura
		//userTimezone e serverTimezone - para evitar erro de regiao
		try {
			final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true&useTimezone=true&serverTimezone=UTC";
			final String usuario = "root";
			final String senha = "root";
			
			
			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
