package com.sistemajeans.recursoshumanos;
import java.time.LocalTime;

public class GerenciadorFolhaPagamento {
	private LocalTime horaExtra;
	private LocalTime extrasAcumulados;
	
	
	public GerenciadorFolhaPagamento(LocalTime horaExtra) {
		this.horaExtra = horaExtra;
	}
	public LocalTime getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(LocalTime horaExtra) {
		this.horaExtra = horaExtra;
	}
	public LocalTime getExtrasAcumulados() {
		return extrasAcumulados;
	}
	public void setExtrasAcumulados(LocalTime extrasAcumulados) {
		this.extrasAcumulados = extrasAcumulados;
	}

}
