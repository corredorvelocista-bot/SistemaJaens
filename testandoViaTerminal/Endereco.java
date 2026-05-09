
public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String pontoReferencia;
	private int numCasa;
	private int cepCidade;
	private int cepBairro;
	private int cepRua;
	private int contato;
	
	public Endereco() {
		estado = "";
		cidade = "";
		bairro = "";
		rua = "";
		pontoReferencia = "";
		numCasa = 0;
		cepCidade = 0;
		cepBairro = 0;
		cepRua = 0;
		contato = 0;
	}
	public Endereco(String estado, String cidade, String bairro, String rua, String pontoReferencia, int numCasa, int cepCidade, int cepBairro, int cepRua, int contato) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.pontoReferencia = pontoReferencia;
		this.numCasa = numCasa;
		this.cepCidade = cepCidade;
		this.cepBairro = cepBairro;
		this.cepRua = cepRua;
		this.contato = contato;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	public int getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}
	public int getCepCidade() {
		return cepCidade;
	}
	public void setCepCidade(int cepCidade) {
		this.cepCidade = cepCidade;
	}
	public int getCepBairro() {
		return cepBairro;
	}
	public void setCepBairro(int cepBairro) {
		this.cepBairro = cepBairro;
	}
	public int getCepRua() {
		return cepRua;
	}
	public void setCepRua(int cepRua) {
		this.cepRua = cepRua;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	protected static void CadasEnd(String estado, String cidade, String bairro, String rua, String pontoReferencia, int numCasa, int cepCidade, int cepBairro, int cepRua, int contato) {
		System.out.println("Estado: " + estado + "\nCidade: "+cidade+ "\nBairro: " + bairro + "\nRua: " + rua + "\nPonto de referencia: " + pontoReferencia +
				"\nNº: " + numCasa + "\nCEP Cidade: " + cepCidade + "\nCEP Bairro: " + cepBairro + "\nCEP Rua: " + cepRua + "\nContato: " + contato);
	}
}
