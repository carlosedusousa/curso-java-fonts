// (c)2014|carlosedusousa.

package oo.edu.poligono;

public class Quadrado extends Poligono {

	public Quadrado(double aresta) {
		super.setQntVertices(4);
		super.setTamAresta(aresta);
	}

	public double getArea() {
		return super.semiPerimetro() 
				* (super.getTamAresta() * 0.5);
	}
}
