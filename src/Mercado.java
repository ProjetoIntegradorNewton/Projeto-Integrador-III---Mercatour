package mercatour;


public class Mercado extends Conta{

	String nomeMercado;
	int avaliacao;
	static String produtos;
	String logradouro;
	String bairro;
	int numero;
	String estado;
	String pais;
	String cep;
	String enderecoCompletoMercado;
	
	protected String enderecoMercado(String nomeMercado,
			String logradouro, 
			String bairro, 
			int numero, 
			String estado, 
			String pais, 
			String cep) {
		
		nomeMercado = "EPA";
		logradouro = "Av. Flávio Santos";
		bairro = "Floresta";
		numero = 500;
		estado = "Minas gerais";
		pais = "Brasil";
		cep = "31015-150";
		
		enderecoCompletoMercado = "O endereço do mercado " + nomeMercado + " é: " +
				logradouro +", "+
				numero +", "+
				bairro +", "+
				estado +", "+
				cep +", "+
				pais;
				
		return enderecoCompletoMercado;
	}
	
	public int avalicaoMercado(String nomeMercado, int avaliacao) {
		//consultar banco de dados para avaliação do mercado
		for (int i = 0; i < listaMercado.lenght; i++) {
			return mercado.avaliacao;
		}
		
	}
	
	public String[] Produtos(String produtos[]) {
		//consultar banco de dados do mercado os produtos disponíveis e os respectivos id dos produtos
		for (int i = 0; i < listaMercado.lenght; i++) {
			return mercado.produtos;
		}
		
	}
	
}
