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
	private int pacientId;
	private int profissionalId;
	private String dataHora;
	private String status;
	
	
	//Constructor
	public Consulta(int id, int pacientId, int profissionalId, String dataHora, String status) {
		super();
		this.id = id;
		this.pacientId = pacientId;
		this.profissionalId = profissionalId;
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
	public int getPacientId() {
		return pacientId;
	}
	public void setPacientId(int pacientId) {
		this.pacientId = pacientId;
	}
	public int getProfissionalId() {
		return profissionalId;
	}
	public void setProfissionalId(int profissionalId) {
		this.profissionalId = profissionalId;
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
