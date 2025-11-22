package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
    private Long pacienteId;
    private Long profissionalId;
    private String medicamentos;
    private String dataEmissao;
    
    
    //Constructor
    public Receita(Long id, Long pacienteId, Long profissionalId, String medicamentos, String dataEmissao) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.profissionalId = profissionalId;
		this.medicamentos = medicamentos;
		this.dataEmissao = dataEmissao;
	}

	//Getters e Setters
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

	public Long getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(Long profissionalId) {
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
