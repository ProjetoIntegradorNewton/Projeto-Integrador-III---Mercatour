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
	double idCompra;

	
	public void idCompraGen(double idCompra) {
		idCompra = random.nextDouble() * 99999999 ; //ir� gerar um n�mero aleat�rio para o id da compra
		
		return idCompra;

	}
	public String formaDePagamento(String formaPagamento) {
		
		System.out.println("Qual forma de pagamento deseja?");
			formaPagamento = scanner.nextLine();
		return formaPagamento;
	}
	public String[] adicionarProdutos(String[] produtos) {
		
		produtos[0] = "Alcool em gel";
		produtos[1] = "Macarr�o";
		produtos[2] = "Feij�o";
		produtos[3] = "Coca cola 2L";
		
		return produtos;

		
	}
	public String[] removerProdutos(String[] produtos) {
		System.out.println("Qual item deseja excluir?");
			int excluir = scanner.nextInt();
		
			excluir = excluir - 1; //Retira 1 do �ndice do item selecionado, no array come�a com 0

			produtos[excluir] = null;
			
		return produtos;
	}
	
	public String selecionarEndereco(String endereco) {
		System.out.println("Qual endere�o deseja receber?");
			endereco = scanner.nextLine();
		
		return endereco;
	}

}
