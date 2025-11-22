package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Teleconsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
    private int pacienteId;
    private int profissionalId;
    private String linkVideo;
    private String dataHora;

     
    //Constructor    
	public Teleconsulta(int id, int pacienteId, int profissionalId, String linkVideo, String dataHora) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.profissionalId = profissionalId;
		this.linkVideo = linkVideo;
		this.dataHora = dataHora;
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
