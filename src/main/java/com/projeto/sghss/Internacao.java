package com.projeto.sghss;

public class Internacao {
	Long id;
    Long pacienteId;
    String dataEntrada;
    String dataSaida;
    String status; 

    public void registrarEntrada() {
        this.dataEntrada = java.time.LocalDate.now().toString();
        this.status = "Ativa";
    }

    public void registrarSaida() {
        this.dataSaida = java.time.LocalDate.now().toString();
        this.status = "Finalizada";
    }

}
