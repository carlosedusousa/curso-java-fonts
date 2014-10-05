package oo.estatico.exercicios;


public class TestarConta {

	public static void main(String[] args) {
		
		Agencia contas = new Agencia();
		
		Conta conta0 = new Conta(100, "Nassor");
		Conta conta1 = new Conta(100,"abrobinha");
		Conta conta2 = new Conta(100000,"joazinho");
		Conta conta3 = new Conta(1000000,"canario");
	
		conta1.credito(100);
		conta2.credito(134.99);
		conta3.credito(999.98);
		conta1.debito(3000);
//	
//		System.out.println(conta1.getIdentificador());
//		System.out.println(conta2.getIdentificador());
//		System.out.println(conta3.getIdentificador());
//		
//		double saldoGeral = GerenteDaConta.saldoGeral(conta1,conta2,conta3);
//		System.out.println("\nSaldo: " + saldoGeral + "\n");
//		
//		GerenteDaConta.dadosContas(conta1,conta2,conta3);
		


		
		contas.adicionarConta(conta0);
		contas.adicionarConta(conta1);
		contas.adicionarConta(conta2);
		contas.adicionarConta(conta3);
		
		System.out.println(contas.mostrarContaIndex(1));
		
		contas.mostrarContaNome("abrobinha");

	}

}
