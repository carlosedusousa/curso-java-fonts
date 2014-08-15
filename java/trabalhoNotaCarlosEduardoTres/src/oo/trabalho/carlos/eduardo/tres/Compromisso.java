package oo.trabalho.carlos.eduardo.tres;

public class Compromisso {

	// Instanciando atributos da classe Compromisso.
	private String dataInicio;
	private String titulo;
	private String descricao;

	// Instanciando Construtor da clase Compromisso.
	public Compromisso(String dataInicio, String titulo, String descricao) {
		this.dataInicio = dataInicio;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	// Retorna a data do evento.
	public String getDataInicio() {
		return dataInicio;
	}

	// Retorna o Título do evento.
	public String getTitulo() {
		return titulo;
	}

	// Retorna a Descrição do evento.
	public String getDescricao() {
		return descricao;
	}

	// Retorna os dados da classe Compromisso.
	public String toString() {

		String str = "";
		str += "Evento: " + this.titulo + "\n";
		str += "Data: " + this.dataInicio + "\n";
		str += "Lembrete: " + this.descricao + "\n";

		return str;
	}

}
