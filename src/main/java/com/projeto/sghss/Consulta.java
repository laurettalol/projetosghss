package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Long pacientId;
	private Long profissionalId;
	private String dataHora;
	private String status;
	
	
	//Constructor
	public Consulta(Long id, Long pacientId, Long profissionalId, String dataHora, String status) {
		super();
		this.id = id;
		this.pacientId = pacientId;
		this.profissionalId = profissionalId;
		this.dataHora = dataHora;
		this.status = status;
	}
	//Getters e Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPacientId() {
		return pacientId;
	}
	public void setPacientId(Long pacientId) {
		this.pacientId = pacientId;
	}
	public Long getProfissionalId() {
		return profissionalId;
	}
	public void setProfissionalId(Long profissionalId) {
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
