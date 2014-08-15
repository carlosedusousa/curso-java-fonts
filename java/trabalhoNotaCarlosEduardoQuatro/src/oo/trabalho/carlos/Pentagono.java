package oo.trabalho.carlos;

public class Pentagono extends Poligono {

	public Pentagono(float aresta) {
		super.setQntVertices(5);
		super.setTamAresta(aresta);
	}

	public double getArea() {
		return super.semiPerimetro() * super.getTamAresta() * 0.688;
	}

}
