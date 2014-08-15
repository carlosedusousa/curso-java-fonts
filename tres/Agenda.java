package oo.edu.tres;

import java.util.ArrayList;

/*
 Desenvolva uma aplicativo de agenda.
 1 - Uma agenda possui uma série de compromissos;
 2 - Cada agenda é uma lista de compromissos;
 3 - Cada compromisso possui: uma data de início, um título e uma descrição;
 4 - A agenda não suporta dois compromissos dentro do mesmo dia;
 5 - A agenda tem um método que imprime todos os compromissos de um 
 mês específico a partir do número do mês;
 6 - Cada compromisso sabe se imprimir [toString()]
 7 - Crie um classe chamada TestarAgenda para testar as funcionalidades da agenda
 */

public class Agenda {

	// Instanciando atributos da Agenda.
	private String nome;
	private ArrayList<Compromisso> compromisso;
	private int i = 0; // Contador de compromisso.

	// Instanciando o construtor da agenda.
	public Agenda(String nome) {
		this.nome = nome;
		this.compromisso = new ArrayList<>();
	}

	// Pega um array de compromissos e adiciona um a um
	// verificando duplicidade de datas.
	public void adicionaVarios(ArrayList<Compromisso> compromissos) {
		for (Compromisso c : compromissos) {
			adicionaCompromiso(c);
		}
	}

	// Adiciona um compromisso na agenda.
	public void adicionaCompromiso(Compromisso a) {

		// Itera em um compromisso.
		i++;

		// Verifica se a agenda está vazia e adiciona o primeiro evento.
		if (this.compromisso.size() == 0) {
			this.compromisso.add(a);
			System.out.println(i + " - Compromisso " + a.getTitulo()
					+ " inserido na agenda " + getNome() + ".");
		} else {
			// Se já existe pelo menos um evento
			// é possível verificar duplicidade das datas.
			if (verificaDuplicidade(a.getDataInicio())) {
				System.out.println(i + " - Já existe a data "
						+ a.getDataInicio() + " para a agenda " + getNome()
						+ ".");
			} else {
				this.compromisso.add(a);
				System.out.println(i + " - Compromisso " + a.getTitulo()
						+ " inserido na agenda " + getNome() + ".");
			}

		}
	}

	// Verifica duplicidade de datas para cada compromisso na agenda.
	public boolean verificaDuplicidade(String s) {
		for (Compromisso c : this.compromisso) {
			if (c.getDataInicio().equals(s)) {
				return true;
			}
		}
		return false;
	}

	// Consulta agenda por mês pesquisado.
	public void consultarMes(String m) {
		System.out.println("EXIBINDO MÊS " + m + " DA AGENDA " + getNome().toUpperCase()	+ ":");

		// Trasforma o mês de string para int.
		int mes = Integer.parseInt(m);

		// Para cada Data na agenda o conversor separa da string o mês
		// para um int.
		for (Compromisso c : this.compromisso) {

			// Se a data da agenda pertencer ao mês pesquisado será exibido.
			if (mes == conversor(c.getDataInicio())) {
				System.out.println(c);
			}
		}
	}

	// Conversor da Data String para o Mês Int.
	private static int conversor(String data) {
		// Array de string recebe o valor do mês.
		String[] dtStr = data.split("/");
		// Retorna um inteiro do mês.
		return Integer.parseInt(dtStr[1]);
	}

	// Remove um compromisso.
	public void removerCompromisso(Compromisso c) {
		compromisso.remove(c);
	}

	// Retorna todos os compromissos da agenda.
	public String toString() {
		String str = "AGENDA " + getNome().toUpperCase() + " \n";
		for (Compromisso c : this.compromisso) {
			str += c.toString() + "\n";
		}
		return str;
	}

	// Retorna o nome da agenda.
	public String getNome() {
		return nome;
	}
}
