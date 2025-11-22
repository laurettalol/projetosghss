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
	private int consultaId;
	
	//Constructor
	public Prontuario(int id, int pacienteId, int consultaId) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
	}
	
	// Getters e Setters
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
	public int getConsultaId() {
		return consultaId;
	}
	public void setConsultaId(int consultaId) {
		this.consultaId = consultaId;
	}
	
	
	
}
