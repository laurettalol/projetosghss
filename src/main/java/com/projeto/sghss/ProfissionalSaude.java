package com.projeto.sghss;

public class ProfissionalSaude {
	Long id;
    String nome;
    String crm;
    String especialidade;

    public void realizarConsulta(Consulta consulta) {
        consulta.agendar();
    }

    public Receita emitirReceita(Long pacienteId, String medicamentos) {
        Receita receita = new Receita();
        receita.emitir(medicamentos);
        return receita;
    }
	
}
