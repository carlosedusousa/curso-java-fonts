package oo.heranca.exercicios;

public class IngressoVip extends Ingresso {
	private double adicional;

	public IngressoVip(double valor , double adicional) {
		super(valor);
		setAdicional(valor + adicional);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	

}
