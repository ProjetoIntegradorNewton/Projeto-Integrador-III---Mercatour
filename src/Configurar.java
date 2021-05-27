package mercatour;
import java.util.*;

public class Configurar extends Endereco{

	protected ArrayList<String> formaPagamento = new ArrayList<String>();
	protected ArrayList<String> favoritos = new ArrayList<String>();
	protected int saldo;
	protected String enderecos[];

	Scanner scanner = new Scanner(System.in);
	
	public void depositar(int saldo) {
		this.saldo = saldo;
	System.out.println("Quanto voc� deseja depositar?");
		int deposito = scanner.nextInt();
		
	saldo = saldo + deposito;
	System.out.println("Seu novo saldo �: " + saldo);
	
	}
	
	public void escolherFavoritos() {
	
		System.out.println("Quais mercados voc� deseja adicionar como seus favoritos?");
			favoritos.add(scanner.nextLine());
			favoritos.add(scanner.nextLine());
			favoritos.add(scanner.nextLine());

	}
	
	protected void adicionarFormaPagamento() {
		//adiciona formas de pagamento desejada
		System.out.println("Quais formas de pagamento voc� deseja adicionar?");
		formaPagamento.add(scanner.nextLine());
		formaPagamento.add(scanner.nextLine());
		formaPagamento.add(scanner.nextLine());
		
		
	}
	protected void removerFormaPagamento() {
		if(formaPagamento.size() == 0) {
			System.out.println("N�o existem formas de pagamento cadastradas");
		}else {
		System.out.println("Qual forma de pagamento deseja excluir? " + formaPagamento);
		formaPagamento.remove(scanner.nextInt() - 1);//remove a forma de pagamento desejada na posi��o selecionada
		System.out.println("Suas formas de pagamento cadastradas s�o: " + formaPagamento);
		
	}
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
			numero = scanner.nextLine();
			
		System.out.println("Digite o novo estado?");
			estado = scanner.nextLine();
			
		System.out.println("Digite o novo pais?");
			pais = scanner.nextLine();
			
		System.out.println("Digite o novo cep?");
			cep = scanner.nextLine();
	}
}
