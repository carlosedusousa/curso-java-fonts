package util.matrizes;

public class TestarMapa {

	public static void main(String[] args) {

		int linha = 4;
		int coluna = 4;

		MapaCadu brasil = new MapaCadu(linha, coluna, 1);
		System.out.println(" ");
		System.out.print("   ");
		for (int i = 0; i < linha; i++) {
			System.out.print(" " + i);
		}

		System.out.println();

		for (int i = 0; i < linha; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < coluna; j++) {
				switch (brasil.getDimensao()[i][j]) {
				case 0:
					System.out.print("+");
					break;
				case 1:
					System.out.print("O");
					break;
				case 2:
					System.out.print("+");
					break;
				}
				System.out.print(" "); // imprime um espaço entre cada
										// coordenada da matriz
			}
			System.out.print("|");
			System.out.println(); // pula uma linha para que a matriz seja
									// impressa corretamente
		}

		System.out.print("\n");
		System.out.print("   ");
		for (int i = 0; i < linha; i++) {
			System.out.print(" " + i);
		}
		System.out.print("\n");
		for (int i = 0; i < linha; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < coluna; j++) {
				switch (brasil.getDimensao()[i][j]) {
				case 0:
					System.out.print("0");
					break;
				case 1:
					System.out.print("1");
					break;
				case 2:
					System.out.print("2");
					break;
				}
				System.out.print(" "); // imprime um espaço entre cada
										// coordenada da matriz
			}
			System.out.print("|");
			System.out.println(); // pula uma linha para que a matriz seja
									// impressa corretamente
		}

//		for (int i = 0; i < brasil.getDimensao().length; i++) {
//			for (int j = 0; j < brasil.getDimensao()[0].length; j++) {
//				System.out.println("[" + i + "] [" + j + "] "
//						+ brasil.getDimensao()[i][j]);
//
//			}
//		}

//		System.out
//				.println("\nCORDENADAS\n");
//
//		for (int i = 0; i < brasil.getObstaculos().length; i++) {
//			for (int j = 0; j < brasil.getObstaculos()[0].length; j++) {
//				System.out.println("[" + i + "] [" + j + "] "
//						+ brasil.getObstaculos()[i][j]);
//
//			}
//		}

	}

}
