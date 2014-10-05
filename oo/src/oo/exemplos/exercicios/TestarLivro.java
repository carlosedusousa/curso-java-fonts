package oo.exemplos.exercicios;

public class TestarLivro {

	public static void main(String[] args) {

		// Livro x = new Livro("Imperador",10,1);
		Livro pequenoPrincipe = new Livro("O Pequeno Príncipe");
		Livro finalit = new Livro(pequenoPrincipe.getTitulo(),
				pequenoPrincipe.getQtdPaginas(),
				pequenoPrincipe.getPaginasLidas());

		pequenoPrincipe.setQtdPaginas(98);
		pequenoPrincipe.setPaginasLidas(20);
		System.out.println("O livro " + pequenoPrincipe.getTitulo() + " possui " 
				                      + pequenoPrincipe.getQtdPaginas() + " páginas");
		pequenoPrincipe.verificarProgresso();
		pequenoPrincipe.setPaginasLidas(50);
		pequenoPrincipe.verificarProgresso();

		System.out.println("O livro " + finalit.getTitulo() + " possui "
				+ finalit.getQtdPaginas() + " páginas");

		// System.out.println("O livro "+x.getTitulo()+" possui "+x.getQtdPaginas()+" páginas");
		// x.verificarProgresso();

	}

}
