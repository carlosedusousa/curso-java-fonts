package conexao;

public class Connect {

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

}