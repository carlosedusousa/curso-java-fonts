package oo.exemplos.exercicios;

//Herói (jogo)
//
//Nosso Heroi possui como seus atributos: Seu nome, sua posição atual no mapa (int), quantidade de vida restante (int), seu poder de ataque e seu poder de defesa(double).
//
//Durante a criação do Heroi, aonde ele sempre possui um nome, uma posição inicial, quantos pontos de vida ele tem, quanto é seu poder de ataque e quanto é seu poder de defesa (construtor)
//
//Ele caminha: 15 unidades por vez.
//Corre: equivalente a 10 caminhadas.
//Ataca: Recebe um outro Heroi como parametro e reduz da vida deste Heroi igual ao poder de ataque do atacante menos a defesa do atacado. Caso este valor seja reduzido a 0 ou menos deve-se reduzir pelo menos 1 de dano no atacado.
//Toma Poção de Vida: Recebe 10 de vida para cada poção utilizada.
//Toma Poção de velocidade, a velocidade de caminhada dele dobra durante a próxima caminhada/corrida.
//
//Se faz necessário em cada uma das funções um log que diga o que está acontecendo. Ex.:
//"O Heroi <nome_Heroi> caminhou."
//"O Heroi <nome_Heroi> correu."
//"O Heroi <nome_Heroi_1> atacou (<poder_Heroi_1>) o Heroi <nome_Heroi_2> (<defesa_Heroid_2) e o mesmo recebeu <dano total>, ficando com <vida_Heroid_2>.
//"O Heroi tomou uma poção de vida e agora está com <vida_Heroi> pontos de vida"
//"O Heroi tomou uma poção de velocidade."

public class Hero2 {

	private String nome;
	private int vida;
	private double ataque;
	private double defesa;
	private boolean superVelocidade = false;
	private Posicao posicao;

	public Hero2(String nome, Posicao posicao, int vida, double ataque,
			double defesa) {

		setNome(nome);
		setPosicao(posicao);
		setVida(vida);
		setAtaque(ataque);
		setDefesa(defesa);

	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public void caminha(String direcao) {
		if (direcao.equals("cima"))
			posicao.moverCima((isSuperVelocidade() ? 30 : 15));
		else if (direcao.equals("baixo"))
			posicao.moverBaixo((isSuperVelocidade() ? 30 : 15));
		else if (direcao.equals("direita"))
			posicao.moverDireita((isSuperVelocidade() ? 30 : 15));
		else if (direcao.equals("esquerda"))
			posicao.moverEsquerda((isSuperVelocidade() ? 30 : 15));

		setSuperVelocidade(false);
		System.out.println("O Heroi " + this.nome
				+ " caminhou! Nova posicao é X: " 
				+ getPosicao().getX() + " e Y: "
				+ getPosicao().getY());
	}

	public void corre(String direcao) {
		if (direcao.equals("cima"))
			posicao.moverCima((isSuperVelocidade() ? 300 : 150));
		else if (direcao.equals("baixo"))
			posicao.moverBaixo((isSuperVelocidade() ? 300 : 150));
		else if (direcao.equals("direita"))
			posicao.moverDireita((isSuperVelocidade() ? 300 : 150));
		else if (direcao.equals("esquerda"))
			posicao.moverEsquerda((isSuperVelocidade() ? 300 : 150));

		setSuperVelocidade(false);
		System.out.println("O Heroi " + getNome() 
				+ " correu! Nova posicao é X: "
				+ getPosicao().getX() + " e Y: " 
				+ getPosicao().getY());
	}

	public int getVida() {
		System.out.println("A Vida do " + getNome() + " é " + getVida());
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void atacar(Hero2 inimigo) {
		int dano = (int) (this.ataque - inimigo.defesa);
		inimigo.setVida(inimigo.getVida() - Math.max(1, dano));
		System.out.println("O Heroi " + this.nome + " atacou " + this.ataque
				+ " O Inimigo " + inimigo.nome + " defendeu " + inimigo.defesa
				+ " e sofreu apenas dano " + dano + " ficando com "
				+ inimigo.vida + " de vida");
	}

	public boolean equals(Hero2 inimigo) {
		return this.nome.equals(inimigo.getNome());
	}

	public void pocaoVida() {
		System.out.println("O Heroi " + this.nome
				+ " tomou pocao de vida! Agora sua vida é " + this.vida);
		this.vida += 10;
	}

	// refazer
	public void pocaoVelocidade() {
		this.setSuperVelocidade(true);
		System.out.println("O Heroi " + this.nome
				+ " tomou pocao de velocidade!");
	}

	public boolean isSuperVelocidade() {
		return superVelocidade;
	}

	public void setSuperVelocidade(boolean superVelocidade) {
		this.superVelocidade = superVelocidade;
	}

}
