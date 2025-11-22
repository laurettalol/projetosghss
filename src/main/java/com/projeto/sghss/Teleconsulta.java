package com.projeto.sghss;

public class Teleconsulta {
	Long id;
    Long pacienteId;
    Long profissionalId;
    String linkVideo;
    String dataHora;

    public void iniciarChamada() {
        this.linkVideo = "https://videocall.sghss.com/" + id;
    }
}
