package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaAtualizarPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome:"); 
		String valor = entrada.nextLine();
		
		Connection conexao =  FabricaConexao.getConexao();
		
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
		
		//atualizando o nome da pessoa
		System.out.println("Informe o código para atualizar: ");
		int codigo = entrada.nextInt();
		
		String sqlSelectUp = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUp = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		st.close();
		st = conexao.prepareStatement(sqlSelectUp);
		st.setInt(1, codigo);
		resultado = st.executeQuery();
		
		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1),resultado.getString(2)); //pegando pelo indice da coluna no select ja garanti as colunas
			
			System.out.println("Pessoa selecionada: "+p.getNome());
			entrada.nextLine(); //pra que ele pare para pedir a nova entrada
			
			System.out.println("Informe o novo nome: ");
			String valorUp = entrada.nextLine();
			
			st.close();
			st = conexao.prepareStatement(sqlUp);
			st.setString(1, valorUp);
			st.setInt(2, p.getCodigo());
			st.execute();
			
			System.out.println("Pessoa atualizada.");
		}else {
			System.out.println("Pessoa não encontrada.");
		}
			
		
		//excluir pessoa
		System.out.println("Informe o código para exclusao: ");
		int codigoExclusao = entrada.nextInt();
		
		String sqlDelete = "DELETE FROM pessoas WHERE codigo > ?";
		
		st.close();
		st = conexao.prepareStatement(sqlDelete);
		st.setInt(1, codigoExclusao);
		
		int contador = st.executeUpdate();
		
		if (contador > 0) {			
			System.out.println("Pessoa excluida com sucesso.");
		}else {
			System.out.println("Pessoa não encontrada.");
		}
		
		System.out.println("Linha afetadas: " + contador);

		st.close();
		conexao.close();
		entrada.close();
		
	}
}
