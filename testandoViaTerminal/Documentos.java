
public class Documentos {
	private int rg;
	private int cpf;
	private String cnpj;
		
	public Documentos(int rg, int cpf, String cnpj) {
		this.rg = rg;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
