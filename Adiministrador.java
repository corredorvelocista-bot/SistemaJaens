import java.util.Scanner;

public class Adiministrador {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		Documentos dc = new Documentos("85145","222","222");
		
		
		func.setNome("Jhonata");
		func.setIdade(35);
		func.setAltura(1.68f);
		func.status();
		func.setDocumentos(dc);
		func.setEndereco(null);
		
		Cliente cl = new Cliente();
		Documentos doc = new Documentos();
		Endereco en = new Endereco("PE", "Toritama", "Deus é fiel", "Adelson silva", "castro",10);
		cl.setNome("Neves");
		doc.setCnpj("512/1111");
		cl.setDocumentos(doc);
		cl.setPessJuridica(false);
		cl.setEndereco(en);
		
		cl.statusCompleto();
		
	}
	
}
