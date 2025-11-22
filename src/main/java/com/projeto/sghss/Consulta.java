package com.projeto.sghss;

public class Consulta {
	Long id;
	Long pacientId;
	Long profissionalId;
	String dataHora;
	String status;
	
	public void agendar() {
		this.status = "Agendada";
	}
	
	public void cancelar( ) {
		this.status = "Cancelada";
	}

}
