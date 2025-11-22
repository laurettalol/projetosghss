package com.projeto.sghss;

public class Prontuario {

	Long id;
	Long pacienteId;
	String historicoMedico;
	
	public void atualizar(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}
}
