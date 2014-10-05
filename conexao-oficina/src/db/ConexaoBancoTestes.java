package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBancoTestes {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String banco = "testes";
	private static final String url = "jdbc:mysql://localhost:3306/" + banco;
	private static final String usuario = "root";
	private static final String senha = "root";

	public static void main(String[] args) {

		Connection conn = null;
		try {

			System.out.println(driver);
			Class.forName(driver).newInstance();

			System.out.println("Driver encontrado"
					+ "\nConectando com o servirdor");

			conn = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão com o BD estabelecida!");

			java.sql.Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from autores");
			System.out.println("AUTORES");
			while (rset.next()) {
				System.out.println(rset.getString(1) + " | "
						+ rset.getString(2) + " | " + rset.getString(3) + " | "
						+ rset.getString(4));

			}

			System.out.println("EDITORAS");
			rset = stmt.executeQuery("select * from editoras");
			while (rset.next()) {
				System.out.println(rset.getString(1) + " | "
						+ rset.getString(2) + " | " + rset.getString(3));

			}

			rset = stmt.executeQuery("select * from livros");
			System.out.println("LIVROS");
			while (rset.next()) {
				System.out.println(rset.getString(1) + " | "
						+ rset.getString(2) + " | " + rset.getString(3) + " | "
						+ rset.getString(4));

			}

			conn.close();

		} catch (ClassNotFoundException e) {
			System.err.println("Não foi possível estabelecer conexão com o BD");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Erro ao obter conexão");
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("Fim");
	}
}