package oo.trabalho.carlos;

//http://www.calcularaarea.com/poligono_regular.htm
//https://br.answers.yahoo.com/question/index?qid=20080115110526AAvdqy4

//Crie a classe abstrata Polígono, essa classe deve ter o método abstrato getArea;
//Crie as classes concretas 
//Triangulo,  
//Quadrado, 
//Retangulo, 
//Pentágono  
//Hexágono, 

//implemente nessas classes os métodos que calculem a área total da forma geométrica regular de todas elas;  

//Algumas implementações podem ser herdadas, evite a repetição de código;

//Use a fórmula padrão para todos os polígonos regulares. 

// A fórmula simples para achar a área de um polígono regular 
// (com todos os lados e todos os ângulos iguais) é: 
	
//	área = 1/2 x perímetro x apótema. 
//  onde 1/2 x perímetro vira semiperimetro;
//	Em outras palavras, essa fórmula quer dizer que:
//
//    Perímetro = a soma do comprimento de todos os lados
//    Apótema = uma parte que une o centro do polígono 
//    ao meio de qualquer lado que esteja perpendicular a esse lado.

public abstract class Poligono {

	static final double C = 0.5;
	private double tamAresta;
	private int qntVertices;

	public double semiPerimetro() {
		return C * this.getQntVertices() * this.getTamAresta();
	}

	public double getTamAresta() {
		return tamAresta;
	}

	public void setTamAresta(double tamAresta) {
		this.tamAresta = tamAresta;
	}

	public int getQntVertices() {
		return qntVertices;
	}

	public void setQntVertices(int qntVertices) {
		this.qntVertices = qntVertices;
	}

	public abstract double getArea();

}
