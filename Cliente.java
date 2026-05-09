
public class Cliente extends Pessoa{
	private boolean pessJuridica;
	private boolean pessFisica;
	private Documentos documentos;
	private Endereco endereco;
	private Contatos contatos;
	
	public Cliente() {
		super();
		//pessJuridica = false;
		//pessFisica = true;
		documentos = new Documentos();
		endereco = new Endereco();
		contatos = new Contatos();
	}
	public Cliente(boolean pessJu,boolean pessFi, Documentos documentos, Endereco endereco, Contatos contatos) {
		this.pessJuridica = pessJu;
		this.pessFisica = pessFi;
		this.documentos = documentos;
		this.endereco = endereco;
		this.contatos = contatos;
	}
	
	public boolean getPessJuridica() {
		return pessJuridica; 
	}
	public void setPessJuridica(Boolean pessJuridica) {
		this.pessJuridica = pessJuridica;
	}
	public boolean getPessFisica() {
		return pessFisica;
	}
	public void setPessFisica(boolean pessFisica) {
		this.pessFisica = pessFisica;
	}
	
	//Methods Documentos
	public void cadastrarCpf(String cpf) {
		this.documentos.setCpf(cpf);
	}
	public String mostrarCpf() {
		return documentos.getCpf();
	}
	public void cadastarCnpj(String cnpj) {
		this.documentos.setCnpj(cnpj);
	}
	public String mostrarCnpj() {
		return documentos.getCnpj();
	}
	
	//Endereços
	public void cadastrarEstado(String estado) {
		this.endereco.setEstado(estado);
	}
	public String mostrarEstado() {
		return endereco.getEstado();
	}
	public void cadastrarCidade(String cidade) {
		this.endereco.setCidade(cidade);
	}
	public String mostrarCidade() {
		return endereco.getCidade();
	}
	public void cadastrarBairro(String bairro) {
		this.endereco.setBairro(bairro);
	}
	public String mostrarBairro() {
		return endereco.getBairro();
	}
	public void cadastrarRua(String rua) {
		this.endereco.setRua(rua);
	}
	public String mostrarRua() {
		return endereco.getRua();
	}
	public void cadastrarPontoReferencia(String pontRef) {
		this.endereco.setPontoReferencia(pontRef);
	}
	public String mostrarPontorefencia() {
		return endereco.getPontoReferencia();
	}
	public void cadastrarCepCidade(int cepCidade) {
		this.endereco.setCepCidade(cepCidade);
	}
	public int mostrarCepBairro() {
		return endereco.getCepCidade();
	}
	
	//Contatos
	public void cadastrarCelular(String celular) {
		this.contatos.setCeclular(celular);
	}
	public String mostrarCelular() {
		return contatos.getCeclular();
	}
	public void cadastrarTelefone(String telef) {
		this.contatos.setTelefone(telef);
	}
	public String mostrarTelefone() {
		return contatos.getTelefone();
	}
	public void cadastrarEmail(String email) {
		this.contatos.setEmail(email);
	}
	public String mostrarEmail() {
		return contatos.getEmail();
	}
	
	public void juridico(boolean ju) {
		if(this.pessJuridica == true) {
			setPessFisica(false);
		}
	}
	public void status() {
		System.out.println("\nCadastro de clientes");
		if(this.pessJuridica ==  true && this.pessFisica == false) {
			System.out.println("\nCliente: " + this.getNome().toLowerCase() + " Cnpj: " + this.documentos.getCnpj());
			System.out.println("\nEndereco \nEstado: " + this.endereco.getEstado() + " Cidade: " + this.endereco.getCidade() 
							+ " Bairro: " + this.endereco.getBairro() + " Rua: " + this.endereco.getRua());
		}else {
			System.out.println("\nCliente: " + this.getNome().toUpperCase() + " CPF: " + this.documentos.getCpf());
			System.out.println("\nEndereco \nEstado: " + this.endereco.getEstado() + " Cidade: " + this.endereco.getCidade() 
							+ " Bairro: " + this.endereco.getBairro() + " Rua: " + this.endereco.getRua());
		}
		
		
	}
}
