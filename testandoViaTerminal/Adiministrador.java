import java.util.Scanner;

public class Adiministrador {

	public static void main(String[] args) {
		Endereco end = new Endereco("Pe", "Toritama","Deus é Fiel","Adelson Silva Chagas", "Auto Escola Toritama",510, 55125000,0,0,0);
		Funcionario f = new Funcionario(01, 1.680,"Analisa de Sistemas",000,"Dia");		
		
		f.estatus();
		
	}

}
