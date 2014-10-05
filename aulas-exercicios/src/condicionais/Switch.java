package condicionais;

/*
 * Muitas vezes quando há uma lista de condicionais (if) muito extensa
 * se faz uso do "switch" para melhorar a legebilidade do programa
 * 
 * A palavra "break" serve para parar a execução das comparações 
 * A palavra "default" serve para executar algo caso nenhuma das comparações
 * for verdadeira
 */
public class Switch {

	public static void main(String[] args) {
		int mes = 7;

		String mesString = "";
		switch (mes) {
		case 1:
			mesString = "Janeiro";
			break;
		case 2:
			mesString = "Fevereiro";
			break;
		case 3:
			mesString = "Março";
			break;
		case 4:
			mesString = "Abril";
			break;
		case 5:
			mesString = "Maio";
			break;
		case 6:
			mesString = "Junho";
			break;
		case 7:
			mesString = "Julho";
			break;
		case 8:
			mesString = "Agosto";
			break;
		case 9:
			mesString = "Setembro";
			break;
		case 10:
			mesString = "Outubro";
			break;
		case 11:
			mesString = "Novembro";
			break;
		case 12:
			mesString = "Dezembro";
			break;
		default:
			mesString = "Que calendário você está utilizando?";
		}
		
		System.out.println(mesString);

		String estacao;
		switch (mes) {
		case 12:
		case 1:
		case 2:
			estacao = "Verão";
			break;
		case 3:
		case 4:
		case 5:
			estacao = "Outono";
			break;
		case 6:
		case 7:
		case 8:
			estacao = "Inverno";
			break;
		case 9:
		case 10:
		case 11:
			estacao = "Primavera";
			break;
		default:
			estacao = "Desconhecida";
		}
		
		System.out.println(estacao);
	}

}
