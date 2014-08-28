package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String banco = "testes";
	private static final String url = "jdbc:mysql://localhost:3306/" + banco;
	private static final String usuario = "root";
	private static final String senha = "root";

	public String getDriver() {
		return driver;
	}

	public static String getBanco() {
		return banco;
	}

	public String getUrl() {
		return url;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	// Criando conexão com a base de dados
	public Connection criarConexao() throws SQLException {

		Connection con = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Conectado!");
		return con;

	}

}