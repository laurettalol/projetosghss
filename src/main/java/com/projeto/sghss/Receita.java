package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
    private int pacienteId;
    private int profissionalId;
    private String medicamentos;
    private String dataEmissao;
    
    
    //Constructor
    public Receita(int id, int pacienteId, int profissionalId, String medicamentos, String dataEmissao) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.profissionalId = profissionalId;
		this.medicamentos = medicamentos;
		this.dataEmissao = dataEmissao;
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

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public int getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(int profissionalId) {
		this.profissionalId = profissionalId;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}


	//Emissão
	public void emitir(String medicamentos) {
        this.medicamentos = medicamentos;
        this.dataEmissao = java.time.LocalDate.now().toString();
    }
	
}
