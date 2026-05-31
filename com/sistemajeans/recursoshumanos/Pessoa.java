package com.sistemajeans.recursoshumanos;
import com.sistemaJeans.model.auxiliar.Contatos;
import com.sistemaJeans.model.auxiliar.Endereco;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private String sexo;
	private Endereco endereco;
	private Contatos contatos;
		
	//Construtor e Sobrecarga
	public Pessoa() {
		super();
		this.endereco = new Endereco();
		this.contatos = new Contatos();
		nome = "";
		idade = 0;
		peso = 0;
		sexo = "";
	}
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	public Pessoa(String nome, int idade, float peso, String sexo) {
		this();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
	}
	

	//Methods Getters e setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setEndereco(Endereco ende) {
		this.endereco = ende;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setContatos(Contatos contat) {
		this.contatos = contat;
	}
	public Contatos getContatos() {
		return contatos;
	}
	
	public abstract void status();
	public abstract void statusCompleto();
		
	
	
}
