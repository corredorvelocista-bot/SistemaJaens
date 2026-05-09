public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	private String sexo;
		
	//Construtor e Sobre carga
	public Pessoa() {
		nome = "";
		idade = 0;
		peso = 0;
		sexo = "";
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, int idade, float peso, float altura, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	

	//Methods Getters e setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//Methods, cadastrar e imprimir dados
	public void cadastrarNome(String nome) {
		setNome(nome);
	}
	public void cadastarIdade(int idade) {
		setIdade(idade);
	}
	public void cadastrarPeso(float peso) {
		setPeso(peso);
	}
	public void cadastrarAltura(float altura) {
		setAltura(altura);
	}
	public void imprimiNome() {
		System.out.println(this.nome);
	}
	public void imprimIdade() {
		System.out.println(this.getIdade());
	}
	public void imprimiPeso() {
		System.out.println(this.getPeso());
	}
	public void imprimirAltura() {
		System.out.print(this.getAltura());
	}
	
}
