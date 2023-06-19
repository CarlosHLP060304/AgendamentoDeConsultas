package br.consulta;

import br.medico.Medico;
import br.paciente.Paciente;

public class Consulta {
	private Paciente paciente;
	private Medico medico;
	private String data;
	
	public Consulta(Paciente paciente, Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = "25/04/2023";
	}

	@Override
	public String toString() {
		return "\nNome do paciente: " + paciente.getNome() + "\nNome medico: " + medico.getNome() +
				"\nData Consulta: " + data;
	}

	
}
