package mercatour;

public class EncontrarMercado extends Mercado{

	String listaMercados[];
	String melhorAvaliado;
	
	Mercado mercado = new Mercado();
	
	public String maisProcurado(String nomeMercado){
		//consulta mais procurado no banco de dados, counter de procura
		return nomeMercado;
	}
	public String melhorAval(String nomeMercado[], int avaliacao) {
		
		
		for (int i = 0; i < listaMercados.length; i++) {
			if (mercado[i].avaliacao > mercado[i-1].avaliacao) {
				melhorAvaliado = mercado.nomeMercado[i];
			}
		}
		return melhorAvaliado;
		
	}
	public String getProdutos(String nomeMercado, String produtos) {
		
		return mercado.produtos;
	}
	public String ultimaCompra(String nomeMercado) {
		
		return ultimaCompra(mercado.nomeMercado);
	}
}
