package oo.exemplos.exercicios;

public class Posicao {

	// Atributos X Y como posicionamento cartesiano.
	private int x;
	private int y;

	// Construtor.
	public Posicao(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Metodos que recebem um movimento generico para atribuicao.
	public void moverCima(int movimento) {
		setY(getY() + movimento);
	}

	public void moverBaixo(int movimento) {
		setY(getY() - movimento);
	}

	public void moverDireita(int movimento) {
		setX(getX() + movimento);
	}

	public void moverEsquerda(int movimento) {
		setX(getX() - movimento);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
