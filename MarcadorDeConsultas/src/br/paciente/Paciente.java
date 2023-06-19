package br.paciente;

public class Paciente {
	private long cpf;
	private String nome;
	
	public Paciente(long cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
