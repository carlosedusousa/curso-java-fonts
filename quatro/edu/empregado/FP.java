package oo.edu.empregado;

// Classe Main Folha de Pagamento (FP).
public class FP {

	public static void main(String[] args) {

		// Criando o objeto Chefe.
		Empregado chefe = new Chefe("Angelina", "Julie", "CIO", 3000.00);
		// Imprime pelo método toString.
		System.out.println(chefe);

		// Criando o objeto Comissionado.
		Empregado comissionado = new TrabalhadorComissionado("Morgan",
				"freemam", "Comissionado", 2000.00, 5, 200);
		// Imprime pelo método toString.
		System.out.println(comissionado);

		// Criando o objeto Produtor.
		Empregado produtor = new TrabalhadorPecaProduzida("Joâo", "Aquino",
				"Montador eletrônico", 2599, 0.59);
		// Imprime pelo método toString.
		System.out.println(produtor);

		// Criando o objeto Horista.
		Empregado horista = new TralhadorHora("Professor", "Amarildo",
				"Professor de Matemática", 45, 30, 4);
		// Imprime pelo método toString.
		System.out.println(horista);

	}

}
