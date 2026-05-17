import java.time.LocalDate;
import java.util.Scanner;

public class Adiministrador {

	public static void main(String[] args) {
		
		//func.statusCompleto();
		Cliente cl = new Cliente();
		cl.setNome("Maria das Neves da Sivla");
		Contatos ct = new Contatos();
		ct.setCeclular("8512593");
		cl.setContatos(ct);
		
		PecaRoupa pr = new PecaRoupa();
		pr.setCliente(cl);
		pr.setModeloRoupa("Calças masculino");
		pr.setQuantdPeca(500);
		pr.setCasaQuantd(2);
		pr.setRiataQuantd(6);
		pr.setCliente(cl);
		pr.setPreco(0.50);
		//String format = String.format("%.4f", pr.getPreco());
		pr.statusCmpleto();
		
		
		
		
		
	}
	public static void methodo() {
		Funcionario func = new Funcionario();
		Documentos dc = new Documentos("85145","222","222");
		Endereco end = new Endereco("Pe", "Toritama", "Deus é fuiel", "Adelson silva chagas","auto escola", 10);
		
		
		func.setNome("Jhonata");
		func.setIdade(35);
		func.setAltura(1.68f);
		func.setSalario(1680);
		func.setDiaFalta(1);
		func.setHoraExtra(3);
		func.setAdmisao(LocalDate.of(2025, 10, 30));
		func.status();

		
		
		func.setDocumentos(dc);
		func.setEndereco(null);
		
		
		
		
		//
		
		System.out.print("\nfalta no mes: " + func.getMesfalta());
		System.out.print("\nvalor desconto falta: R$" + func.descontoFalta());
		System.out.print("\nHoras extras trabalhado: " + func.getHoraExtra());
		System.out.print("\nvalor em hora extra: R$" + func.getSalario()/30);
		System.out.print("\nvalor horas extras trabalhad: R$"+func.getValorHoraExtra());
		System.out.print("\n");
		System.out.print("\nSalario com desconta das faltas: R$" + func.getSalarioDescontado());
		
	}
	
}
