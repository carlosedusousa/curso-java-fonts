package oo.exemplos.exercicios;

/*
 * Edificio
Atributos: cor, totalDePortas, totalDeAndares, portas[]
MÃ©todos: void pinta(String s), int quantasPortasEstaoAbertas(), 
         void adicionaPorta(Porta p), int totalDePortas(), 
         void adicionarAndar(), int totalDeAndares()

Para testar, crie um edifÃ­cio, pinteâ€�o. Crie seis portas e coloqueâ€�as 
no edifÃ­cio atravÃ©s do mÃ©todo adicionaPorta, abra e fecheâ€�as como desejar.
Utilize o mÃ©todo quantasPortasEstaoAbertas para imprimir o nÃºmero de 
portas abertas e o mÃ©todo totalDePortas para imprimir o total de portas
em seu edifÃ­cio. Cria alguns andares utilizado o mÃ©todo adicionarAndar e
retorne o nÃºmero total de andares utilizando o mÃ©todo totalDeAndares.
 */
public class EdificioNassor {
	
	private String cor;
	private int totalDePortas;
	private int totalDeAndares;
	private Porta[] portas;
	
	public void adicionarPorta(Porta p) {
		if(!(totalDePortas >= portas.length)) {
			portas[this.totalDePortas] = p;
			this.totalDePortas++;
		}
	}
	
	public String getCor() {
		return cor;
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}
	
	public int totalDePortas() {
		return this.totalDePortas;
	}
	
	public int quantasPortasEstaoAbertas() {
		int c = 0;
		for(int i = 0; i < totalDePortas; i++) {
			if(portas[i].estaAberta()) {
				c++;
			}
		}
		
		return c;
	}
	
	public int totalDeAndares() {
		return this.totalDeAndares;
	}
	
	public void adicionarAndar() {
		this.totalDeAndares += 1;
	}
		
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	public Porta[] getPortas() {
		return portas;
	}	
	
	public Porta getPorta(int idx) {
		if(idx < totalDePortas) {
			return portas[idx];
		}
		
		return null;
	}
	
	public void abrirPortas(int ... idx) {
		for(int i : idx) {
			if(i < totalDePortas) {
				portas[i].abre();
			}
		}
	}

	
}
