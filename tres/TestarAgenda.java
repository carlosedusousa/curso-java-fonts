package oo.edu.tres;

import java.util.ArrayList;

public class TestarAgenda {

	public static void main(String[] args) {

		// Instanciando uma agenda de compromissos de Aniversários.
		Agenda aniversario = new Agenda("Aniversário");
		// Instanciando uma agenda de compromissos Importantes.
		Agenda trabalho = new Agenda("Importante");

		// Inserindo compromissos um a um para a agenda de Aniversários.
		// Após inserir um como promisso com uma data,
		// Outro compromisso com a mesma data não será inserido na agenda.
		
		aniversario.adicionaCompromiso(new Compromisso("10/07/2014",
				"Aniversário", "Comprar presente até as 15h."));
		aniversario.adicionaCompromiso(new Compromisso("11/07/2014",
				"Casamento", "Lavar terno, engraxar sapatos, alugar um carro"));
		aniversario.adicionaCompromiso(new Compromisso("10/07/2014",
				"Aniversário", "Comprar presente até as 15h."));
		aniversario.adicionaCompromiso(new Compromisso("11/07/2014",
				"Casamento", "Lavar terno, engraxar sapatos, alugar um carro"));
		aniversario.adicionaCompromiso(new Compromisso("14/08/2014",
				"Festa de Reunião de Trabalho",
				"Levar presente de amigo invisível"));
		aniversario.adicionaCompromiso(new Compromisso("14/08/2014",
				"Festa de Reunião de Trabalho",
				"Levar presente de amigo invisível"));

		// Inserindo compromissos um a um para a agenda Importante.
		trabalho.adicionaCompromiso(new Compromisso("24/09/2014",
				"Trabalho de Java", "Criar Agenda no Java."));
		trabalho.adicionaCompromiso(new Compromisso("24/09/2014",
				"Trabalho de Java", "Criar Agenda no Java."));
		trabalho.adicionaCompromiso(new Compromisso("30/10/2014",
				"Trabalho de Java",
				"Uma agenda possui uma série de compromissos."));
		trabalho.adicionaCompromiso(new Compromisso("11/11/2011", "JAVA",
				"Cada compromisso possui: uma data de início."));
		trabalho.adicionaCompromiso(new Compromisso("11/11/2011", "JAVA",
				"Cada compromisso possui: uma data de início."));
		trabalho.adicionaCompromiso(new Compromisso("01/11/2011", "JAVA",
				"aviso - ver compromisso 10/07/2014"));
		trabalho.adicionaCompromiso(new Compromisso("24/09/2014",
				"Trabalho de Java", "Criar Agenda no Java."));

		// Criando um array para amarzenar vários compromissos extras.
		ArrayList<Compromisso> extra = new ArrayList<>();

		// Alimentando o array Extra com informações.
		extra.add(new Compromisso("11/11/2014", "Deveres",
				"Fazer trabalho de Java."));
		extra.add(new Compromisso("12/11/2014", "Comprar",
				"macarão, açucar, batata"));
		extra.add(new Compromisso("12/11/2014", "Comprar",
				"macarão, açucar, batata"));

		// Instanciando nova Agenda de Tarefas Extras.
		Agenda tarefas = new Agenda("Tarefas Extras");

		// Adicionando varios compromissos passando um array para uma nova
		// agenda de Tarefas.
		tarefas.adicionaVarios(extra);

		// Imprimindo os Compromissos presentes na Agenda respectiva.
		System.out.println("\n");
		System.out.println(aniversario);
		System.out.println(trabalho);
		System.out.println(tarefas);
				
		// Consultar na agenda de tarefas todos os compromissos do mês escolhido.
//		System.out.println("CONSULTANDO POR MÊS\n");
		aniversario.consultarMes("07");
		tarefas.consultarMes("11");
		trabalho.consultarMes("11");	
		
	}
}
