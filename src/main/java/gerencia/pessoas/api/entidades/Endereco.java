package gerencia.pessoas.api.entidades;

import java.util.Objects;

public class Endereco {

	private String logadouro;
	private Integer cep;
	private Integer numero;

	public Endereco(String logadouro, Integer cep, Integer numero) {
		this.logadouro = logadouro;
		this.cep = cep;
		this.numero = numero;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(numero, other.numero);
	}
	
	public String toString() {
		return " Logadouro " + getLogadouro() + ", CEP: " + getCep() + ", número " + getNumero();
	}

}