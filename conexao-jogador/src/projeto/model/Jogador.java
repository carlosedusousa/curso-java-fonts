package projeto.model;

public class Jogador {

	private Long id; // Id referência do BD. Ver se será usado?!
	private static int numJogador; // Caso queira contar a quantidade de jogadores.
	private String usuario;
	private String senha;

	public Jogador(String usuario, String senha) {
		numJogador++;
		this.usuario = usuario;
		this.senha = senha;
	}

	public static int getNumJogador() {
		return numJogador;
	}

	public static void setNumJogador(int numJogador) {
		Jogador.numJogador = numJogador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
