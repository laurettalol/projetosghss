package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Prontuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int pacienteId;
	private String historicoMedico;
	
	
	//Constructor
	public Prontuario(int id, int pacienteId, String historicoMedico) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.historicoMedico = historicoMedico;
	}

	//Getters e Setters
		
	public void atualizar(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

}
