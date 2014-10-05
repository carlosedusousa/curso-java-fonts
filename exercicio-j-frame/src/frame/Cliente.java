package frame;

public class Cliente {

	private int id;
	private String nome;
	private String Contato;

	public Cliente(int id, String nome, String contato) {
		super();
		this.id = id;
		this.nome = nome;
		Contato = contato;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", Contato=" + Contato
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return Contato;
	}

	public void setContato(String contato) {
		Contato = contato;
	}

}