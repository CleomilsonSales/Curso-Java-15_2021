package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaPessoas1 {
	public static void main(String[] args) throws SQLException {
		Connection conexao =  FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome:"); 
		String valor = entrada.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement st = conexao.prepareStatement(sql);
		st.setString(1, "%"+valor+"%");
		
		ResultSet resultado = st.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() +"=>"+p.getNome());
		}
		
		entrada.close();
		st.close();
		conexao.close();
				
	}
}
