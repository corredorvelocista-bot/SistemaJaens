
public class Cliente extends Pessoa{
	private boolean pessJuridica;
	private boolean pessFisica;
	private Documentos documentos;
	
	
	public Cliente() {
		super();
		this.documentos = new Documentos();
		this.pessJuridica = false;
		this.pessFisica = false;
	}
	
	public Cliente(boolean pessJu,boolean pessFi) {
		super();
		this.documentos = new Documentos();
		this.pessJuridica = pessJu;
		this.pessFisica = pessFi;
	}
	
	public boolean getPessJuridica() {
		return pessJuridica; 
	}
	public void setPessJuridica(Boolean pessJuridica) {
		this.pessJuridica = pessJuridica;
		if(this.pessJuridica == true) {
			this.pessFisica = false;
		}else {
			this.setPessFisica(pessFisica);
		}
	}
	public boolean getPessFisica() {
		return pessFisica;
	}
	public void setPessFisica(boolean pessFisica) {
		this.pessFisica = pessFisica;
		if(this.pessFisica == true) {
			this.pessJuridica = false;
		}
	}
	public void setDocumentos(Documentos doc) {
		this.documentos = doc;
	}
	public Documentos getDocumentos() {
		return documentos;
	}
	public void status() {
		if(this.pessJuridica == true) {
			System.out.print("Cliente: " + this.getNome() + " CNPJ: " + this.getDocumentos().getCnpj()
							+ " Estado: " + this.getEndereco().getEstado() + "\nCidade: " + this.getEndereco().getCidade()
							+ " Bairro: " + this.getEndereco().getBairro() + "\nRua: " + this.getEndereco().getRua());
		}else {
			System.out.print("Cliente: " + this.getNome() + " CPF: " + this.getDocumentos().getCpf()
							+ " Estado: " + this.getEndereco().getEstado() + "\nCidade: " + this.getEndereco().getCidade()
							+ " Bairro: " + this.getEndereco().getBairro() + "\nRua: " + this.getEndereco().getRua());
		}
	}
	public void statusCompleto() {
		if(this.pessJuridica == true) {
			System.out.print("Cliente: " + this.getNome() + " CNPJ: " + this.getDocumentos().getCnpj()
							+ "\nEstado: " + this.getEndereco().getEstado() + " Cidade: " + this.getEndereco().getCidade()
							+ " Bairro: " + this.getEndereco().getBairro() + "\nRua: " + this.getEndereco().getRua()
							+ " Nº casa: " + this.getEndereco().getNumCasa()
							+ " Ponto de referencia: " + this.getEndereco().getPontoReferencia()
							+ "\nCEP geral: " + this.getEndereco().getCepCidade());
		}else {
			System.out.print("Cliente: " + this.getNome() + " CPF: " + this.getDocumentos().getCpf()
					+ "\nEstado: " + this.getEndereco().getEstado() + " Cidade: " + this.getEndereco().getCidade()
					+ " Bairro: " + this.getEndereco().getBairro() + "\nRua: " + this.getEndereco().getRua()
					+ " Nº casa: " + this.getEndereco().getNumCasa()
					+ " Ponto de referencia: " + this.getEndereco().getPontoReferencia()
					+ "\nCEP geral: " + this.getEndereco().getCepCidade());
		}
	}
}
