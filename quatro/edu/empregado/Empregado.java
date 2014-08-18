package oo.edu.empregado;

public abstract class Empregado {

	// Atributo da SuperClasse.
	private String primeiroNome;
	private String ultimoNome;
	private String cargo;

	// Construtor da superClasse que serão herdados pelos filhos.
	public Empregado(String primeiroNome, String ultimoNome, String cargo) {
		setPrimeiroNome(primeiroNome);
		setUltimoNome(ultimoNome);
		// Atributo cargo - extra ao trabalho.
		setCargo(cargo);
	}

	// Retorna o primeiro o nome do empregado.
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	// Atribui o primeiro nome do empregado.
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	// Retorna o ultimo o nome do empregado.
	public String getUltimoNome() {
		return ultimoNome;
	}

	// Atribui o ultimo nome do empregado.
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	// retorna o cargo do empregado.
	public String getCargo() {
		return cargo;
	}

	// Atribui o cargo do funconario.
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Método da Super Classe Genérico para uso das classes filhos.
	public abstract double calcularGanho();

}
