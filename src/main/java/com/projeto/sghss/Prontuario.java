package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Prontuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Long pacienteId;
	private String historicoMedico;
	
	
	//Constructor
	public Prontuario(Long id, Long pacienteId, String historicoMedico) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.historicoMedico = historicoMedico;
	}

	//Getters e Setters
		
	public void atualizar(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

}
