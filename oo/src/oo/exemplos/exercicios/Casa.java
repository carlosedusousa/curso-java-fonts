package oo.exemplos.exercicios;

/*
 b) Classe: Casa

 Atributos: cor, portaEntrada, portaQuarto, portaCozinha
 Método: void pinta(String s), int quantasPortasEstaoAbertas(), int totalDePortas()

 Para testar, crie uma casa e pinte‐a. Crie três portas e coloque‐as na casa; abra e feche as mesmas
 como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas
 abertas.
 */

public class Casa {

	private String cor;
	private Porta portaEntrada;
	private Porta portaQuarto;
	private Porta portaCozinha;

	void pinta(String s) {
		this.cor = s;
	}

	public String getCor() {
		return this.cor;
	}

	public int quantasPortasEstaoAbertas() {
		int contador = 0;

		// Devemos verificar se é null para não dar erro de Exception in thread "main" java.lang.NullPointerException
		if (this.portaEntrada != null && this.portaEntrada.estaAberta()) {
			contador++;
		}

		if (this.portaQuarto != null && this.portaQuarto.estaAberta()) {
			contador++;
		}

		if (this.portaCozinha != null && this.portaCozinha.estaAberta()) {
			contador++;
		}

		return contador;
	}

	public int totalDePortas() {
		int contador = 0;
		
		if (this.portaEntrada != null) {
			contador++;
		}

		if (this.portaQuarto != null) {
			contador++;
		}

		if (this.portaCozinha != null) {
			contador++;
		}
		
		return contador;
	}

	public Porta getPortaEntrada() {
		return portaEntrada;
	}

	public void setPortaEntrada(Porta portaEntrada) {
		this.portaEntrada = portaEntrada;
	}

	public Porta getPortaQuarto() {
		return portaQuarto;
	}

	public void setPortaQuarto(Porta portaQuarto) {
		this.portaQuarto = portaQuarto;
	}

	public Porta getPortaCozinha() {
		return portaCozinha;
	}

	public void setPortaCozinha(Porta portaCozinha) {
		this.portaCozinha = portaCozinha;
	}

}
