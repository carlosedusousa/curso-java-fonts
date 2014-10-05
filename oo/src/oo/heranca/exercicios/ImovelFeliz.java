package oo.heranca.exercicios;

public class ImovelFeliz {

	public static void main(String[] args) {
		
		Imovel imv = new ImovelNovo("Rua 13", 100000.00, 30000.00);
		
		

		imv.getEndereco();
		imv.getPreco();
		
		System.out.println(imv);
		
		
	}

}
