package com.projeto.sghss;

public class Administrador {
	Long id;
    String nome;
    String cargo;

    public void gerenciarInternacao(Internacao internacao, boolean finalizar) {
        if (finalizar) {
            internacao.registrarSaida();
        } else {
            internacao.registrarEntrada();
        }
    }
}
