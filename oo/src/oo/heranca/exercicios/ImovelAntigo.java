package oo.heranca.exercicios;

public class ImovelAntigo extends Imovel {

	private double precoReduzido;

	public ImovelAntigo(String endereco, double preco, double precoReduzido) {
		super(endereco, (preco - precoReduzido));
		setPrecoReduzido(precoReduzido);
	}

	public double getPrecoReduzido() {
		return precoReduzido;
	}

	public void setPrecoReduzido(double precoReduzido) {
		this.precoReduzido = precoReduzido;
	}

	public String toString() {
		return precoReduzido + "";

	}
}
