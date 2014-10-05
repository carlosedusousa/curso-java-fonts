// (c)2014|carlosedusousa.

package oo.edu.poligono;


public class MainPoligono {

	public static void main(String[] args) {

		Poligono tri = new Triangulo(5);

		Poligono qua = new Quadrado(10);

		Poligono pen = new Pentagono(5);

		Poligono hex = new Hexagono(5);

		System.out.println("Área do Triangulo : " + tri.getArea());

		System.out.println("Área do Quadrado : " + qua.getArea());

		System.out.println("Área do Pentágono : " + pen.getArea());

		System.out.println("Área do Hexágono : " + hex.getArea());
	}

}
