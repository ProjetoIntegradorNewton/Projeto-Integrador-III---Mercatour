package mercatour;

public class EncontrarMercado extends Mercado{

	String listaMercados[];
	int avaliacao[];
	String melhorAvaliado;
	
	public String maisProcurado(String nomeMercado){
		//consulta mais procurado no banco de dados, counter de procura
		return nomeMercado;
	}
	public String melhorAval(String nomeMercado[], int avaliacao[]) {
		for (int i = 0; i < listaMercados.length; i++) {
			if (avaliacao[i] > avaliacao[i-1]) {
				melhorAvaliado = nomeMercado[i];
			}
		}
		return melhorAvaliado;
		
	}
	public String getProdutos(String nomeMercado, String produtos) {
		
		return Mercado.produtos;
	}
	public String ultimaCompra(String nomeMercado) {
		
		return ultimaCompra(nomeMercado);
	}
}
