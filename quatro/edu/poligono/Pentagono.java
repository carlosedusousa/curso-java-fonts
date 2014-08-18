package oo.edu.poligono;

// A apótema de um pentagono Regular provém do cálculo abaixo

// A = apótema
// L = lado do pentágono

// A = L/[2*tg(180/5)] = L/[2*tg(36º)] = 0,688*L 

// usaremos  0,688*L no lugar da Apótema.

public class Pentagono extends Poligono {

	public Pentagono(double aresta) {
		super.setQntVertices(5);
		super.setTamAresta(aresta);
	}

	public double getArea() {
		return super.semiPerimetro() * super.getTamAresta() * 0.688;
	}

}