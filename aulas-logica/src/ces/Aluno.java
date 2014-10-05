package ces;

import java.util.Scanner;

public class Aluno {
	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);
		// Define o nome do aluno
		System.out.println("Digite o nome do aluno: ");
		
		// Usar nexline para pegar nomes compoxtos por causa do espa�o
		String nome = keyboard.nextLine(); 
		float nota1, nota2;

		// La�o para definir a primeira nota do aluno
		do {
			System.out.println("Digite a primeira nota do aluno(0,0): ");
			nota1 = keyboard.nextFloat();// pode-se usar nextDoble
		} while (nota1 < 0.0 || nota1 > 10.0);

		// La�o para definir a segunda nota do aluno
		do {
			System.out.println("Digite a segunda nota do aluno(0,0): ");
			nota2 = keyboard.nextFloat();
		} while (nota2 < 0.0 || nota2 > 10.0);

		// Calcula a m�dia das notas
		float media = (nota1 + nota2) / 2f;

		// Define um status inicial vazio
		String status = "";

		// Compara��o da m�dia das notas 
		if (media <= 5.0 && media >= 0.0) {
			status = "Reprovado";
			// System.out.println("O aluno "+ nome +" foi Reprovado com nota: "
			// + media);
		} else if (media >= 7.0 && media <= 10.0) {
			status = "Aprovado";
			// System.out.println("O aluno "+ nome
			// +" foi Aprovado com nota m�dia: " + media);
		} else {
			status = "Recupera��o";
			// System.out.println("O aluno " + nome
			// +" est� em recupera��o com nota m�dia: "+ media);
		}
		// printf("%.2f", 3.14159); para imprimir com duas casas decimais

		if (status.equals("")) {
			System.out.println("Houve um erro ao inserir as notas");
		}
		
		// Imprime resultado com nome, m�dia e status do aluno
		System.out.println("O aluno " + nome + " teve m�dia " + media
				+ " e est� " + status);
		// Ao colocar nota com ponto flutuante deve-se digitar com virgula

		keyboard.close();

	}

}
