package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {
	//Object... = argumentos variaveis de varios objetos
	private Connection conexao;
	
	public int incluir(String sql, Object... atributos) {
		
	}
	
	private Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		}catch (SQLException e) {
			
		}
		
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
