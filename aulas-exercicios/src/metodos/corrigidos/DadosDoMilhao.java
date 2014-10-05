package metodos.corrigidos;

public class DadosDoMilhao {

	public static void main(String[] args) {
		int[] rolagens = new int[6];
		for(int i = 0; i < 1000000; i++) {
//			rolagens[Dado.rolar()-1]++;
			int sorteio = Dado.rolar();
			int posicao = sorteio -1;
			rolagens[posicao] = rolagens[posicao] + 1;
		}
		
		for(int i = 0; i < rolagens.length; i++) {
			System.out.printf("Face %d foi sorteada %d vezes\n", i+1, rolagens[i]);
		}
		
	}
	
	public static double calculaMedia(int ... notas) {
		double somatotio = 0;
		for(int nota : notas) {
			somatotio += nota; 
		}
		return somatotio /= notas.length;
	}

}
