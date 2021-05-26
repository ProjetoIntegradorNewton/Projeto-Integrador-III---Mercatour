package mercatour;

import java.util.ArrayList;

public class PesquisarProduto extends EncontrarMercado{

	public String nomeProduto[];
	protected String idProduto;
	public String maisBarato;
	public String prodMelhorAvaliado;
	
	Mercado mercado = new Mercado();
	
	public String procurarProduto(String produto) {
		return produto;
	}
	
	public String maisBarato() {
		for ( int i = 0; i < listaMercados.length; i++) {
			if(nomeProduto[i].preco < nomeProduto[i+1].preco) {
				maisBarato = nomeProduto[i];
			}//implementar preço do produto no cadastro do produto no banco de dados
		}
		return maisBarato;
	}
	public String prodMelhorAval() {
		for (int i = 0; i < produtos.length(); i++) {
			if (nomeProduto.avaliacao[i] > nomeProduto.avaliacao[i-1]) {
				prodMelhorAvaliado = nomeProduto[i];
			}//implementar avaliação do produto no cadastro do produto no banco de dados
		}
		return melhorAvaliado;
	}
	

}
