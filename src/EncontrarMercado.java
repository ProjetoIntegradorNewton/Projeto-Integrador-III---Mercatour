package mercatour;
import java.util.ArrayList;
import java.util.Scanner;

public class EncontrarMercado extends Mercado{

	String listaMercados[];
	String melhorAvaliado;
	
	Mercado mercado = new Mercado();
	Scanner scanner = new Scanner(System.in);

	
	public void buscarMercado() {
		System.out.println("Qual Mercado deseja buscar?");
			String procMercado = scanner.nextLine();
		
			System.out.println(procMercado);
	}
	
	public String maisProcurado(String nomeMercado){
		//consulta mais procurado no banco de dados, counter de procura
		return nomeMercado;
	}
	public String melhorAval(String nomeMercado[], int avaliacao[]) {
		//consulta melhor avaliado no banco de dados
		for (int i = 0; i < listaMercados.length; i++) {
			if (avaliacao[i] > avaliacao[i-1]) {
				melhorAvaliado = nomeMercado[i];
			}
		}
		return melhorAvaliado;
		
	}
	@SuppressWarnings("static-access")
	
	
	public ArrayList<String> getProdutos() {
		
		return mercado.produtos;
	}
	public String ultimaCompra(String nomeMercado) {
		
		return ultimaCompra(mercado.nomeMercado);
	}
}
