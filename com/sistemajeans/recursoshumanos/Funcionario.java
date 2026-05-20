package com.sistemajeans.recursoshumanos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.sistemaJeans.model.auxiliar.Documentos;

import java.time.LocalDateTime;

public class Funcionario extends Pessoa{
	private Documentos documentos;
	private double salario;
	private String profissao;
	private LocalDate admisao;
	private String turno;
	private double horaExtra;
	private double valorHoraExtra;
	//LocalDate data;
	
	//construtor
	public Funcionario() {
		super();
		this.documentos = new Documentos();
		this.salario = 0.0;
		this.profissao = "";
		this.admisao = LocalDate.now();
		this.turno = "";
	}
	public Funcionario(double salario,String profissao, LocalDate admisao,
			String turno) {
		super();
		this.documentos = new Documentos();
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
		super.getNome();
	}
	public Funcionario(Documentos documentos,double salario, String profissao, LocalDate admisao,String turno) {
		super();
		this.documentos = documentos;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
	}
	//getters e setters
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public LocalDate getAdmisao() {
		return admisao;
	}
	public void setAdmisao(LocalDate admisao) {
		this.admisao = admisao;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	public double getHoraExtra() {//Exibe o tatal em horas extras trabalhados
		return horaExtra;
	}
	public void setHoraExtra(double horaExt) {
		this.horaExtra = horaExt;
		valorTotalHoraExtra(this.horaExtra);
	}
	public void valorTotalHoraExtra(double value) {//calcula o total em real das horas extras 
		this.valorHoraExtra = (getSalario()/30) * getHoraExtra();
	}
	public double getValorHoraExtra() {//exibe o valor total em real R$ das horas extras
		return valorHoraExtra;
	}
	
	//Methods Documentos
	public void cadastrarCpf(String cpf) {
		this.documentos.setCpf(cpf);
	}
	public String mostrarCpf() {
		return documentos.getCpf();
	}
	public void cadastarRg(String rg) {
		this.documentos.setRg(rg);
	}
	public String mostrarRg() {
		return documentos.getRg();
	}
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	@Override
	public void status() {
		System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade() + " anos "
									+ "Altura " + this.getAltura()
									+ " Peso: " + this.getPeso());
		System.out.println("Celular: " + this.getContatos().getCeclular());
		System.out.println("Salário: R$" + this.getSalario() + " Turno:" + this.getTurno() 
									+ " Função: " + this.getProfissao() 
									+ " Data Admissão: " + this.getAdmisao().format(fmt)
									+ "\n");
	}
	@Override
	public void statusCompleto() {
		System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade() + " anos "
				+ "Altura " + this.getAltura() + " Peso: " + this.getPeso());
		System.out.println("Celular: " + this.getContatos().getCeclular() + " Celular 02: " + this.getContatos().getTelefone()
				+ "\nEmail: " + this.getContatos().getEmail());
		System.out.println("Salário: R$" + this.getSalario() + " Turno:" + this.getTurno() 
				+ " Função: " + this.getProfissao() + " Data Admissão: " + this.getAdmisao().format(fmt));
		System.out.println("Estado: " + this.getEndereco().getEstado() + " Cidade: " + this.getEndereco().getCidade()
				+ "\nBairro: " + this.getEndereco().getBairro() + " Rua: " + this.getEndereco().getRua() + " Nº casa: " + this.getEndereco().getNumCasa()
				+ "\nPonto de referencia: " + this.getEndereco().getPontoReferencia());
	}
}
