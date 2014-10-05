package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	//NOVO METODO CONSULTA TUDO ONDE RETORNA TODOS OS DADOS DO BANDO ONDE O USUARIO E A SENHA SÃO OS MESMO 
	// PASSADOS NA TELA DE LOGIN INICIAL...
	
	// Método consultaTudo retorna a consulta da tabela loguins.
	public ResultSet consultaTudo (Connection con, String nome, String senha)throws SQLException {
		String sql = "SELECT * FROM logins WHERE nome LIKE ? AND senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// Usuário e senha são validados sem espços e o usuário indifere de maiúsculo e minúsculo.
		preparedStatement.setString(1, nome.toLowerCase().replaceAll("\\s+",""));
		preparedStatement.setString(2, senha.replaceAll("\\s+",""));

		ResultSet rs = preparedStatement.executeQuery();
		// retorna a consulta ResultSet.
		return rs;
	}

	// Método Log retorna a consulta da tabela loguins.
	public ResultSet log (Connection con, String valor)throws SQLException {
		// Complementa o SQL com a clausula where se valor vir com parametro.
		String values;
		// Verifica complemento.
		if(valor.equals("")){
			values = "";
		}else{
			values = " WHERE senha LIKE ? OR nome LIKE ?";
		}
		// Monta a query.
		String sql = "SELECT * FROM logins" + values;
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// Se há complemento de consulta é complementado o ? com os valores respectivos.
		if(!valor.equals("")){
			// Usuário e senha são validados sem espços e o usuário indifere de maiúsculo e minúsculo.
			preparedStatement.setString(1, "%" + valor.replaceAll("\\s+","") + "%");
			preparedStatement.setString(2, "%" + valor.toLowerCase().replaceAll("\\s+","") + "%");
		}
		// Executa query.
		ResultSet rs = preparedStatement.executeQuery();
		// retorna a consulta ResultSet.
		return rs;
	}
	
	// Método que retorna verdadeiro ou falso para realização do login.
	public boolean login(Connection con, String nome, String senha)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE nome LIKE ? AND senha LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// Usuário e senha são validados sem espços e o usuário indifere de maiúsculo e minúsculo.
		preparedStatement.setString(1, nome.toLowerCase().replaceAll("\\s+",""));
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
	public boolean verificaNome(Connection con, String nome)
			throws SQLException {

		String sql = "SELECT * FROM logins WHERE nome LIKE ?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, nome.toLowerCase().replaceAll("\\s+",""));
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			if (rs.getString("nome").equalsIgnoreCase(nome.toLowerCase().replaceAll("\\s+",""))) {
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
	public boolean addLogin(Connection con, String nome, String senha)
			throws SQLException {

		// Valida nome primeiramente. Cria um novo se o dado não existir no banco.
		if (!verificaNome(con, nome)) {

			String insertSQL = "INSERT INTO logins (nome, senha) VALUES (?,?)";

			PreparedStatement preparedStatement = con
					.prepareStatement(insertSQL);
			// Usuário e senha são validados sem espços e o usuário indifere de maiúsculo e minúsculo.
			preparedStatement.setString(1, nome.toLowerCase().replaceAll("\\s+",""));
			preparedStatement.setString(2, senha.replaceAll("\\s+",""));
			preparedStatement.executeUpdate();
			return true;
		}
		
		return false;
	}

}