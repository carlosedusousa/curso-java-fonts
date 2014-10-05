package oo.exemplos.exercicios;

/*
Para testar:
 
Crie um edifÃ­cio; pinteâ€�o. 
Crie seis portas e coloqueâ€�as no edifÃ­cio atravÃ©s do mÃ©todo adicionarPorta;
Abra e fecheâ€�as como desejar. 
Utilize o mÃ©todo quantasPortasEstaoAbertas para imprimir o nÃºmero de portas abertas 
e o mÃ©todo totalDePortas para imprimir o total de portas em seu edifÃ­cio. 
Cria alguns andares utilizado o mÃ©todo adicionarAndar 
e retorne o nÃºmero total de andares utilizando o mÃ©todo totalDeAndares.

*/

public class TestarEdificio {

	public static void main(String[] args) {
		
		// FORMA NASSOR
		Edificio edificio = new Edificio(); // criei o edifio
		edificio.pinta("Verde");            // pintei ele de verde
		
		edificio.adicionarPorta(new Porta[6]);   // Adicionei 6 portas a ele
	
		edificio.adicionarPorta(new Porta()); // 1
		edificio.adicionarPorta(new Porta()); // 2
		edificio.adicionarPorta(new Porta()); // 3
		edificio.adicionarPorta(new Porta()); // 4
		edificio.adicionarPorta(new Porta()); // 5
		edificio.adicionarPorta(new Porta()); // 6
		edificio.adicionarPorta(new Porta()); // 7 (NÃ£o vai se inserida)
		
		edificio.getPortas()[0].abre();
		edificio.getPortas()[3].abre();
		edificio.getPorta(2).abre();
		
		edificio.abrirPortas(3, 0, 2);
		
		System.out.println("Total De Portas " + edificio.totalDePortas());
		System.out.println("Total De Portas Abertas " + edificio.quantasPortasEstaoAbertas());

		
		
		// FORMA CARLOS
		// Criando dois edifícios.
		Edificio edificioMaria = new Edificio();		
		Edificio edificioAlameda = new Edificio();
		
		// Criando portas para ambos os edifícios.
		Porta[] portaDoEdificioMaria = new Porta[5];    
		Porta[] portaDoEdificioAlameda = new Porta[6];
		
		// Adicionando portas no array com porta sem nome para Alamenda.
		Porta porta = null;  
		for( int i = 0; i < portaDoEdificioAlameda.length ; i++) {  
			porta = new Porta();  
			portaDoEdificioAlameda[i] = porta;  
		}
		
		
		// Criando portas individualmente por nomes para Maria.
		Porta portaSala = null;  
		portaSala = new Porta(); 
		portaDoEdificioMaria[0] = portaSala;
		
		Porta portaQuarto = null;  
		portaQuarto = new Porta();  
		portaDoEdificioMaria[1] = portaQuarto;
		
		Porta portaWC = null;  
		portaWC = new Porta();  
		portaDoEdificioMaria[2] = portaWC;
		
		Porta portaCozinha = null;  
		portaCozinha = new Porta();
		portaDoEdificioMaria[3] = portaCozinha;
		
		Porta portaEntrada = null;  
		portaEntrada = new Porta();
		portaDoEdificioMaria[4] = portaEntrada;

		// Adicionando portas ao edifício.
		edificioMaria.adicionarPorta(portaDoEdificioMaria);
		
		edificioAlameda.adicionarPorta(portaDoEdificioAlameda);
		
		// Abrir portas.
		portaDoEdificioAlameda[0].fecha();
		portaDoEdificioAlameda[1].fecha();
		portaDoEdificioAlameda[2].abre();
		portaDoEdificioAlameda[3].abre();
		portaDoEdificioAlameda[4].abre();
		
		portaEntrada.fecha();
		portaQuarto.abre();
		portaWC.abre();
		portaSala.abre();
		portaCozinha.abre();
		
		// Pintar portas.
		portaDoEdificioAlameda[0].pinta("preta arcoires");
		portaDoEdificioAlameda[1].pinta("preta sol");
		portaDoEdificioAlameda[2].pinta("preta negra");
		portaDoEdificioAlameda[3].pinta("preta pirata");
		portaDoEdificioAlameda[4].pinta("preta coqueiro");
		
		portaEntrada.pinta("rosa");
		portaQuarto.pinta("preta");
		portaWC.pinta("azul");
		portaSala.pinta("verde");
		portaCozinha.pinta("amarela");
		
		// Total de portas dos edifícios.
		System.out.println("Total de Portas Edificio Alameda " + edificioAlameda.totalDePortas());
		System.out.println("Total de Portas Edifício Maria "   + edificioMaria.totalDePortas());
		
		// Total de portas abertas dos edifícios.
		System.out.println("Total de Portas Abertas Edifício Alameda " + edificioAlameda.quantasPortasEstaoAbertas());
		System.out.println("Total de Portas Abertas Edifício Maria "   + edificioMaria.quantasPortasEstaoAbertas());
		

		// Pintando Edifícios.
		edificioMaria.pinta("Marrom Espanhol");
		edificioAlameda.pinta("Cinza Nobre");
		
		// Imprime cores dos Edifícios. 
		System.out.println("Cor do Edifício Alameda é " + edificioAlameda.getCor());
		System.out.println("Cor do Edifício Maria é "   + edificioMaria.getCor());
		
		
		// Adicionando Andares aos Edifícios.
		edificioMaria.adicionarAndar();
		edificioMaria.adicionarAndar();
		edificioMaria.adicionarAndar();
		edificioMaria.adicionarAndar();
		edificioMaria.adicionarAndar();		
		edificioAlameda.adicionarAndar();
		edificioAlameda.adicionarAndar();
		edificioAlameda.adicionarAndar();
		
		
		// Imprimir número de andares dos edifícios.
		System.out.println("Edifício Alameda com " + edificioAlameda.totalDeAndares() + " Andare(s)");
		System.out.println("Edifício Maria com "   + edificioMaria.totalDeAndares()   + " Andare(s)");
		
		edificioMaria.removeAndar();
		System.out.println("Edifício Maria com " + edificioMaria.totalDeAndares() + " Andare(s)");
		
		// Imprimindo cores das portas dos edifícios.
		System.out.println("Edifício Maria Cor da porta da Cozinha é "  + portaCozinha.getCor());
		System.out.println("Edifício Maria Cor da porta do Quarto é "   + portaQuarto.getCor());
		System.out.println("Edifício Maria Cor da porta da Sala é "     + portaSala.getCor());
		System.out.println("Edifício Maria Cor da porta do Banheiro é " + portaWC.getCor());
		System.out.println("Edifício Maria Cor da porta da Entrada é "  + portaEntrada.getCor());
		
		System.out.println("Edifício Alamenda Cor da porta 1 é " + portaDoEdificioAlameda[0].getCor());
		System.out.println("Edifício Alamenda Cor da porta 2 é " + portaDoEdificioAlameda[1].getCor());
		System.out.println("Edifício Alamenda Cor da porta 3 é " + portaDoEdificioAlameda[2].getCor());
		System.out.println("Edifício Alamenda Cor da porta 4 é " + portaDoEdificioAlameda[3].getCor());
		System.out.println("Edifício Alamenda Cor da porta 5 é " + portaDoEdificioAlameda[4].getCor());
		System.out.println("Edifício Alamenda Cor da porta 5 é " + portaDoEdificioAlameda[5].getCor());
		
	}

}
