package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	final static Connection getConexao() {
		//final String url = "jdbc:mysql://localhost:3306";  //não funcionou no driver que estou usando
		//vm - banco
		//verifyServerCertificate - não procurar certificado no servidor
		//useSSL - conexão segura
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
