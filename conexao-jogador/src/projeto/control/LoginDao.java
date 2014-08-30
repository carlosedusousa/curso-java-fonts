package projeto.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	// Realiza login.
	public boolean login(Connection con, String usuario, String senha)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE usuario LIKE ? AND senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, usuario.toLowerCase().replaceAll("\\s+",""));
		preparedStatement.setString(2, senha.replaceAll("\\s+",""));

		ResultSet rs = preparedStatement.executeQuery();

		if (rs.next()) {
			System.out.println("Loguin Efetuado com sucesso!");
			return true;
		}
		return false;
	}

	public boolean verificaNome(Connection con, String usuario)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE usuario LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, usuario.toLowerCase().replaceAll("\\s+",""));
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			if (rs.getString("usuario").equalsIgnoreCase(usuario.toLowerCase().replaceAll("\\s+",""))) {
				return true;
			}
		}
		return false;
	}

	public boolean verificaSenha(Connection con, String senha)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, senha.replaceAll("\\s+",""));
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			if (rs.getString("senha").equalsIgnoreCase(senha)) {
				return true;
			}
		}
		return false;
	}

	// Adiciona um usuário e senha - Cadastro de Login.
	public boolean addLogin(Connection con, String usuario, String senha)
			throws SQLException {

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