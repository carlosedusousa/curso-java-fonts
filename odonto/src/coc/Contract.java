// (c)2014|COC Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>

package coc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author cadu
 *
 */
public class Contract {

	private int id;
	private Customer contratante;
	private Dentist contratada;
	private Date dataCriacao;
	private Date dataExpiracao;
	private List<Pay> pagamentos;

	@SuppressWarnings("unused")
	private Contract(int id, Customer contratante, Dentist contratada) {
		this.id = id;
		this.contratante = contratante;
		this.contratada = contratada;
	}

	public Contract() {
		pagamentos = new ArrayList<Pay>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getContratante() {
		return contratante;
	}

	public void setContratante(Customer contratante) {
		this.contratante = contratante;
	}

	public Dentist getContratada() {
		return contratada;
	}

	public void setContratada(Dentist contratada) {
		this.contratada = contratada;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public List<Pay> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pay> pagamentos) {
		this.pagamentos = pagamentos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contratada == null) ? 0 : contratada.hashCode());
		result = prime * result
				+ ((contratante == null) ? 0 : contratante.hashCode());
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result
				+ ((dataExpiracao == null) ? 0 : dataExpiracao.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((pagamentos == null) ? 0 : pagamentos.hashCode());
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
		Contract other = (Contract) obj;
		if (contratada == null) {
			if (other.contratada != null)
				return false;
		} else if (!contratada.equals(other.contratada))
			return false;
		if (contratante == null) {
			if (other.contratante != null)
				return false;
		} else if (!contratante.equals(other.contratante))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dataExpiracao == null) {
			if (other.dataExpiracao != null)
				return false;
		} else if (!dataExpiracao.equals(other.dataExpiracao))
			return false;
		if (id != other.id)
			return false;
		if (pagamentos == null) {
			if (other.pagamentos != null)
				return false;
		} else if (!pagamentos.equals(other.pagamentos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [id=").append(id).append(", contratante=")
				.append(contratante).append(", contratada=").append(contratada)
				.append(", dataCriacao=").append(dataCriacao)
				.append(", dataExpiracao=").append(dataExpiracao)
				.append(", pagamentos=").append(pagamentos).append("]");
		return builder.toString();
	}

}