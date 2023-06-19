package br.medico;

public class Medico {
	
	private String nome;
	private String especialidade;
	private boolean disponivel;
	
	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
