package com.projeto.sghss;

public class Receita {
	Long id;
    Long pacienteId;
    Long profissionalId;
    String medicamentos;
    String dataEmissao;

    public void emitir(String medicamentos) {
        this.medicamentos = medicamentos;
        this.dataEmissao = java.time.LocalDate.now().toString();
    }

}
