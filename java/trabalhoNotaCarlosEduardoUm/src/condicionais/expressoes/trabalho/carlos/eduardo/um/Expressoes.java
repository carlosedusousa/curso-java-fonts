package condicionais.expressoes.trabalho.carlos.eduardo.um;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Expressoes {

	public static void main(String[] args) {

		// Definindo vari�veis que ser� ultilizadas para instanciar valores.
		double a;
		double b;

		// some dois inteiros: 10 e 20. Persista o resultado em uma variavel
		// chamada 'somaIntieros'
		int somaInteiros = 10 + 20;

		TestValores.correcao(somaInteiros, 30);

		// subtraia 30,2 de 50,3. Persista o resultado em uma variável chamada
		// 'subtraido'

		a = 50.3;
		b = 30.2;
		double subtraido = a - b;

		// Formatando para duas casas decimais, por�m se for 0 (nas posi��es #)
		// ele n�o exibe na vari�vel.
		// De 1.10 mostrar� 1.1 trocando o �ltimo zero por nada.
		DecimalFormat decimal = new DecimalFormat("0.##");

		// Como DecimalFormat transforma o n�mero para String ele gera um
		// resultado com virgula.
		// Deve-se transformar para double novamente e trocar a virgula por
		// ponto.
		// Caso n�o troque o m�todo de corre��o n�o aceitar� a string, j� que s�
		// aceita double.
		subtraido = Double.parseDouble(decimal.format(subtraido).replaceAll(",", "."));

		TestValores.correcao(subtraido, 20.1);

		// Outra forma de fazer o tratamento das casas decimais.

		BigDecimal valor1 = new BigDecimal(b);
		BigDecimal valor2 = new BigDecimal(a);
		double resultado = valor2.subtract(valor1).setScale(1, RoundingMode.HALF_EVEN).doubleValue();

		TestValores.correcao(resultado, 20.1);

		// crie uma expressão que resolva: a + 40 - b / 10. Salve na variavel
		// chamada expressaoUm
		b = 10;
		a = 5;
		double expressaoUm = a + 40 - b / 10;

		TestValores.correcao(expressaoUm, 44);

		// verifique se um 10 é maior ou igual que 20 e salve em uma variável
		// chamada expressaoDois
		a = 10;
		b = 20;
		boolean expressaoDois = (a >= b ? true : false);

		TestValores.correcao(expressaoDois, false);

		// verifique se um 10 é menor ou igual que 10 e salve em uma variável
		// chamada expressaoTres
		b = 10;
		boolean expressaoTres = (a >= b ? true : false);

		TestValores.correcao(expressaoTres, true);

		// verifique se um 10 é maior que 10 e salve em uma variável chamada
		// expressaoQuatro

		boolean expressaoQuatro = ((a > b) ? true : false);

		TestValores.correcao(expressaoQuatro, false);

		// verifique se um 10 é maior que 10 e salve em uma variável chamada
		// expressaoCinco a valor inverso
		boolean expressaoCinco = !(a > b ? true : false);

		TestValores.correcao(expressaoCinco, true);

		// Concatene as duas String abaixo (de forma que não uma palavra não
		// fique grudada na outra)
		// e salve em uma variável chamada frase
		String casa = "Era uma casa";
		String cadeira = "sem cadeiras";
		String frase = casa.concat(" " + cadeira);

		TestValores.correcao(frase, "Era uma casa sem cadeiras");
	}

}
