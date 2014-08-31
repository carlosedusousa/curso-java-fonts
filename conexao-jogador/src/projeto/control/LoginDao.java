package projeto.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	// Método Log retorna a consulta da tabela loguins.
	public ResultSet log (Connection con)throws SQLException {

		String sql = "SELECT * FROM logins";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		// retorna a consulta.
		return rs;
	}
	
	// Método que retorna verdadeiro ou falso para realização do login.
	public boolean login(Connection con, String usuario, String senha)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE usuario LIKE ? AND senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// Usuário e senha são validados sem espços e o usuário indifere de maiúsculo e minúsculo.
		preparedStatement.setString(1, usuario.toLowerCase().replaceAll("\\s+",""));
		preparedStatement.setString(2, senha.replaceAll("\\s+",""));

		ResultSet rs = preparedStatement.executeQuery();

		if (rs.next()) {
			System.out.println("Loguin Efetuado com sucesso!");
			// Retorna verdadeiro se a consulta for true.
			return true;
		}
		// Retorna falso se a consulta for false.
		return false;
	}

	// Método que valida se já existe registro com nome a ser criado.
	public boolean verificaNome(Connection con, String usuario)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE usuario LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, usuario.toLowerCase().replaceAll("\\s+",""));
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			if (rs.getString("usuario").equalsIgnoreCase(usuario.toLowerCase().replaceAll("\\s+",""))) {
				// Retorna verdadeiro se a consulta for true.
				return true;
			}
		}
		// Retorna falso se a consulta for false.
		return false;
	}

	// Método que valida senha.
	public boolean verificaSenha(Connection con, String senha)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, senha.replaceAll("\\s+",""));
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			if (rs.getString("senha").equalsIgnoreCase(senha)) {
				// Retorna verdadeiro se a consulta for true.
				return true;
			}
		}
		// Retorna falso se a consulta for false.
		return false;
	}

	// Adiciona um usuário e senha - Cadastro de Login.
	public boolean addLogin(Connection con, String usuario, String senha)
			throws SQLException {

		// Valida nome primeiramente. Cria um novo se o dado não existir no banco.
		if (!verificaNome(con, usuario)) {

			String insertSQL = "INSERT INTO logins (usuario, senha) VALUES (?,?)";

			PreparedStatement preparedStatement = con
					.prepareStatement(insertSQL);
			preparedStatement.setString(1, usuario.toLowerCase().replaceAll("\\s+",""));
			preparedStatement.setString(2, senha.replaceAll("\\s+",""));
			preparedStatement.executeUpdate();
			return true;
		}
		
		return false;
	}

}