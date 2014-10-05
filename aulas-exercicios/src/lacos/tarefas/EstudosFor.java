package lacos.tarefas;


public class EstudosFor {

	public static void main(String[] args) {
		String[] listaNomes = new String[4];
		listaNomes[0] = "Nassor";
		listaNomes[1] = "Flávio";
		listaNomes[2] = "Lueji";
		listaNomes[3] = "Tulani";
		
		int tamanhoLista = listaNomes.length;
		
		for (int i = 0; i < tamanhoLista; i++) {
			System.out.println(listaNomes[i]);
		}

	}

}
