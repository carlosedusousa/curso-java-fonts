package oo.exemplos.exercicios;

public class TestarCasa {

	public static void main(String[] args) {

		Casa casa = new Casa();

		// Forma 1
		Porta p1 = new Porta();
		p1.pinta("vermelho");
		p1.abre();
		casa.setPortaEntrada(p1);

		// Forma 2 (Sem defini��es de como ela �)
		casa.setPortaQuarto(new Porta());
		casa.setPortaCozinha(new Porta());

		casa.getPortaQuarto().abre();
		casa.getPortaQuarto().pinta("amarelo");

		casa.getPortaCozinha().abre();
		casa.getPortaCozinha().pinta("verde");
		casa.getPortaCozinha().fecha();
		
		System.out.println("Total de portas s�o " 		+ casa.totalDePortas());
		System.out.println("Portas Abertas s�o " 		+ casa.quantasPortasEstaoAbertas());
		System.out.println("A primeira porta � da cor " + casa.getPortaEntrada().getCor());
		System.out.println("A segunda porta � da cor " 	+ casa.getPortaQuarto().getCor());
		System.out.println("A terceira porta � da cor " + casa.getPortaCozinha().getCor());

	}

}
