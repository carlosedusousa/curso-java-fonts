package testes;
/** Teste unitário para multiplos de três e cinco
 * Caso por 3 imprime Fizz
 * Caso por 5 imprime Buzz
 * Por Ambos imprime FizzBuzz
 * Por Outros imprime o próprio número 
 **/

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fb = new FizzBuzz();

	@Test
	public void porTres() {

		assertEquals("Fizz", fb.divisivelPor(3));
		assertEquals("Fizz", fb.divisivelPor(6));
		assertEquals("Fizz", fb.divisivelPor(9));
		assertEquals("Fizz", fb.divisivelPor(12));
		assertEquals("Fizz", fb.divisivelPor(18));

	}

	@Test
	public void porCinco() {

		assertEquals("Buzz", fb.divisivelPor(5));
		assertEquals("Buzz", fb.divisivelPor(10));
		assertEquals("Buzz", fb.divisivelPor(20));
		assertEquals("Buzz", fb.divisivelPor(25));
		assertEquals("Buzz", fb.divisivelPor(50));
		assertEquals("Buzz", fb.divisivelPor(65));

	}

	@Test
	public void porCincoTres() {

		assertEquals("FizzBuzz", fb.divisivelPor(15));
		assertEquals("FizzBuzz", fb.divisivelPor(30));
		assertEquals("FizzBuzz", fb.divisivelPor(60));
		assertEquals("FizzBuzz", fb.divisivelPor(90));
		assertEquals("FizzBuzz", fb.divisivelPor(45));
		assertEquals("FizzBuzz", fb.divisivelPor(60));

	}

	@Test
	public void porNenhum() {

		assertEquals("1", fb.divisivelPor(1));
		assertEquals("2", fb.divisivelPor(2));
		assertEquals("4", fb.divisivelPor(4));
		assertEquals("7", fb.divisivelPor(7));
		assertEquals("8", fb.divisivelPor(8));
		assertEquals("97", fb.divisivelPor(97));

	}
}
