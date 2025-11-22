package com.projeto.sghss;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nome; 
	private String cpf; 
	private String dataNascimento;
	
	public Paciente() { }
	 
	// Constructor 
	public Paciente(int id, String nome, String cpf, String dataNascimento) {
		super();
		this.id = id; 
		this.nome = nome; 
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	
	 } 
	//Getters e setters 
	
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
	public String getCpf() { 
		return cpf;
		} 
	public void setCpf(String cpf) { 
		this.cpf = cpf;
		} 
	public String getDataNascimento() { 
		return dataNascimento;
		} 
	public void setDataNascimento(String dataNascimento) { 
		this.dataNascimento = dataNascimento;
		}

}
