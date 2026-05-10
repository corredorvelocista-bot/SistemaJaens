
public class Funcionario extends Pessoa{
	private Documentos documentos;
	int id;
	double salario;
	String profissao;
	int admisao;
	String turno;
	
	//construtor
	public Funcionario() {
		super();
		this.documentos = new Documentos();
		this.id = 0;
		this.salario = 0.0;
		this.profissao = "";
		this.admisao = 0;
		this.turno = "";
	}
	public Funcionario(int id, double salario,String profissao, int admisao,
			String turno) {
		super();
		this.documentos = new Documentos();
		this.id = id;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
		super.getNome();
	}
	public Funcionario(Documentos documentos, int id, double salario, String profissao, int admisao,
						String turno) {
		super();
		this.documentos = documentos;
		this.id = id;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
	}
	//getters e setters
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
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
	
	@Override
	public void status() {
		System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade() + " anos "
									+ "Altura " + this.getAltura()
									+ " Peso: " + this.getPeso());
		System.out.println("Celular: " + this.getContatos().getCeclular());
		System.out.println("Salário: R$" + this.getSalario() + " Turno:" + this.getTurno() 
									+ " Função: " + this.getProfissao() 
									+ " Data Admissão: " + this.getAdmisao());
	}
	public void statusCompleto() {
		System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade() + " anos "
				+ "Altura " + this.getAltura() + " Peso: " + this.getPeso());
		System.out.println("Celular: " + this.getContatos().getCeclular() + " Celular 02: " + this.getContatos().getTelefone()
				+ "\nEmail: " + this.getContatos().getEmail());
		System.out.println("Salário: R$" + this.getSalario() + " Turno:" + this.getTurno() 
				+ " Função: " + this.getProfissao() + " Data Admissão: " + this.getAdmisao());
		System.out.println("Estado: " + this.getEndereco().getEstado() + " Cidade: " + this.getEndereco().getCidade()
				+ "\nBairro: " + this.getEndereco().getBairro() + " Rua: " + this.getEndereco().getRua() + " Nº casa: " + this.getEndereco().getNumCasa()
				+ "\nPonto de referencia: " + this.getEndereco().getPontoReferencia());
	}
}
