package br.execucao;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import br.consulta.Consulta;
import br.medico.Medico;
import br.paciente.Paciente;

public class Main {
	
	public static void main(String[] args) {
		showMessageDialog(null,retornaDadosTabelaConsulta());
	}
	
	private static Consulta[] criaTabelaConsulta() {

		int quantConsultas = Integer.parseInt(showInputDialog(null, "Digite a quantidade de consultas a serem feitas"
				+ "(Obs: Tem que ser feitas pelo menos 3 consultas!):"));
	
		while(!(quantConsultas>=3)) {
			showMessageDialog(null, " Pelo menos 3 consultas tem que ser feitas!!!");
			quantConsultas = parseInt(showInputDialog(null, "Digite a quantidade de consultas a serem feitas"
					+ "(Obs: Tem que ser feitas pelo menos 3 consultas!):"));
		}
		
		Consulta [] consultas = new Consulta[quantConsultas];
		
		for (int i = 0; i < consultas.length; i++) {
			String nome_paciente  = showInputDialog("Digite o nome do paciente: ");
			long cpf = Long.parseLong(showInputDialog("Digite o cpf do paciente: "));
			String nome_medico = showInputDialog("Digite o nome do medico: ");
			String especialidade = showInputDialog("Digite a especialidade do medico: ");
			showMessageDialog(null, "Consulta marcada!!!");
			Paciente paciente = new Paciente(cpf,nome_paciente);
			Medico medico = new Medico(nome_medico, especialidade);
			consultas[i] = new Consulta(paciente,medico);
		}
		
		return consultas;
	}
	
	
	private static String retornaDadosTabelaConsulta() {
	
		Consulta []  consultas = criaTabelaConsulta();
		String aux = "CONSULTAS\n\n";
		int i = 0;
		for (Consulta consulta : consultas) {
			i++;
			aux += "Consulta "+ i + consulta + "\n------------------------------------------------------------------\n\n";
		}
		
		return aux;
	}
	
}
