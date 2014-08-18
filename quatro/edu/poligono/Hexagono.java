package oo.edu.poligono;

// Hexágono:
// ap(6) = L V¨3 / 2 
// a apotena do Hexagono equilatero é (lado vezes raiz quadrada de 3
// dividido por 2)

public class Hexagono extends Poligono {

	public Hexagono(double aresta) {
		super.setQntVertices(6);
		super.setTamAresta(aresta);
	}

	public double getArea() {

		return super.semiPerimetro() * (super.getTamAresta() * (Math.sqrt(3) / 2));
	}

}
