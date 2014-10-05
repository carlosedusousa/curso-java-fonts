// (c)2014|COC Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>

package coc;

public class Customer {

	private long id;
	private String nome;
	private String documento;
	private Gender sexo;
	private Address endereco;
	private Communication contato;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Gender getSexo() {
		return sexo;
	}

	public void setSexo(Gender sexo) {
		this.sexo = sexo;
	}

	public Address getEndereco() {
		return endereco;
	}

	public void setEndereco(Address endereco) {
		this.endereco = endereco;
	}

	public Communication getContato() {
		return contato;
	}

	public void setContato(Communication contato) {
		this.contato = contato;
	}

	private Customer(String nome, String documento, Communication contato) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.contato = contato;
	}

	private Customer(long id, String nome, String documento, Gender sexo,
			Address endereco, Communication contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result
				+ ((documento == null) ? 0 : documento.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=").append(id).append(", nome=")
				.append(nome).append(", documento=").append(documento)
				.append(", sexo=").append(sexo).append(", endereco=")
				.append(endereco).append(", contato=").append(contato)
				.append("]");
		return builder.toString();
	}
	
}
