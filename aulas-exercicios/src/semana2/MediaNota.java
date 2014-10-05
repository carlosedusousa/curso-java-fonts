package semana2;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = keyboard.nextLine();

		System.out.print("Digite a primeira nota: ");
		double primeiraNota = keyboard.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double segundaNota = keyboard.nextDouble();

		double mediaNotas = (primeiraNota + segundaNota) / 2;
		String status = "";

		if (mediaNotas <= 5.0 && mediaNotas >= 0) {
			status = "Reprovado";
		}

		if (mediaNotas > 5 && mediaNotas < 7) {
			status = "em recuperação";
		}

		if (mediaNotas >= 7 && mediaNotas <= 10) {
			status = "Aprovado";
		}

		if (status.equals("")) {
			System.out.println("Houve um erro ao inserir as notas.");
		} else {
			System.out.println("O aluno " + nomeAluno + " teve média "
					+ mediaNotas + " e está " + status);
		}
		
		keyboard.close();

	}

}
