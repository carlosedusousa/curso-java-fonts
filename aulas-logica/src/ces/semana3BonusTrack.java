//5 - [Bonus Track] 
//Com uma taxa de infla��o de 5,91% ao ano, uma fam�lia que ganha um sal�rio m�nimo R$724,00 
//e tem gastos com sua cesta b�sica R$351,46, gastos com deslocamento de 60.5 e gastos com a 
//moradia de R$350,00 (agua, luz, telefone, alugel).

//A partir destes dados, informe (imprima na tela) a progress�o ano a ano (de 2014 at� 2024) 
//de todo dinheiro que a fam�lia conseguiu acumular naquele ano. 

//Informe tamb�m (imprima na tela) tamb�m o valor do primeiro ano que a fam�lia conseguiu 
//acumular e o valor acumuladoTotal no �ltimo ano.

//Informe tamb�m (imprima na tela) o total de valores acumulados ao final dos 10 anos.

package ces;

public class semana3BonusTrack {

	public static void main(String[] args) {

		double salarioMinimo = 724.00;
		double alimentacao = 351.46;
		double deslocamento = 60.50;
		double moradia = 350.00;
		double inflacao = 1.0591;
		double acumuladoAnual = salarioMinimo - (alimentacao + deslocamento + moradia);
		double acumuladoTotal = acumuladoAnual;

		for (int ano = 2014; ano <= 2024; ano++) {

			System.out.printf("\n\nANO                %d "
							+"\n___________________________"
							+ "\n+Sal�rio:          %.2f "
							+ "\n-Alimenta��o:      %.2f "
							+ "\n-Deslocamento:     %.2f "
							+ "\n-Moradia:          %.2f "
							+ "\n=Acumulado Anual:  %.2f "
							+ "\n=Acumulado Total:  %.2f ",
							ano,
							salarioMinimo,
							deslocamento,
							alimentacao, 
							moradia, 
							acumuladoAnual, 
							acumuladoTotal);
					
			// Define a multiplica��o do acrecimo da infla��o.
			salarioMinimo *= inflacao;
			alimentacao *= inflacao;
			deslocamento *= inflacao;
			moradia *= inflacao;

			// Valida o decrescimo do Ativo.
			acumuladoAnual = salarioMinimo - (alimentacao + deslocamento + moradia);
			
			// Acumula os Ativos (Se resultado for negativo � a divida acumulada!).
			acumuladoTotal += acumuladoAnual;  
		}

	}

}
