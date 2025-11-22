package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
    private String nome;
    
    
    //Constructor
    public Administrador(int id, String nome, String cargo) {
		super();
		this.id = id;
		this.nome = nome;
	}

	//Getters e Setters
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	//Status da internação 
	public void gerenciarInternacao(Internacao internacao, boolean finalizar) {
        if (finalizar) {
            internacao.registrarSaida();
        } else {
            internacao.registrarEntrada();
        }
    }

}
