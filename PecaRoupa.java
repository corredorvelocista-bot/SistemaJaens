import java.util.Date;


public class PecaRoupa {
	private String modeloRoupa;
	private String cor;
	private String corLinha;
	private int casaQuantd;
	private int riataQuantd;
	private double preco;
	private float precoTotal;
	private String data;
	private int quantdPeca;
	
	public PecaRoupa() {
		modeloRoupa = "";
		cor = "";
		corLinha = "";
		casaQuantd = 0;
		riataQuantd = 0;
		preco = 0f;
		precoTotal = 0;
		data = data;
		quantdPeca = 0;
	}
	public PecaRoupa(String modeloRoupa, String cor, String corLinha, int CasaQuantd, int riataQuantd, double preco, float precoTotal,String data, int quantdPeca) {
		this.modeloRoupa = modeloRoupa;
		this.cor = cor;
		this.corLinha = corLinha;
		this.casaQuantd = CasaQuantd;
		this.riataQuantd = riataQuantd;
		this.preco = preco;
		//this.precoTotal;
		this.data = data;
		this.quantdPeca = quantdPeca;
	}

	//getters and setters
	public String getmodeloRoupa() {
		return modeloRoupa;
	}
	public void setmodeloRoupa(String modRoupa) {
		this.modeloRoupa = modRoupa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getcorLinha() {
		return corLinha;
	}
	public void setcorLinha(String corLin) {
		this.corLinha = corLin;
	}
	public int getcasaQuantd() {
		return casaQuantd;
	}
	public void setcasaQuantd(int casaQtd) {
		this.casaQuantd = casaQtd;
	}
	public int getriataQuantd() {
		return riataQuantd;
	}
	public void setriataQuantd(int riata) {
		this.riataQuantd = riata;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public float getprecoTotal() {
		return precoTotal;
	}
	public void setprecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}
	public int getquantdPeca() {
		return quantdPeca;
	}
	public void setquantdPeca(int qtdPeca) {
		this.quantdPeca = qtdPeca;
	}
	
	public void cadastrarModeloRoupa(String modelRoupa) {
		setmodeloRoupa(modelRoupa);
	}
	public void CadastrarRoupa(String modeloRoupa, int quantdPeca, String cor, String corLinha, int CasaQuantd, int riataQuantd, double preco, double precoTotal,String data) {
		System.out.println("Modelo Roupa: " + modeloRoupa + "\nQuantidade Peça: " + quantdPeca +"\ncor Peça: " + cor + "\ncor Linha: " + corLinha + "\nCasa Quantd.: " + CasaQuantd + 
				"\nRiata Quantd.: " + riataQuantd +"\nPreço peça: " + preco+ "Valor Total: " + precoTotal + "\nData entrada: " + data);
	}
	protected static void CalcularPreco(int quantdPeca, double preco){
		double resultado = quantdPeca * preco;
		System.out.println("Valor: R$ " +resultado);
	}
	
}
