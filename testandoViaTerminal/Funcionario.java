
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
	public Funcionario(int id, double salario, String profissao, int admisao,
			String turno) {
		super();
		this.id = id;
		this.salario = salario;
		this.profissao = profissao;
		this.admisao = admisao;
		this.turno = turno;
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
		if(this.salario < 0) {
			this.salario = 0;
		}else {
			this.salario = salario;
		}
	}
	
	//methods exibição
	public void estatus() {
		System.out.println("Funcionário: " + super.getNome() + " Idade: " + this.getNome() + " Função: " + getProfissao());
		System.out.println("Contato: " + contatos.getCeclular() +" Telefone: " +contatos.getTelefone() +" Email: "+ contatos.getEmail() +
				"\n" + "Turno: " + getTurno() +" Salário: " +getSalario());
		
	}
}
