
public class Contatos {
	private String ceclular;
	private String telefone;
	private String email;
		
	public Contatos() {
		this.ceclular = "";
		this.telefone = "";
		this.email = "";
	}
	public Contatos(String ceclular, String telefone, String email) {
		this.ceclular = ceclular;
		this.telefone = telefone;
		this.email = email;
	}
	public String getCeclular() {
		return ceclular;
	}
	public void setCeclular(String ceclular) {
		this.ceclular = ceclular;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Methods exibição
	public void status() {
		System.out.print("Celular: " + this.getCeclular() + "Telefone: " +this.getTelefone()+ "Email: " + this.getEmail());
	}
		
	
}
