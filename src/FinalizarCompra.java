package mercatour;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class FinalizarCompra extends ListaCompras{
	
	ArrayList<String> produtos = new ArrayList<String>();

	Random random = new Random();
	Date time = new Date();
	Scanner scanner = new Scanner(System.in);
	
	Date tempoEntrega;
	float total;
	String formaPagamento;
	double cupom;
	protected double idCompra;

	
	protected double idCompraGen(double idCompra) {
		this.idCompra = idCompra;
		
		idCompra = random.nextDouble() * 99999999 ; //ir� gerar um n�mero aleat�rio para o id da compra
		
		return idCompra;

	}
	public String formaDePagamento() {
		
		System.out.println("Qual forma de pagamento deseja?");
			formaPagamento = scanner.nextLine();
		return formaPagamento;
	}
	
	public void adicionarProdutos() {
		System.out.println("Quais produtos deseja adicionar?");
		produtos.add(scanner.nextLine());
		produtos.add(scanner.nextLine());
		produtos.add(scanner.nextLine());
		produtos.add(scanner.nextLine());
		
		System.out.println("Seus produtos escolhidos s�o" + produtos);
		
	
	}
	public void removerProdutos() {
		if(produtos.size() == 0) {
			System.out.println("N�o existem produtos selecionados");
		}else {
		System.out.println("Qual produto deseja remover? " + produtos);
		produtos.remove(scanner.nextInt() - 1);//remove cart�o de cr�dito 02
		System.out.println("Seus produtos selecionados s�o: " + produtos);
		
	}
	}
	
	public String selecionarEndereco(String endereco) {
		System.out.println("Qual endere�o deseja receber?");
			endereco = scanner.nextLine();
		
		return endereco;
	}

}
