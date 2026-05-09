import java.util.Scanner;

public class Adiministrador {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
			
		//Documentos
		f1.cadastrarEstado("Pe");
		f1.cadastrarCidade("Toritama");
		f1.cadastrarBairro("Deus é Fiel");
		f1.cadastrarCepCidade(5515000);
		f1.cadastrarPontoReferencia("Auto escola toritama");
		
		f1.setNome("Jhonata wallas carvalho silva");
		f1.setIdade(34);
		f1.setPeso(70);
		f1.setAltura(1.75f);
	
		//documentos
		f1.cadastarRg("0000212");
		f1.cadastrarCpf("000");
	
		//contatos
		f1.cadastrarCelular("(81) 856956");
		f1.cadastrarEmail("jonatasimples231@gmail.com");
		
		//funcionario
		f1.setSalario(1.680);
		f1.setTurno("Dia");
		f1.setProfissao("ADS");
		f1.statusAtual();
		
		cliente();
	}
	public static void cliente() {
		Cliente c1 = new Cliente();
		//
		c1.setPessJuridica(false);
		c1.setNome("jhonata wallas varvalh sivla");
		c1.cadastarCnpj("000120/215");
		c1.cadastrarEstado("Pe");
		c1.cadastrarCidade("toritama");
		c1.cadastrarBairro("Deus é fiel");
		c1.cadastrarRua("Adelson silva");
		
		c1.status();
	}
}
