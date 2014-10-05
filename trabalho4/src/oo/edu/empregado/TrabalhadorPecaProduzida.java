// (c)2014|carlosedusousa.

package oo.edu.empregado;

// TrabalhadorPecaProduzida: empregado pago pelo número de itens
// produzidos. O retorno do método ganho desta classe é o resultado da
// operação sobre os valores atribuídos aos atributos
// desta classe da seguinte forma: remuneracão * quantidade ;

public class TrabalhadorPecaProduzida extends Empregado {

	// Atributo da classe.
	public int quantidade;
	public double remuneracao;

	// Construtor da classe.
	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome,
			String cargo, int quantidade, double remuneracao) {
		super(primeiroNome, ultimoNome, cargo);
		setQuantidade(quantidade);
		setRemuneracao(remuneracao);
	}

	// Retora a quantidade de peças produzidas.
	public int getQuantidade() {
		return quantidade;
	}

	// Define a quantidade de peças produzidas.
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Retorna o valor da remuneração por peça.
	public double getRemuneracao() {
		return remuneracao;
	}

	// Define o valor da remuneração por peça.
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	// Método para cálculo de salário por Produção.
	public double calcularGanho() {
		return getRemuneracao() * getQuantidade();
	}

	// Método de impressão.
	public String toString() {
		return "Empregado: " + getPrimeiroNome() + " " + getUltimoNome()
				+ "\nSalario: " + calcularGanho() + "\nCargo: "
				+ super.getCargo();
	}
}
