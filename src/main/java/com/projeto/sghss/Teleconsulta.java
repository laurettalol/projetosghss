package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Teleconsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
    private Long pacienteId;
    private Long profissionalId;
    private String linkVideo;
    private String dataHora;

     
    //Constructor    
	public Teleconsulta(Long id, Long pacienteId, Long profissionalId, String linkVideo, String dataHora) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.profissionalId = profissionalId;
		this.linkVideo = linkVideo;
		this.dataHora = dataHora;
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

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}



	public void iniciarChamada() {
        this.linkVideo = "https://videocall.sghss.com/" + id;
    }

}
