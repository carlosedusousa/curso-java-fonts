package oo.edu.base;

import oo.edu.base.Consulta;

//Crie um banco de dados que contem o nome e idade de 5 Pessoas. Estes dados precisam ser
//capturados a partir do teclado. Cada dados informado precisa ser inserido em um arquivo
//chamado base_pessoas.dat
//Após isso crie métodos que:
//- Imprimam todas as Pessoas (nome e idade);
//- Imprima apenas as pessoas maiores de 18 anos;
//- Imprima apenas pessoas que iniciam com uma determinada letra (passada por parametro)

public class BD {
	public static void main(String[] args) {
		
		// Limpa o arquivo de base.
//		Limpa l = new Limpa();
//		l.limpa();
		// Insere os nomes e as idades.
		Insere i = new Insere();
		i.insere();
		// Consulta dados.
		Consulta a = new Consulta();
		// Todos.
		a.consultaAll();
		// Com maioridade.
		a.consulta18();
		// Com uma letra expecífica.
		a.consultaNomeComALetra('k');

	}
}
