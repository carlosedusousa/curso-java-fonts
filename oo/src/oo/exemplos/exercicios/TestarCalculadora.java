package oo.exemplos.exercicios;

public class TestarCalculadora {

	public static void main(String[] args) {
		
		Calculadora s = new Calculadora(1.0, 2.4, '+');
		
		Calculadora d = new Calculadora(10, 2, '/');
		
		Calculadora m = new Calculadora(15, 2, '*');
		
		Calculadora sub = new Calculadora(10, 2, '-');
		
		s.calcular();
		
		d.calcular();
		
		m.calcular();
		
		sub.calcular();
		
		

	}

}
