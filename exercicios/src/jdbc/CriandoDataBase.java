package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoDataBase {
	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true&useTimezone=true&serverTimezone=UTC";
		final String usuario = "root";
		final String senha = "root";
		
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão OK");

		
		Statement st = conexao.createStatement();
		st.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco de dados criado.");
	}
}
