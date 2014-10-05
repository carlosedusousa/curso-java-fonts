package oo.exemplos.exercicios;

import java.util.Scanner;

public class TestarFuncionario {

	public static void main(String[] args) {

		String nome, departamento, dia, mes, ano, rgCpf;
		double salario;
		
		Scanner k = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário: ");
		nome = k.nextLine();
		System.out.println("Departamento: ");
		departamento = k.nextLine();
		System.out.println("Dia: ");
		dia = k.nextLine();
		System.out.println("Mes: ");
		mes = k.nextLine();
		System.out.println("Ano: ");
		ano = k.nextLine();
		System.out.println("RG ou CPF: ");
		rgCpf = k.nextLine();
		System.out.println("Salario: ");
		salario = k.nextDouble();

		Funcionario colaborador = new Funcionario(nome, 
												  departamento, 
												  salario,
												  dia, 
												  mes, 
												  ano, 
												  rgCpf, 
												  true);

		
		imprime(colaborador);

		k.close();
		
				
	}

		
	public static void imprime(Funcionario funcionario) {
		System.out.println("\nNome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Data de admissao: " + funcionario.getDia() + "/"
				+ funcionario.getMes() + "/" + funcionario.getAno());
		System.out.println("RG: " + funcionario.getRg());
		System.out.println("Está atualmente: "
				+ (funcionario.isEmpregado() ? "Empregado" : "Demitido"));

	}

}
