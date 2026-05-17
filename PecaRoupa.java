import java.util.Date;
import java.time.LocalDate;

public class PecaRoupa{
	
	private String modeloRoupa;
	private String cor;
	private String corLinha;
	private int casaQuantd;
	private int riataQuantd;
	private double preco;
	private float precoTotal;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private int quantdPeca;
	private Cliente cliente;
	
	public PecaRoupa() {
		
		this.cliente = new Cliente();
		this.modeloRoupa = "";
		this.cor = "";
		this.corLinha = "";
		this.casaQuantd = 0;
		this.riataQuantd = 0;
		this.preco = 0f;
		this.precoTotal = 0;
		this.dataEntrada = LocalDate.now();
		this.dataSaida = LocalDate.now();
		this.quantdPeca = 0;
	}
	public PecaRoupa(String modeloRoupa, String cor, String corLinha, int CasaQuantd, int riataQuantd, double preco, float precoTotal,LocalDate dataEntrada, LocalDate dataSaida ,int quantdPeca, Cliente cliente) {
		
		this.modeloRoupa = modeloRoupa;
		this.cor = cor;
		this.corLinha = corLinha;
		this.casaQuantd = CasaQuantd;
		this.riataQuantd = riataQuantd;
		this.preco = preco;
		//this.precoTotal;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.quantdPeca = quantdPeca;
		this.cliente = cliente;
	}

	//getters and setters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getModeloRoupa() {
		return modeloRoupa;
	}
	public void setModeloRoupa(String modRoupa) {
		this.modeloRoupa = modRoupa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCorLinha() {
		return corLinha;
	}
	public void setCorLinha(String corLin) {
		this.corLinha = corLin;
	}
	public int getcasaQuantd() {
		return casaQuantd;
	}
	public void setCasaQuantd(int casaQtd) {
		this.casaQuantd = casaQtd;
	}
	public int getRiataQuantd() {
		return riataQuantd;
	}
	public void setRiataQuantd(int riata) {
		this.riataQuantd = riata;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public float getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}
	public int getQuantdPeca() {
		return quantdPeca;
	}
	public void setQuantdPeca(int qtdPeca) {
		this.quantdPeca = qtdPeca;
	}
	
	protected static void CalcularPreco(int quantdPeca, double preco){
		double resultado = quantdPeca * preco;
		System.out.println("Valor: R$ " +resultado);
	}
	public void status() {
		System.out.print("Cliente: " + getCliente().getNome() + " Celular: " + getCliente().celular()+ " Modelo: " + this.getModeloRoupa() 
					+ " Quantidade: " + this.getQuantdPeca() + " Quantidade casa: " + this.getcasaQuantd()
					+ " Quantidade Riata: " + this.getRiataQuantd());
	}
	public void statusCmpleto() {
		System.out.print("Cliente: " + getCliente().getNome() + " Modelo: " + this.getModeloRoupa() 
		+ " Quantidade: " + this.getQuantdPeca() + " Quantidade casa: " + this.getcasaQuantd()
		+ " Quantidade Riata: " + this.getRiataQuantd());
}
}
