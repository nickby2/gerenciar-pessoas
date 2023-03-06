package gerencia.pessoas.api.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Gerencia {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Endereco enderecos;

	private String nome;
	private Date dataNascimento;

	public Gerencia() {

	}

	public Gerencia(String nome, Date dataNascimento, Endereco enderecos) {
		super();
		Gerencia.enderecos = enderecos;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static Endereco getEnderecos() {
		return enderecos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerencia other = (Gerencia) obj;
		return Objects.equals(dataNascimento, other.dataNascimento);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " ,Data de nascimento: " + sdf.format(dataNascimento);
	}

}
