// (c)2014|COC Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>

package coc;

public enum Gender {
	M ("Masculino")
	,F ("Feminino");

	private String descricao;
	
	private Gender(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
