// (c)2014|carlosedusousa.

package oo.edu.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Limpa {

	// Limpa o arquivo de banco base_pessoas.dat toda vez que o método é invocado.
	public void limpa() {
		File arquivo = new File("res/base_pessoas.dat");

		try {
			FileWriter f = new FileWriter(arquivo);
			BufferedWriter b = new BufferedWriter(f);
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
