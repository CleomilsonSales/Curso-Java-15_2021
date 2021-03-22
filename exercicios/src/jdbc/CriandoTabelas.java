package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CriandoTabelas {
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		Statement st = conexao.createStatement();
	
		//no java 13 foi lançado o Text Blocks que é opção de criar string em varias linhas sem usar o concatenar basta usa """
		String sql = """
				CREATE TABLE IF NOT EXISTS pessoas(
				codigo INT AUTO_INCREMENT PRIMARY KEY,
				nome VARCHAR(80) NOT NULL)
				""";
		
		st.execute(sql);
		
		System.out.println("Tabela Criada");
		
		//fazendo insert
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome: ");	
		String nome = entrada.nextLine();
		
		String sqlInsert = "INSERT INTO pessoas (nome) VALUES (?);";
		//essa é a forma mais segura para evitar sql inject, pq garante que o que sera digitado sera tudo string
		PreparedStatement stmt = conexao.prepareStatement(sqlInsert);
		stmt.setString(1, nome);
		
		stmt.execute();
		System.out.println("linha inserida");
		
		entrada.close();		
		conexao.close();
	}
}
