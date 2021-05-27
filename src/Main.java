package mercatour;


public class Main {
	
	public static void main(String[] args) {
	
		//TESTE DA CLASSE CADASTRAR

		Conta conta = new Conta();
		Endereco endereco = new Endereco();
		
		conta.cadastrar();
		endereco.endereco();
		
		System.out.println("Seu nome �: " + conta.nome);
		System.out.println("Seu E-mail �: " + conta.email);
		System.out.println("Seu telefone �: " + conta.telefone);
		System.out.println(
				"Seu endere�o �: " + endereco.logradouro +"\n" 
				+ "bairro: " + endereco.bairro +"\n"
				+"n�mero: " +endereco.numero+"\n"
				+"estado: "+ endereco.estado+"\n"
				+"pa�s: "+ endereco.pais);
		System.out.println("Seu id de usu�rio �: " + conta.idUsuario);
	
		
		//TESTE DA CLASSE ENCONTRAR MERCADO
		
		EncontrarMercado encontrarMercado = new EncontrarMercado();
		
		encontrarMercado.buscarMercado();
		
		
		//TESTE DA CLASSE CONFIGURAR
		
		Configurar configurar = new Configurar();
		
		//M�TODO DEP�SITO
		configurar.depositar(1000); //recebe o saldo atual
		
		//M�TODO ESCOLHER FAVORITOS
		configurar.escolherFavoritos();
		System.out.println(configurar.favoritos);
		
		configurar.adicionarFormaPagamento();
		System.out.println("Suas formas de pagamento cadastradas s�o: " + configurar.formaPagamento);
		
		configurar.removerFormaPagamento();
		
		//TESTE DA CLASSE FINALIZAR COMPRA
		
		FinalizarCompra finalizarCompra = new FinalizarCompra();
		
		finalizarCompra.adicionarProdutos();
		
		finalizarCompra.removerProdutos();
		
	
	
	}
}
