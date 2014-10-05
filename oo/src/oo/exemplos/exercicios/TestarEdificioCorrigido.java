package oo.exemplos.exercicios;

public class TestarEdificioCorrigido {

	public static void main(String[] args) {
		EdificioNassor edificio = new EdificioNassor(); // criei o edificio
		EdificioNassor edificio2 = new EdificioNassor(); // criei o edifio
		edificio.pinta("Verde");            // pintei ele de verde
		edificio2.pinta("Azul");
		
		edificio2.setPortas(new Porta[7]);
		edificio.setPortas(new Porta[6]);   // Adicionei 6 portas a ele
	
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		edificio2.adicionarPorta(new Porta());
		
		
		edificio.adicionarPorta(new Porta()); // 1
		edificio.adicionarPorta(new Porta()); // 2
		edificio.adicionarPorta(new Porta()); // 3
		edificio.adicionarPorta(new Porta()); // 4
		edificio.adicionarPorta(new Porta()); // 5
		edificio.adicionarPorta(new Porta()); // 6
		edificio.adicionarPorta(new Porta()); // 7 (Não vai se inserida)
		
		edificio.getPortas()[0].abre();
		edificio2.getPortas()[0].abre();
		edificio.getPortas()[3].abre();
		edificio.getPorta(2).abre();
		edificio2.getPorta(2).abre();
		
		edificio2.getPorta(2).pinta("verde");
		edificio.getPorta(2).pinta("amarelo");
		
		edificio.abrirPortas(3, 0, 2);
		
		System.out.println("Total De Portas E1 " + edificio.totalDePortas());
		System.out.println("Total De Portas Abertas E1 " + edificio.quantasPortasEstaoAbertas());

		System.out.println("Total De Portas E2 " + edificio2.totalDePortas());
		System.out.println("Total De Portas Abertas E2 " + edificio2.quantasPortasEstaoAbertas());
		
		System.out.println("Cor porta E1 " + edificio.getPorta(2).getCor());
		System.out.println("Cor porta E2 " + edificio2.getPorta(2).getCor());

	
	}

}
