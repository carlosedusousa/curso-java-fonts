package oo.exemplos.exercicios;

/*
 a) Classe: Porta

 Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
 Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()

 Para testar, crie uma porta, abra e feche a mesma, pinte‐a de diversas cores, altere suas dimensões e
 use o método estaAberta para verificar se ela está aberta.

 */

public class Porta {

	private boolean aberta;
	private String cor;
	private double dimencaoX, dimencaoY, dimencaoZ;

	public void abre() {
		this.aberta = true;
	}

	public void fecha() {
		this.aberta = false;
	}

	// isAberta.
	public boolean estaAberta() {
		return this.aberta;
	}

	// setCor.
	void pinta(String s) {
		this.cor = s;
	}

	public String getCor() {
		return cor;
	}

	public double getDimencaoX() {
		return dimencaoX;
	}

	public void setDimencaoX(double dimencaoX) {
		this.dimencaoX = dimencaoX;
	}

	public double getDimencaoY() {
		return dimencaoY;
	}

	public void setDimencaoY(double dimencaoY) {
		this.dimencaoY = dimencaoY;
	}

	public double getDimencaoZ() {
		return dimencaoZ;
	}

	public void setDimencaoZ(double dimencaoZ) {
		this.dimencaoZ = dimencaoZ;
	}

}
