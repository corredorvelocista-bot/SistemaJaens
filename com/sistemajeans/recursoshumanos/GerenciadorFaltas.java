package com.sistemajeans.recursoshumanos;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class GerenciadorFaltas {
	private LocalDate diasFalta;//retorna o total de falta
	private LocalDate mesFalta;
	private List<Funcionario> funcionarios;
	
	public GerenciadorFaltas(LocalDate dia, LocalDate mesFalta, List<Funcionario> funcionarios) {
		super();
		this.diasFalta = dia;
		this.mesFalta = mesFalta;
		this.funcionarios = funcionarios;
	}

	public LocalDate getDia() {
		return diasFalta;
	}

	public void setDia(LocalDate dia) {
		this.diasFalta = dia;
	}

	public LocalDate getMesFalta() {
		return mesFalta;
	}

	public void setMesFalta(LocalDate mesFalta) {
		this.mesFalta = mesFalta;
	}

	public GerenciadorFaltas() {
		this.funcionarios = new ArrayList<>();
	}
	
	public void addFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	public void registrarFaltas(Funcionario funcinario) {
		
	}
	
}
