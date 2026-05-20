package com.sistemajeans.producao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.sistemajeans.recursoshumanos.Funcionario;

public class Producao {
	private PecaRoupa pecaRoupa;
	private Funcionario funcionario;
	private Maquinas maquinas;
	private int maquinasEmTrabalho;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
	
	//formato de hora glocal desta classe.
	DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Producao(PecaRoupa pecaRoupa, Funcionario funcionario, Maquinas maquinas) {
		this.dataEntrada = LocalDate.now();
		this.pecaRoupa = pecaRoupa;
		this.funcionario = funcionario;
		this.maquinas = maquinas;
	}

	public PecaRoupa getPecaRoupa() {
		return pecaRoupa;
	}

	public void setPecaRoupa(PecaRoupa pecaRoupa) {
		this.pecaRoupa = pecaRoupa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Maquinas getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(Maquinas maquinas) {
		this.maquinas = maquinas;
	}
	public int getMaquinaEmTrabalho() {
		return maquinasEmTrabalho; 
	}
	public void setMaquinaEmTrabalho(int maquinaEmUso) {
		this.maquinasEmTrabalho = maquinaEmUso;
	}
	public int MaquinasRestantes() {
		int totalM = maquinas.getTotalMaquinas();
		return totalM - getMaquinaEmTrabalho();
	}
	public LocalDate getDataSaida() {
		return this.dataSaida;
	}
	public void setDataSaida(LocalDate data) {
		
		this.dataSaida.format(formataData);
	}
	

	public void ListaProducao() {
		System.out.println("Cliente: "+ pecaRoupa.getCliente().getNome() +" Nº Ficha: "+ pecaRoupa.getNumeroFicha()+ " Quantidade: " + pecaRoupa.getQuantdPeca()
				+ "\nModelo: " + pecaRoupa.getModeloRoupa() + " Quantidade casas: " + pecaRoupa.getcasaQuantd() 
				+ " Quantidade Riata: " + pecaRoupa.getRiataQuantd() + "\nFuncionários" + "\nNome: " + funcionario.getNome()
				+ " profissão: " + funcionario.getProfissao()
				+ "\nQuantidade de Máquinas: " + getMaquinaEmTrabalho()
				+ "Data entrada: " + LocalDate.now() + "Data Saída" + dataSaida
				 
				
				
				); 
	}
	
	
}
