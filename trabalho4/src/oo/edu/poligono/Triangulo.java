// (c)2014|carlosedusousa.

package oo.edu.poligono;


// Triangulo:
// ap(3) = L V¨3 / 6 
// a apotena do Hexagono equilatero é (lado vezes raiz quadrada de 3
// dividido por 6)

public class Triangulo extends Poligono {

	public Triangulo(double aresta) {
		super.setQntVertices(3);
		super.setTamAresta(aresta);
	}

	public double getArea() {
		return super.semiPerimetro() * (super.getTamAresta() * (Math.sqrt(3) / 6));
	}

}
