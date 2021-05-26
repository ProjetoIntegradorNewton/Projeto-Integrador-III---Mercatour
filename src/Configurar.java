package mercatour;
import java.util.*;

public class Configurar extends Endereco{

	ArrayList<String> formaPagamento = new ArrayList<String>();
	
	protected float saldo;
	protected String formaDePagameto[];
	protected String enderecos[];
	protected String favoritos[];

	
	Scanner scanner = new Scanner(System.in);
	
	protected void depositar(float saldo) {
		this.saldo = saldo;
		
	System.out.println("Quanto voc� deseja depositar?");
		float deposito = scanner.nextFloat();
		
	saldo = saldo + deposito;

	}
	
	protected void escolherFavoritos(String favoritos[]) {
		this.favoritos = favoritos;
		
		System.out.println("Quais mercados voc� deseja adicionar como seus favoritos?");
			favoritos[1] = scanner.nextLine();
			favoritos[2] = scanner.nextLine();
			favoritos[3] = scanner.nextLine();
	}
	
	protected void adicionarFormaPagamento(String[] formaDePagamento) {
		//adiciona formas de pagamento desejada
		this.formaDePagameto = formaDePagamento;
		
		formaPagamento.add("cart�o de cr�dtio 01");
		formaPagamento.add("Vale refei��o");
		formaPagamento.add("cart�o de cr�dito 02");
		
	}
	protected void removerFormaPagamento(String[] formaDePagamento) {
		this.formaDePagameto = formaDePagamento; 
		
		formaPagamento.remove(2);//remove cart�o de cr�dito 02
	}
	
	protected void alterarEndere�o(String enderecos[]) {
		this.enderecos = enderecos;
		
		System.out.println("Qual endere�o deseja alterar?");
			@SuppressWarnings("unused")
			int endereco = scanner.nextInt(); //Qual �ndice do endere�o vai alterar, haja vista poder haver mais de um.
			
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
