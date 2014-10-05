package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsercaoDeDados {

	public static void main(String[] args) throws SQLException {
		Connection con = criarConexao();
		addAutor(con, "Nassor Paulino da Silva", "Brasil");
		addAutor(con, "John Boyne", "Irlanda");
		
		consultaAutor(con,"%1-QATU","3");
		
	}

	// Insert Autor
	private static void addAutor(Connection con, String autor, String pais) throws SQLException {
		// SQL para inserir valores
		String insertSQL = "INSERT INTO autores" + "(primeiro_nome, pais) VALUES" + "(?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
		preparedStatement.setString(1, autor);
		preparedStatement.setString(2, pais);
		preparedStatement.executeUpdate();
	}
	
	// Select Autor
	private static void consultaAutor (Connection con, String titulo, String editora_id) throws SQLException {
		System.out.println("\nPrepared Statement");
        String sql = "SELECT titulo FROM livros WHERE titulo LIKE ? AND editora_id=?";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, titulo);
		preparedStatement.setString(2, editora_id);
		
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) { // enquanto houver linhas de resultado, mover para a próxima.
			// Recebe os resultados da coluna com indice 3 ("titulo")
			System.out.println(rs.getString("titulo"));
		}
		
	}
	

	// Criando conexão com a base de dados
	private static Connection criarConexao() throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testes", "root", "root");
		return con;
	}

}
