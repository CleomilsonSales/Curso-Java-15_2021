package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException{
		//final String url = "jdbc:mysql://localhost:3306";  //não funcionou no driver que estou usando
		//vm - banco
		//verifyServerCertificate - não procurar certificado no servidor
		//useSSL - conexão segura
		//userTimezone e serverTimezone - para evitar erro de regiao
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true&useTimezone=true&serverTimezone=UTC";
		final String usuario = "root";
		final String senha = "root";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão OK");
		conexao.close();
		
	}
}
