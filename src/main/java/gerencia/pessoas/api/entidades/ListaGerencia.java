package gerencia.pessoas.api.entidades;

import java.util.ArrayList;
import java.util.List;

public class ListaGerencia {
	
	private List<Gerencia> pessoas = new ArrayList<>();

	public ListaGerencia(List<Gerencia> pessoas) {
		this.pessoas = new ArrayList<>();
	}

	public List<Gerencia> getPessoas() {
		return pessoas;
	}
	
	public void adicionarPessoas(Gerencia pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removerPessoas(Gerencia pessoa) {
		pessoas.remove(pessoa);
	}
	
	public Gerencia listarPessoas(String nome) {
		for(Gerencia pessoa : pessoas) {
			if(pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}

}
