package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	final static Connection getConexao() {
		//final String url = "jdbc:mysql://localhost:3306";  //não funcionou no driver que estou usando
		//vm - banco
		//verifyServerCertificate - não procurar certificado no servidor
		//useSSL - conexão segura
		//userTimezone e serverTimezone - para evitar erro de regiao
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			
			
			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	final static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}
