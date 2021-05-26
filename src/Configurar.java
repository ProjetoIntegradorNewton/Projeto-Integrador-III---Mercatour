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
		
	System.out.println("Quanto você deseja depositar?");
		float deposito = scanner.nextFloat();
		
	saldo = saldo + deposito;

	}
	
	protected void escolherFavoritos(String favoritos[]) {
		this.favoritos = favoritos;
		
		System.out.println("Quais mercados você deseja adicionar como seus favoritos?");
			favoritos[1] = scanner.nextLine();
			favoritos[2] = scanner.nextLine();
			favoritos[3] = scanner.nextLine();
	}
	
	protected void adicionarFormaPagamento(String[] formaDePagamento) {
		//adiciona formas de pagamento desejada
		this.formaDePagameto = formaDePagamento;
		
		formaPagamento.add("cartão de crédtio 01");
		formaPagamento.add("Vale refeição");
		formaPagamento.add("cartão de crédito 02");
		
	}
	protected void removerFormaPagamento(String[] formaDePagamento) {
		this.formaDePagameto = formaDePagamento; 
		
		formaPagamento.remove(2);//remove cartão de crédito 02
	}
	
	protected void alterarEndereço(String enderecos[]) {
		this.enderecos = enderecos;
		
		System.out.println("Qual endereço deseja alterar?");
			@SuppressWarnings("unused")
			int endereco = scanner.nextInt(); //Qual índice do endereço vai alterar, haja vista poder haver mais de um.
			
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
