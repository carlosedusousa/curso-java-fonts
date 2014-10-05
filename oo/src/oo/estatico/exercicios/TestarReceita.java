package oo.estatico.exercicios;

import java.util.ArrayList;

public class TestarReceita {

	public static void main(String[] args) {
		
		// Receita chamada bolo e add primeiro array ingredientes.
		Receita bolo = new Receita("Bolo");

		bolo.adicionaIngrediente(new Ingrediente("Farinha com fermento",
				1000.0f));
		bolo.adicionaIngrediente(new Ingrediente("Ovos", 9));
		bolo.adicionaIngrediente(new Ingrediente("Leite", 1.0f));
		bolo.adicionaIngrediente(new Ingrediente("Chocolate", 500.0f));

		// ingredientes... inseridos no segundo array dispensa para comparar com o primeiro.
		ArrayList<Ingrediente> dispensa = new ArrayList<>();

		dispensa.add(new Ingrediente("farinha com fermento", 1100.0f));
		dispensa.add(new Ingrediente("Ovos", 9));
		dispensa.add(new Ingrediente("Leite", 1.0f));
		dispensa.add(new Ingrediente("Chocolate", 500.0f));
		dispensa.add(new Ingrediente("Caramelo", 5000.0f));

		
		// joga a dispensa na receita..
		System.out.println(bolo.possoPreparar(dispensa) ? "Pronto"
				: "Não dá para fazer");

	}

}
