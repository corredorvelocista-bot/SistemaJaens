package com.sistemajeans.recursoshumanos;
import java.time.LocalDate;

public class GerenciadorFolhaPagamento {
	private LocalDate horaExtra;
	private LocalDate extrasAcumulados;
	
	
	public GerenciadorFolhaPagamento(LocalDate horaExtra, LocalDate extrasAcumulados) {
		super();
		this.horaExtra = horaExtra;
		this.extrasAcumulados = extrasAcumulados;
	}
	public LocalDate getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(LocalDate horaExtra) {
		this.horaExtra = horaExtra;
	}
	public LocalDate getExtrasAcumulados() {
		return extrasAcumulados;
	}
	public void setExtrasAcumulados(LocalDate extrasAcumulados) {
		this.extrasAcumulados = extrasAcumulados;
	}

}
