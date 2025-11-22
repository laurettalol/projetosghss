package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Internacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
    private int pacienteId;
    private String dataEntrada;
    private String dataSaida;
    private String status; 
    
    
    //Constructor
    public Internacao(int id, int pacienteId, String dataEntrada, String dataSaida, String status) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.status = status;
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

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void registrarEntrada() {
        this.dataEntrada = java.time.LocalDate.now().toString();
        this.status = "Ativa";
    }

    public void registrarSaida() {
        this.dataSaida = java.time.LocalDate.now().toString();
        this.status = "Finalizada";
    }

}
