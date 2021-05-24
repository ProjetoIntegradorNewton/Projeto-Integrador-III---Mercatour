package mercatour;
import java.util.*;

public class Conta extends Endereco{



	public String nome;
	protected String email;
	protected String telefone;
	protected String senha;
	protected String resenha;
	protected String cep;
	protected String endereco;
	protected double idUsuario;
	protected String dadosParceiro;

	
	Scanner scanner = new Scanner(System.in);

	
	public void cadastrar(String nome,
			String email,
			String telefone,
			String senha,
			String cep,
			String endereco,
			double idUsuario) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.cep = cep;
		this.endereco = endereco;
		this.idUsuario = idUsuario;
		
		Random random = new Random();
		
		System.out.println("Digite seu nome:");
			nome = scanner.nextLine();
			
		System.out.println("Digite seu E-mail:");
			email = scanner.nextLine();
			
		System.out.println("Digite seu telefone:");
			telefone = scanner.nextLine();
			
		System.out.println("Digite sua senha:");
			senha = scanner.nextLine();
		
		System.out.println("Digite sua senha novamento:");
			resenha = scanner.nextLine();
			
		System.out.println("Digite seu cep:");
			cep = scanner.nextLine();
			
		System.out.println("Digite seu endereco:");
			nome = scanner.nextLine();
		
		idUsuario = random.nextDouble() * 99999999 ;
			
	}
	
	public String cadastrarParceiro(String nome,
			String email,
			String telefone,
			String senha,
			String cep,
			String endereco,
			String idUsuario) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.cep = cep;
		this.endereco = endereco;
		this.idUsuario = idUsuario;
		
		System.out.println("Digite seu nome:");
			nome = scanner.nextLine();
			
		System.out.println("Digite seu E-mail:");
			email = scanner.nextLine();
			
		System.out.println("Digite seu telefone:");
			telefone = scanner.nextLine();
			
		System.out.println("Digite sua senha:");
			senha = scanner.nextLine();
		
		System.out.println("Digite sua senha novamente: ");
			resenha = scanner.nextLine();
			
		System.out.println("Digite seu cep: ");
			cep = scanner.nextLine();
			
		System.out.println("Digite seu endereco: ");
			nome = scanner.nextLine();
			
		return dadosParceiro;
		
	}
	
	public boolean validaCep(String cep) {
		//Valida o cep junto à API dos correios
		this.cep = cep;
		
		return true;
	}
	
	public boolean validaSenha(String senha, String resenha) {
		
		this.senha = senha;
		
		if (senha == resenha) {
			return true;
		}else {
			return false;
		}
	}
	
	public String buscaCep(String logradouro, String estado) {
		//consulta de cep no correios
		this.cep = cep;
		
		return cep;
	}
}




