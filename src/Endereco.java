package mercatour;
import java.util.*;

public class Endereco {
	String logradouro;
	String bairro;
	int numero;
	String estado;
	String pais;
	String cep;
	
	protected void endereco(String logradouro,
			String bairro,
			int numero,
			String estado,
			String pais,
			String cep) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite o novo logradouro?");
		logradouro = scanner.nextLine();
		
	System.out.println("Digite o novo bairro?");
		bairro = scanner.nextLine();
		
	System.out.println("Digite o novo numero?");
		numero = scanner.nextInt();
		
	System.out.println("Digite o novo estado?");
		estado = scanner.nextLine();
		
	System.out.println("Digite o novo pais?");
		pais = scanner.nextLine();
		
	System.out.println("Digite o novo cep?");
		cep = scanner.nextLine();
	}
}
