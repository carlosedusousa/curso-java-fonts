package oo.exemplos.exercicios;

public class Static {
	public int numeroObjetos;
	public int contador;
	public final static int VALOR_CONSTANTE = 10;
	
	public Static() {
		numeroObjetos++;
	}
	
	public void addNumObjetos() {
		numeroObjetos++;
	}
	
	public void addContador() {
		contador++;
	}
	
	public static int addConstante(int num) {
		return VALOR_CONSTANTE + num;
		
	}
	
//	public void setValor(int valor) {
//		this.VALOR_CONSTANTE = valor;
//	}
	
	public int getValor() {
		return Static.VALOR_CONSTANTE;
	}
	
	
}
