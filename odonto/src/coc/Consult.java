// (c)2014|COC Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>

package coc;

import java.util.Date;

public class Consult {

	private int id;

	private Dentist dentista;

	private Customer cliente;

	private Date dataCriacao;

	private double valor;

	private Consult(int id, Dentist dentista, Customer cliente,
			Date dataCriacao, double valor) {
		super();
		this.id = id;
		this.dentista = dentista;
		this.cliente = cliente;
		this.dataCriacao = dataCriacao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dentist getDentista() {
		return dentista;
	}

	public void setDentista(Dentist dentista) {
		this.dentista = dentista;
	}

	public Customer getcliente() {
		return cliente;
	}

	public void setcliente(Customer cliente) {
		this.cliente = cliente;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result
				+ ((dentista == null) ? 0 : dentista.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((cliente == null) ? 0 : cliente.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consult other = (Consult) obj;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dentista == null) {
			if (other.dentista != null)
				return false;
		} else if (!dentista.equals(other.dentista))
			return false;
		if (id != other.id)
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (Double.doubleToLongBits(valor) != Double
				.doubleToLongBits(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consult [id=").append(id).append(", dentista=")
				.append(dentista).append(", cliente=").append(cliente)
				.append(", dataCriacao=").append(dataCriacao)
				.append(", valor=").append(valor).append("]");
		return builder.toString();
	}

}
