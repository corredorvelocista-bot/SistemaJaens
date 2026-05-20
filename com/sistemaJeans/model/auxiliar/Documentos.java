package com.sistemaJeans.model.auxiliar;

public class Documentos {
	private String rg;
	private String cpf;
	private String cnpj;
		
	public Documentos() {
		this.rg = "";
		this.cpf = "";
		this.cnpj = "";
	}
	public Documentos(String rg, String cpf, String cnpj) {
		this.rg = rg;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	public Documentos(String rg, String cpf) {
		this.rg = rg;
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
