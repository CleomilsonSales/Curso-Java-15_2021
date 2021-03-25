package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		String sql2 = "INSERT INTO pessoas (nome, codigo) VALUES (?,?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Rita Maria"));
		System.out.println(dao.incluir(sql, "Saori Miranda"));
		
		System.out.println(dao.incluir(sql2, "João",1000));
		System.out.println(dao.incluir(sql2, "Rita",1001));
		System.out.println(dao.incluir(sql2, "Saori",1002));
		
		dao.close();
		
	}
}
