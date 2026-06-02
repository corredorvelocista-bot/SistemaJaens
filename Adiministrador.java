import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.sistemaJeans.model.auxiliar.Contatos;
import com.sistemaJeans.model.auxiliar.Documentos;
import com.sistemaJeans.model.auxiliar.Endereco;
import com.sistemajeans.producao.PecaRoupa;
import com.sistemajeans.recursoshumanos.Cliente;
import com.sistemajeans.recursoshumanos.Funcionario;
import com.sistemajeans.recursoshumanos.GerenciadorFaltas;
import com.sistemajeans.recursoshumanos.GerenciadorFolhaPagamento;

public class Adiministrador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("digite a data");
		String dataDigitada = sc.nextLine();
		
		LocalDate data = LocalDate.parse(dataDigitada, dataFormatada);
		
		System.out.println("Data pt-BR: " + data);
		GerenciadorFaltas gf = new GerenciadorFaltas();
		gf.setDia(data);
		System.out.println("Gerenciador de faltas: "+ gf.getDia());
		
		DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("Horas extras trabalhadas: ");
		String horaBr = sc.nextLine();
		LocalTime hora = LocalTime.parse(horaBr, horaFormatada);
		GerenciadorFolhaPagamento gfp = new GerenciadorFolhaPagamento(hora);
		System.out.println("Hora extra: " +gfp.getHoraExtra());
	}	
}
