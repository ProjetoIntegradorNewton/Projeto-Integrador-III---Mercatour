package mercatour;


public class Main {
	
	public static void main(String[] args) {
	
		//TESTE DA CLASSE CADASTRAR

		Conta conta = new Conta();
		Endereco endereco = new Endereco();
		
		conta.cadastrar();
		endereco.endereco();
		
		System.out.println("Seu nome é: " + conta.nome);
		System.out.println("Seu E-mail é: " + conta.email);
		System.out.println("Seu telefone é: " + conta.telefone);
		System.out.println(
				"Seu endereço é: " + endereco.logradouro +"\n" 
				+ "bairro: " + endereco.bairro +"\n"
				+"número: " +endereco.numero+"\n"
				+"estado: "+ endereco.estado+"\n"
				+"país: "+ endereco.pais);
		System.out.println("Seu id de usuário é: " + conta.idUsuario);
	
		
		//TESTE DA CLASSE ENCONTRAR MERCADO
		
		EncontrarMercado encontrarMercado = new EncontrarMercado();
		
		encontrarMercado.buscarMercado();
		
		
		//TESTE DA CLASSE CONFIGURAR
		
		Configurar configurar = new Configurar();
		
		//MÉTODO DEPÓSITO
		configurar.depositar(1000); //recebe o saldo atual
		
		//MÉTODO ESCOLHER FAVORITOS
		configurar.escolherFavoritos();
		System.out.println(configurar.favoritos);
		
		configurar.adicionarFormaPagamento();
		System.out.println("Suas formas de pagamento cadastradas são: " + configurar.formaPagamento);
		
		configurar.removerFormaPagamento();
		
		//TESTE DA CLASSE FINALIZAR COMPRA
		
		FinalizarCompra finalizarCompra = new FinalizarCompra();
		
		finalizarCompra.adicionarProdutos();
		
		finalizarCompra.removerProdutos();
		
	
	
	}
}
