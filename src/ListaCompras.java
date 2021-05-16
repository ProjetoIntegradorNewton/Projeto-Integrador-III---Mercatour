package mercatour;
import java.util.Random;
import java.time.LocalDate;

public class ListaCompras extends Mercado{
	String[] nomeProduto;
	int quantidadeProduto[];
	String mercado;
	protected String idProduto[];
	protected double idListaCompra;
	protected String finalCompra;
	
	public void finalizarCompra(String nomeProduo[],
			int quantidadeProduto[],
			String mercado,
			String idProduto,
			double idListaCompra,
			String finalCompra) {
		
		Random random = new Random();
		
		mercado = "EPA";
		nomeProduto[1] = "Detergente";
		quantidadeProduto[1] = 1;
		nomeProduto[2] = "Bolinho Ana Maria";
		quantidadeProduto[2] = 5;
		idProduto = Mercado.produtos.idProduto;
		idListaCompra = random.nextDouble() * 99999999 ; //irá gerar um número aleatório para o id da lista de compras
		LocalDate dataCompra = LocalDate.now();
		
		finalCompra = mercado +
				nomeProduto[1] +
				quantidadeProduto[1] +
				idProduto + nomeProduto[2] +
				quantidadeProduto[2] +
				idProduto +
				idListaCompra+
				dataCompra;
		
	}
	
	public void cancelarCompra(String nomeProduo[],
			int quantidadeProduto[],
			String mercado,
			String idProduto,
			double idListaCompra,
			String finalCompra) {
		
		finalCompra = null;
	}
	
}
