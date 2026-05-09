
public class Funcionario extends Pessoa{
	private Endereco endereco;
	private Documentos documentos;
	private Contatos contatos;
	int id;
	double salario;
	String profissao;
	int admisao;
	String turno;
	
	//construtor
	public Funcionario() {
		super();
		this.endereco = new Endereco();
		this.documentos = new Documentos();
		this.contatos = new Contatos();
		this.id = 0;
		this.salario = 0.0;
		this.profissao = "";
		this.admisao = 0;
		this.turno = "";
	}
	public Funcionario(int id, double salario,String profissao, int admisao,
			String turno) {
		super();
		this.endereco = new Endereco();
		this.documentos = new Documentos();
		this.contatos = new Contatos();
		this.id = id;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
		super.getNome();
	}
	public Funcionario(Endereco endereco, Documentos documentos, Contatos contatos, int id, double salario, String profissao, int admisao,
						String turno) {
		super();
		this.endereco = endereco;
		this.documentos = documentos;
		this.contatos = contatos;
		this.id = id;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
	}

	//getters e setters
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getAdmisao() {
		return admisao;
	}
	public void setAdmisao(int admisao) {
		this.admisao = admisao;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	//Methods Documentos
	public void cadastrarCpf(String cpf) {
		this.documentos.setCpf(cpf);
	}
	public String mostrarCpf() {
		return documentos.getCpf();
	}
	public void cadastarRg(String rg) {
		this.documentos.setRg(rg);
	}
	public String mostrarRg() {
		return documentos.getRg();
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
	//methods exibição
	public void estatus() {
		System.out.println("Funcionário: " + super.getNome()+ " Idade: " + super.getIdade() + 
				" Função: " + this.getProfissao());
		System.out.println("Contato: " + contatos.getCeclular() +" Telefone: " +contatos.getTelefone() 
				+" Email: "+ contatos.getEmail() 
				+"\n" + "Turno: " + getTurno() +" Salário: " +getSalario());
	}
	public void statusAtual() {
		System.out.println("########### Imformações do Funcionário ###########");
		System.out.println("\nNome: "+ super.getNome().toUpperCase() +" Idade: "+super.getIdade()
							+" anos "+" Peso: " + super.getPeso()+"Kg "+" Altura: "+super.getAltura()+"cm");
		System.out.print("\nCelular: " + this.contatos.getCeclular() + " Celular 02: " + this.contatos.getTelefone() +
							" Email: " + this.contatos.getEmail());
		System.out.println("\nFunção: " + this.getProfissao() +" Salário: " +this.getSalario() +" Turno: "+ this.getTurno());
		System.out.println("\nDocumentos\n CPF: "+ this.documentos.getCpf() +" RG: " +this.documentos.getRg());
		System.out.println("\nEndereço \nEstado: " + this.endereco.getEstado() + " Cidade: " + this.endereco.getCidade() 
						+ " CEP: "+this.endereco.getCepBairro()
						+ "Rua: " + this.endereco.getRua() +" Ponto de referência: "
						+ this.endereco.getPontoReferencia());
		
	}
}
