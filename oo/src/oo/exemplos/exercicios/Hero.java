package oo.exemplos.exercicios;

//Herói (jogo)
//
//Nosso Heroi possui como seus atributos: Seu nome, sua posição atual no mapa (int), quantidade de vida restante (int), seu poder de ataque e seu poder de defesa(double).
//
//Durante a criação do Heroi, aonde ele sempre possui um nome, uma posição inicial, quantos pontos de vida ele tem, quanto é seu poder de ataque e quanto é seu poder de defesa (construtor)
//
//Ele caminha: 15 unidades por vez.
//Corre: equivalente a 10 caminhadas.
//Ataca: Recebe um outro heroi como parametro e reduz da vida deste heroi igual ao poder de ataque do atacante menos a defesa do atacado. Caso este valor seja reduzido a 0 ou menos deve-se reduzir pelo menos 1 de dano no atacado.
//Toma Poção de Vida: Recebe 10 de vida para cada poção utilizada.
//Toma Poção de velocidade, a velocidade de caminhada dele dobra durante a próxima caminhada/corrida.
//
//Se faz necessário em cada uma das funções um log que diga o que está acontecendo. Ex.:
//"O heroi <nome_heroi> caminhou."
//"O heroi <nome_heroi> correu."
//"O heroi <nome_heroi_1> atacou (<poder_heroi_1>) o heroi <nome_heroi_2> (<defesa_heroid_2) e o mesmo recebeu <dano total>, ficando com <vida_heroid_2>.
//"O heroi tomou uma poção de vida e agora está com <vida_heroi> pontos de vida"
//"O heroi tomou uma poção de velocidade."




public class Hero {

	private String nome;
	private int posicao;
	private int vida;
	private double ataque;
	private double defesa;
	private boolean superVelocidade = false;
	
	public Hero(String nome, int posicao, int vida, double ataque, double defesa) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		
//		OU		
//		setNome(nome);
//		setposicao(posicao);
//		setVida(vida);
//		setAtaque(ataque);
//		setDefesa(defesa);

		
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

	public void setposicao(int posicao) {
		this.posicao = posicao;
	}

	
	public int getposicao() {		
		System.out.println("A posicao do " + this.nome + " é " + this.posicao );
		return posicao;
	}


	public void caminha() {
		this.posicao += (isSuperVelocidade() ? 30 : 15);
		setSuperVelocidade(false);
		System.out.println("O heroi " + this.nome + " caminhou! Nova posicao é " + this.posicao);
	}


	public void corre() {	
		this.posicao += (isSuperVelocidade() ? 300 : 150);
		setSuperVelocidade(false);
		System.out.println("O heroi " + this.nome + " correu! Nova posicao é " + this.posicao);
	}


	public int getVida() {
		System.out.println("A Vida do " + this.nome + " é " + this.vida );	
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void atacar(Hero inimigo) {
		int dano = (int) (this.ataque - inimigo.defesa);
		inimigo.setVida(inimigo.getVida() - Math.max(1, dano));		
		System.out.println("O heroi " 
				+ this.nome 
				+ " atacou "
				+ this.ataque 
				+ " O Inimigo " 
				+ inimigo.nome 
				+ " defendeu "
				+ inimigo.defesa 
				+ " e sofreu apenas dano " 
				+ dano
				+ " ficando com "
				+ inimigo.vida
				+ " de vida");
	}
	

	// Método errado.
	
	public void ataca(Hero inimigo) {
		
			int dano = (int) (this.ataque - inimigo.defesa);
	
			if (dano <= 0) {
				inimigo.vida = (int) (inimigo.vida - 1);
			}else{			
				inimigo.vida = (int) (inimigo.vida - dano);
			}
			
			System.out.println("O heroi " 
					+ this.nome 
					+ " atacou "
					+ this.ataque 
					+ " O Inimigo " 
					+ inimigo.nome 
					+ " defendeu "
					+ inimigo.defesa 
					+ " e sofreu apenas dano " 
					+ dano
					+ " ficando com "
					+ inimigo.vida
					+ " de vida");

	}

	public boolean equals(Hero inimigo) {
		return this.nome.equals(inimigo.getNome());
	}

	public void pocaoVida() {
		System.out.println("O heroi " +this.nome + " tomou pocao de vida! Agora sua vida é " + this.vida);
		this.vida += 10;
	}

	// refazer
	public void pocaoVelocidade() {		
		this.setSuperVelocidade(true);
		System.out.println("O heroi " +this.nome + " tomou pocao de velocidade!");
	}

	public boolean isSuperVelocidade() {
		return superVelocidade;
	}

	public void setSuperVelocidade(boolean superVelocidade) {
		this.superVelocidade = superVelocidade;
	}
	
	

}
