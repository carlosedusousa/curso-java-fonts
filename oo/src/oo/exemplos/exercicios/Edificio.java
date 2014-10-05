package oo.exemplos.exercicios;

/*

 Classe: Edificio 

 Atributos: cor; totalDePortas; totalDeAndares; portas[] 

 MÃ©todos: 

 void pinta(String s); 
 int quantasPortasEstaoAbertas(); 
 void adicionaPorta(Porta p); 
 int totalDePortas(); 
 void adicionarAndar(); 
 int totalDeAndares() 

 Para testar;
  
 ** crie um edifÃ­cio; pinteâ€�o. 
 
 ** Crie seis portas e coloqueâ€�as no edifÃ­cio atravÃ©s do mÃ©todo adicionaPorta;
 
 abra e fecheâ€�as como desejar. 
 
 ** Utilize o mÃ©todo quantasPortasEstaoAbertas para imprimir o nÃºmero de portas abertas 
 
 ** e o mÃ©todo totalDePortas para imprimir o total de portas em seu edifÃ­cio. 
 
** Cria alguns andares utilizado o mÃ©todo adicionarAndar 
** e retorne o nÃºmero total de andares utilizando o mÃ©todo totalDeAndares.

 */

public class Edificio {

	private String cor;
	private int totalDePortas;
	private int totalDeAndares;
	private Porta[] portas;
	

	public Porta[] getPortas() {
		return portas;
	}
	
//	public void setPortas(Porta[] portas) {
//		this.portas = portas;
//
//	}
	
	public Porta getPorta(int idx) {
		if(idx < totalDePortas){
			return portas[idx];
		}
		return null;
	}
	
	// tipo setPorta passando ARRAY
	public void adicionarPorta(Porta[] portas){
		this.portas = portas;
	}
	
	// Passando PORTA por PORTA
	public void adicionarPorta(Porta p) {
		if(!(totalDePortas >= portas.length)) {
			portas[this.totalDePortas] = p;
			this.totalDePortas++;
		}
	}
	
	public void abrirPortas(int ... idx) {
		for(int i : idx) {
			if(i < totalDePortas) {
				portas[i].abre();
			}
		}
	}
	
	public int totalDePortas() {
		totalDePortas = 0;

		for (int i = 0; i < this.portas.length; i++)

			if (this.portas[i] != null) {
				totalDePortas++;
			}

		return totalDePortas;
	}
	
	// Verifica as portas abertas.
	public int quantasPortasEstaoAbertas() {
		int contador = 0;

		for (int i = 0; i < totalDePortas; i++) // Não é necessário verificar com length pois já temos o total delas.

			if (this.portas[i].estaAberta()) { // Não precisa verificar se a porta existe, já que as portas REALMENTE existe. this.portas[i] != null não é usado.
				contador++;
			}

		return contador;
	}
	
	
	// setCor
	public void pinta(String s) {
		this.cor = s;
	}

	public String getCor() {
		return cor;
	}

	public void adicionarAndar() {
		totalDeAndares++;
	}

	public void removeAndar() {
		totalDeAndares--;
	}
	
	public int totalDeAndares() {
		return totalDeAndares;
	}



}
