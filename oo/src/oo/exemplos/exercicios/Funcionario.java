package oo.exemplos.exercicios;

/*
 Modele um funcionário. 
 Ele deve ter o nome do funcionário, o departamento onde trabalha, 
 seu salário, a data de entrada no banco (String), seu RG (String), 
 e um valor booleano que indique se o funcionário está na empresa no
 momento ou se já foi embora.

 Você deve criar alguns métodos de acordo com o que você sentir necessidade. 
 Além deles, crie um método bonifica que aumenta o salario do funcionário de
 acordo com o parâmetro passado como argumento. Crie também um método demite
 que não recebe parâmetro algum, só modifica o valor booleano indicando que
 o funcionário não trabalha mais aqui.

 A idéia aqui é apenas modelar, isto é, só identifique que informações são
 importantes, e o que um funcionário faz.

 Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra
 classe que tenha o main. Você deve criar a classe do funcionário chamada

 Funcionario, e a classe de teste você pode nomear como quiser. 
 A de teste deve possuir o método main.

 */
public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String dia;
	private String mes;
	private String ano;
	private String rg;
	private boolean empregado;

	public Funcionario(String nome, String departamento, double salario,
			String dia, String mes, String ano, String rg, boolean empregado) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.rg = rg;
		this.empregado = empregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEmpregado() {
		return empregado;
	}

	public void setEmpregado(boolean empregado) {
		this.empregado = empregado;
	}

	public void demite() {
		setEmpregado(false);
	}

	public void bonifica(double aumento) {
		setSalario(getSalario() + aumento);
	}

}
