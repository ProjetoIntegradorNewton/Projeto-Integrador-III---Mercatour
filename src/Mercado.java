package mercatour;
import java.util.*;

public class Mercado extends Conta{

	String nomeMercado;
	int avaliacao;
	String logradouro;
	String bairro;
	int numero;
	String estado;
	String pais;
	String cep;
	String enderecoCompletoMercado;
	
	protected double idProduto;
	protected ArrayList<String> produtos = new ArrayList<String>();
	
	protected String enderecoMercado(String nomeMercado,
			String logradouro, 
			String bairro, 
			int numero, 
			String estado, 
			String pais, 
			String cep) {
		
		nomeMercado = "EPA";
		logradouro = "Av. Fl�vio Santos";
		bairro = "Floresta";
		numero = 500;
		estado = "Minas gerais";
		pais = "Brasil";
		cep = "31015-150";
		
		enderecoCompletoMercado = "O endere�o do mercado " + nomeMercado + " �: " +
				logradouro +", "+
				numero +", "+
				bairro +", "+
				estado +", "+
				cep +", "+
				pais;
				
		return enderecoCompletoMercado;
	}
	
	public int avalicaoMercado(String nomeMercado, int avaliacao) {
		//consultar banco de dados para avalia��o do mercado
		return avaliacao;
		
	}
	
	public String[] Produtos(String produtos[]) {
		//consultar banco de dados do mercado os produtos dispon�veis e os respectivos id dos produtos
		
		return produtos;
	}
	
	public void setIdProduto() {
		Random random = new Random();
		for (int i = 0; i < produtos.size(); i++) {
			idProduto = random.nextDouble() * 99999999;
		}
	}
	
	public double getIdProduto() {
		return idProduto;
	}
}
