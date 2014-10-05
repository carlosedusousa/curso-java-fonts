// (c)2014|carlosedusousa.

package oo.edu.empregado;

// Chefe: empregado pago com um salário fixo semanal independente do
// número de horas trabalhadas. O retorno do método ganho desta classe é o
// próprio valor atribuído ao atributo salarioMensal, consultar diagrama; 

public class Chefe extends Empregado {

	// Atributo da classe.
	public double salarioMensal;

	// Construtor da classe.
	public Chefe(String primeiroNome, String ultimoNome, String cargo,
			double salarioSemanal) {
		super(primeiroNome, ultimoNome, cargo);
		setSalarioMensal(salarioSemanal * 4);
	}

	// Retorno do salário.
	public double getSalarioMensal() {
		return salarioMensal;
	}

	// Define o valor do salário.
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	// Método para cálculo de sálario semanalista pré-definido pelo construtor.
	public double calcularGanho() {
		return getSalarioMensal();
	}

	// Método de impressão.
	public String toString() {
		return "Empregado: " + getPrimeiroNome() + " " + getUltimoNome()
				+ "\nSalario: " + calcularGanho() + "\nCargo: "
				+ super.getCargo();
	}
}
