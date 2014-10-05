// (c)2014|carlosedusousa.

package oo.edu.empregado;

// TrabalhadorComissionado: empregado pago com um salário fixo mais
// uma porcentagem sobre as vendas. O retorno do método ganho desta classe é
// o resultado da operação sobre os valores atribuídos aos atributos 
// desta classe da seguinte forma: salario + (comissao *
// quantidade); 

public class TrabalhadorComissionado extends Empregado {

	// Atributo da classe.
	public double salarioMensal;
	public double comissao;
	public int quantidade;

	// Construtor da classe.
	public TrabalhadorComissionado(String primeiroNome, String ultimoNome,
			String cargo, double salarioMensal, double comissao, int quantidade) {
		super(primeiroNome, ultimoNome, cargo);
		setComissao(comissao);
		setQuantidade(quantidade);
		setSalarioMensal(salarioMensal);
	}

	// retorna o salário mensal.
	public double getSalarioMensal() {
		return salarioMensal;
	}

	// Atribui o valor do salário mensal.
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	// Retorna o valor da comissão.
	public double getComissao() {
		return comissao;
	}

	// Atribui o valor da comissão.
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	// Retorna a quantidade produzida / vendida.
	public int getQuantidade() {
		return quantidade;
	}

	// Atribui quantidade produzida / vendida.
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Método para cálculo de salário Comissionado.
	public double calcularGanho() {
		return getSalarioMensal() + (getComissao() * getQuantidade());
	}

	// Método de impressão.
	public String toString() {
		return "Empregado: " + getPrimeiroNome() + " " + getUltimoNome()
				+ "\nSalario: " + calcularGanho() + "\nCargo: "
				+ super.getCargo();
	}
}
