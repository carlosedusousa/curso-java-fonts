package oo.estatico.exercicios;

/*
 * Desenvolva uma classe chamada Conta:
 * - Ela deve possui um indentificador (número inteiro que incrementa a cada nova conta),
 * um saldo, um limite e um dono (nome String);
 * - Toda conta inicia com saldo 0;
 * - Durante a construção o limite e o Dono desta conta será definido;
 * - Ela so possui 2 metodos: debito, credito. O debito nunca podera ser efetuado se a
 * operacao ultrapassar o limite.
 */
public class Conta {

	private static int numContas;
	private int identificador;
	private double saldo;
	private double limite;
	private String nomeTitular;

	public Conta(double limite, String nomeTitular) {
		numContas++;
		this.identificador = numContas;
		this.saldo = 0;
		this.limite = limite;
		this.nomeTitular = nomeTitular;
	}

	public void credito(double valor) {
		this.saldo += valor;
	}

	public void debito(double valor) {
		if ((getSaldo() - valor) > (getSaldo() + getLimite()))
			this.saldo -= valor;
		else
			System.out.println("Conta número " + getIdentificador() + " tem saldo insuficiente.");
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String toString() {
		String str = "";
		str += "Id: " + identificador;
		str += "\nNome: " + nomeTitular;
		str += "\nSaldo: " + saldo;
		str += "\nLimite: " + limite + "\n";

		return str;

	}

}