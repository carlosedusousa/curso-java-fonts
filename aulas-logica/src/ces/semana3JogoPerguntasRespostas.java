/*
   Atividade n�mero 2:
   
   Jogo de Pergunta e Respostas

  - Desenvolva programa que tenha uma lista de 10 Perguntas e Respostas (j� previamente definidas)
  - Este programa selecionar� aleat�riamente uma dessas perguntas e mostrar� para o usu�rio(jogador).
  - O jogador vai possuir 5 chances de acertar a pergunta sen�o o programa ir� selecionar uma nova pergunta a ele.
  - Digite -1 na resposta para finalizar o programa.
  
 */

package ces;

import java.util.Random;
import java.util.Scanner;

public class semana3JogoPerguntasRespostas {

	void finalizar(int qual) {
		if (qual < 10)
			System.out.println("\nJOGO FOI FINALIZADO PELO JOGADOR!");
		else
			System.out.println("\nJOGO FINALIZADO POR FALTA DE PERGUNTAS :)");
	}

	public static void main(String[] args) {
		//Chamada do m�todo fim que imprime que o jogo acabou ou de o jogador desistiu.
		semana3JogoPerguntasRespostas fim = new semana3JogoPerguntasRespostas();

		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		// A vari�vel jogando � declarado pois o bloco do/while deve saber quem � o jogando 
		// e receber� a resposta do jogador para compara��o.
		int jogando;
		
		// A respostaCerta � inicializado com Zero mais receber� 
		// uma das alternativas de resposta.
		int respostaCerta = 0;
		
		// O jogador come�a o jogo com uma tentativa inicial.
		int tentativa; 
		int perguntaSorteada = 0;
		
		// Iniciar jogo
		System.out.println("BEM VINDO AO JOGO PERGUNTANDO!\nATEN��O - Responda de 1 a 5 para a alternativa correta! ou -1 para Sair.\n ");
		
		// Define vetor de 10 posi��es para guardar 10 perguntas.
		int sorteado[] = new int[10];
		int i;
		int y;
		
		// Flag para saber em qual perguta o vetor est�.
		int qual = 0;
		Random gerador = new Random();
		
		//Flag para continuar ou parar o jogo.
		boolean continua = true;
		
		// Ordenda um vetor de 10 posi��es aleat�riamente com n�meros de 1 a 10
		// Definindo a ordem das perguntas que o jogador deve resposnder
		for (i = 0; i < 10; i++) {
			int achou = 0;

			while (achou == 0) {
				achou = 1;
				sorteado[i] = gerador.nextInt(10) + 1;

				for (y = 0; y < 10; y++) {

					if ((sorteado[y] == sorteado[i]) && (i != y)) {
						sorteado[i] = gerador.nextInt(10) + 1;
						achou = 0;
						y = 10;
					}
				}
			}
		}
		
		// TESTE - Imprime a ordena��o das perfuntas geradas randomicamente.
		//for(i = 0; i < 10; i++)
		//	System.out.println(sorteado[i]);
		
		do {
			
			// Enquanto o jogador n�o digitar -1 para sair 
			// ele ficar� digitando um novo n�mero para a resposta certa 
			// at� exceder o n�mero maximo de 5 tentativas.
			tentativa = 1;
			// Sorteando Perguntas de 1 a 10.
			
			perguntaSorteada = sorteado[qual++];
			
			// Defini��o das perguntas e respostas.
			switch (perguntaSorteada) {
			case 1:
				System.out.println(""
						+ "PERGUNTA 1\n"
						+ "\"Um modelo de processo de software � utilizado para explicar uma abordagem" 
						+ "\n para o desenvolvimento de software.\""
						 
						+ "\n\nAssinale a alternativa abaixo que melhor identifica o modelo de processo de software no qual uma" 
						+ "\nimplementa��o inicial � exposta ao usu�rio para que possam ser realizados refinamentos posteriores" 
						+ "\nque representam novas vers�es do sistema. As atividades de especifica��o,"
						+ "\ndesenvolvimento e valida��o s�o intercaladas.\n"
						
						+ "\n 1 - Relational Unified Process (RUP)"
						+ "\n 2 - Desenvolvimento Evolucion�rio"
						+ "\n 3 - M�todo �gil de Desenvolvimento"
						+ "\n 4 - Modelo de Desenvolvimento em Cascata" 
						+ "\n 5 - Modelo de Engenharia de Software Baseado em Componentes"
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 2;
				break;
			case 2:
				System.out.println(""
						+ "PERGUNTA 2\n"
						+"\" Com rela��o ao Data Warehouse e ferramentas OLAP, � correto afirmar:\"\n"
						
						+ "\n 1 - Atrav�s de uma opera��o de Ranking o ana- lista pode obter uma vis�o agregada das informa��es."
						+ "\n 2 - Os sistemas MOLAP (Multidimensional OLAP) permitem an�lise multidimensional dos dados armazenados"
						+ "\nem bancos de dados relacionais."
						+ "\n 3 - Os bancos de dados desenvolvidos para OLTP (On-Line Transactions Processing) s�o considerados"
						+ "\nadequados para a an�lise r�pida e f�cil de informa��es."
						+ "\n 4 - Uma opera��o de Rotation permite ao analista alterar a forma de visualiza��o das informa��es."
						+ "\nCom esta opera��o o analista pode mudar a vis�o que est� tendo dos dados, podendo remover dados irrelevantes."
						+ "\n 5 - As ferramentas OLAP (Analytic Processing On-Line) permitem uma vis�o multidimensional dos dados organizacionais."
						+ "\nOs dados nestes sistemas s�o modelados numa estrutura conhecida por cubo."
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 5;
				break;
			case 3:
				System.out.println(""
						+ "PERGUNTA 3\n"
						+ "\"Um diagrama de classes em UML consiste em classes e nos relacionamentos entre essas classes.\""
						+ "\nAssinale a alternativa que cont�m tipos de relaciona- mentos poss�veis entre as classes:\n"
						
						+ "\n 1 - Generaliza��o; Associa��o; Formal e Refinamentos." 
						+ "\n 2 - Generaliza��o; Associa��o; Interdepend�ncia; Depend�ncia." 
						+ "\n 3 - Associa��es; Generaliza��es; Depend�ncias e Refinamentos." 
						+ "\n 4 - Associa��o; Generaliza��o; Interdepend�ncia; Formal." 
						+ "\n 5 - Generaliza��o; Associa��o e Depend�ncia; Formal."
											
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 3;
				break;
			case 4:
				System.out.println(""
						+ "PERGUNTA 4\n"
						+ "\"Os endere�os de rede e de broadcast, respectivamente, da quarta sub-rede a partir do "
						+ "\nIP 179.16.0.0/23, s�o:\"\n"
						
						+ "\n 1 - 179.16.0.0 e 179.16.4.255" 
						+ "\n 2 - 179.16.3.0 e 179.16.4.255"
						+ "\n 3 - 179.16.3.0 e 179.16.5.255" 
						+ "\n 4 - 179.16.6.0 e 179.16.7.255" 
						+ "\n 5 - 179.16.6.0 e 179.16.8.255"
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 4;
				break;
			case 5:
				System.out.println(""
						+ "PERGUNTA 5\n"
						+ "\"Calcule o n�mero de sub-redes poss�veis, e a quantidade de hosts para cada sub-rede, respectivamente, "
						+ "\npara uma rede classe B cujo primeiro IP da primeira sub-rede �: 184.16.0.1 255.255.192.0.\"\n"
						
						+ "\n 1 - 2; 32766" 
						+ "\n 2 - 4; 16384" 
						+ "\n 3 - 8; 4094" 
						+ "\n 4 - 8; 8190" 
						+ "\n 5 - 16; 4094"
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 2;
				break;
			case 6:
				System.out.println(""
						+ "PERGUNTA 6\n"
						+ "\"O comando do Linux Ubuntu para retornar ao diret�rio (ou pasta) padr�o (diret�rio home) "
						+ "\ndo usu�rio corrente do sistema �:\"\n"
						
						+ "\n 1 - cd" 
						+ "\n 2 - cd .." 
						+ "\n 3 - cd �" 
						+ "\n 4 - cd /" 
						+ "\n 5 - cd ~"
												
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 5;
				break;
			case 7:
				System.out.println(""
						+ "PERGUNTA 7\n"
						+ "\"Diagramas UML apresentam uma forma gr�fica para descrever os sistemas.\""
						+ "\nAssinale a alternativa que apresenta um diagrama UML que mostra a troca"
						+ "\nde mensagens entre diversos Objetos, numa situa��o espec�fica e delimitada no tempo." 
						+ "\nA �nfase deste diagrama est� na ordem e nos momentos nos quais mensagens para os objetos s�o enviadas.\n"
						
						+ "\n 1 - Diagrama de Sequ�ncia" 
						+ "\n 2 - Diagrama de Estado" 
						+ "\n 3 - Diagrama de Fluxo" 
						+ "\n 4 - Diagrama de Classes" 
						+ "\n 5 - Diagrama de Atividades "
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 1;
				break;
			case 8:
				System.out.println(""
						+ "PERGUNTA 8\n"
						+ "\"A op��o (ou par�metro) do comando rm do Linux Ubuntu que tem como fun��o remover/deletar arquivos" 
						+ "\ne tamb�m diret�rios, caso sejam encontrados, �:\"\n"
						
						+ "\n 1 - i" 
						+ "\n 2 - d" 
						+ "\n 3 - f" 
						+ "\n 4 - v" 
						+ "\n 5 - �R"
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 5;
				break;
			case 9:
				System.out.println(""
						+ "PERGUNTA 9\n"
						+ "\"Qual das seguintes especifica��es apresenta um padr�o que define exclusivamente"
						+ "\nmecanismos para publicar e descobrir web services?\"\n"
						
						+ "\n 1 - X.509" 
						+ "\n 2 - WSDL" 
						+ "\n 3 - SOAP" 
						+ "\n 4 - UDDI" 
						+ "\n 5 - XMLDIR"
						
						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 4;
				break;
			case 10:
				System.out.println(""
						+ "PERGUNTA 10\n"
						+ "\"SCRUM � um framework para gerenciar o desenvolvimento de produtos complexos.\""
						+ "\nCom rela��o a essa metodologia, assinale a alternativa correta.\n"
						
						+ "\n 1 - O SCRUM Master � o respons�vel prim�rio pelo gerenciamento do Backlog do produto." 
						+ "\n 2 - O SCRUM Master � respons�vel por ordenar (priorizar) os itens do Backlog do Produto"
						+ "\npara alcan�ar melhor as metas e miss�es." 
						+ "\n 3 - O Sprint Backlog � uma lista de todas as tare- fas que o Time de Desenvolvimento"
						+ "\nse compromete a fazer ao longo do desenvolvimento do produto." 
						+ "\n 4 - O Sprint Backlog � uma lista contendo todas as funcionalidades desejadas para o produto,"
						+ "\nsendo seu conte�do definido pelo SCRUM Master e pelo contratante do projeto." 
						+ "\n 5 - Uma equipe SCRUM � composta por um Product Owner (Dono do Produto),"
						+ "\npor um SCRUM Master e pelo Time de Desenvolvimento."

						+ "\n\nA RESPOSTA �: ");
				respostaCerta = 5;
				break;

			default:
				System.out.println("TODAS AS PERGUNTAS FORAM RESPOSNDIDAS!");
				continua = true;
				respostaCerta = -1; 
				jogando = -1;
				
				break;
			}

			//Recebe a resposta do jogador.
			jogando = keyboard.nextInt();

			// A vari�vel continua define se o jogador responder� nova pergunta por exceder as tentativas (TRUE) 
			// ou se ele decide continuar a jogar por vontade pr�pria (FALSE)
			
			
			if(jogando != -1){
				
				// La�o de valida��o da resposta do jogador com a da pergunta.
				do{
					
					if (respostaCerta == jogando){
						
						System.out.println("Parab�ns, Resposta Correta");
						continua = false;
						tentativa = -1;
						
					} else if(respostaCerta != jogando) {
						
						System.out.println("Resposta Errada, Tente novamente: ");
						jogando = keyboard.nextInt();
						tentativa++;
						
						if(respostaCerta == jogando){
							
							System.out.println("Parab�ns, Resposta Correta!");
							continua = false;
							tentativa = -1;
						}
					
						// Verifica se as tentativas foram excedidas.
						if(tentativa >= 5){
							
							if(qual<10)
								System.out.println("\n\n\nTENTATIVAS EXCEDIDAS \n\"Responda a nova pergunta:\" \n");
							else
								System.out.println("\n\n\nTODAS AS PERGUNTAS FORAM USADAS PELO JOGO.");
							tentativa = -2;
							continua = true;
							respostaCerta = jogando;
							
						}
						
					}
					
				} while (respostaCerta != jogando);
			
			}
					
			// se respostaCerta = jogando e continua � false o jogador acertou a pergunta e pode continuar a jogar ou sair.
			if ((respostaCerta == jogando) && (continua == false)){ 
				
				System.out.println("Para SAIR digite -1! ou OUTRO n�mero para continuar JOGANDO!");
				jogando = keyboard.nextInt();
				
			// se respostaCerta = jogando e continua � true o jogador excedeu as tentativas de resposta e o jogo seleciona nova pergunta.	
			} else if ((respostaCerta == jogando) && (continua == true)){ 
				
				jogando = 0;
			
			}
			
		} while (jogando != -1 && qual < 10);
		// Se o jogador n�o escolheu sair e se todas perguntas n�o foram usadas 
		// o jogador poder� responder uma nova pergunta. 
		
		//Implementando m�todos :)
		
		fim.finalizar(qual);
		
		keyboard.close();

	}
}
