// (c)2014|carlosedusousa.

package oo.edu.empregado;

// TralhadorHora: empregado que é pago por hora e que recebe um adicional
// por hora extra trabalhada. O retorno do método ganho desta classe é o
// resultado da operação sobre os valores atribuídos aos atributos 
// desta classe da seguinte forma: salarioHora * horas.

public class TralhadorHora extends Empregado {
	// Atributo da classe.
	public double salarioHora;
	public int horas;
	public int horasExtras;

	// Construtor da classe.
	public TralhadorHora(String primeiroNome, String ultimoNome, String cargo,
			double salarioHora, int horas, int horasExtras) {
		super(primeiroNome, ultimoNome, cargo);
		setHoras(horas);
		setSalarioHora(salarioHora);
		setHorasExtras(horasExtras);
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	// Define o valor do salário.
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	// Retorna as horas trabalhadas.
	public int getHoras() {
		return horas;
	}

	// Atribui a quantidade de horas trabalhadas.
	public void setHoras(int horas) {
		this.horas = horas;
	}

	// Retorna as horas extras trabalhadas.
	public int getHorasExtras() {
		return horasExtras;
	}

	// Atribui a quantidade de horas trabalhadas.
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	// Método da classe para salário de Horista mais horas extras
	// (para exemplo será fixado em 50% do valor da hora normal trabalhada).
	public double calcularGanho() {
		return getSalarioHora() * getHoras() + getSalarioHora()
				* getHorasExtras() / 2;
	}

	// Método de impressão.
	public String toString() {
		return "Empregado: " + getPrimeiroNome() + " " + getUltimoNome()
				+ "\nSalario: " + calcularGanho() + "\nCargo: "
				+ super.getCargo();
	}

}
