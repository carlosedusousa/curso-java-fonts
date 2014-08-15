package oo.trabalho.carlos;

public class Quadrado extends Poligono {

	public Quadrado(float aresta) {
		super.setQntVertices(4);
		super.setTamAresta(aresta);
	}

	public double getArea() {
		return super.semiPerimetro() 
				* (super.getTamAresta() * 0.5);
	}
}
