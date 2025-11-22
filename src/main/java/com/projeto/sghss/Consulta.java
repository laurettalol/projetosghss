package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int pacienteId;
	private int profissionalSaudeId;
	private String dataHora;
	private String status;
	
	
	//Constructor
	public Consulta(int id, int pacienteId, int profissionalSaudeId, String dataHora, String status) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.profissionalSaudeId = profissionalSaudeId;
		this.dataHora = dataHora;
		this.status = status;
	}
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPacienteId() {
		return pacienteId;
	}
	public void setPacienteId(int pacientId) {
		this.pacienteId = pacientId;
	}
	public int getProfissionalSaudeId() {
		return profissionalSaudeId;
	}
	public void setProfissionalSaudeId(int profissionalSaudeId) {
		this.profissionalSaudeId = profissionalSaudeId;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Agendar e Cancelar consultas

	public void agendar() {
		this.status = "Agendada";
		
	}
	public void cancelar( ) {
		this.status = "Cancelada";
	}

}
