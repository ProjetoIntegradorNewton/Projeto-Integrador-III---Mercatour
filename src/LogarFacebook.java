package mercatour;

public class LogarFacebook extends Conta{
		
	String email;
	String telefone;
	protected String senha;
	
	void validaLogin (String email, String senha) {
		// m�todo de valida��o com o facebook, integra��o com banco de dados
		this.senha = senha;
	}
	
	void esqueceuConta(String email , String telefone) {
		// m�todo de valida��o com o facebook, integra��o com banco de dados
	}
	
	void criarConta() {
		//integra��o com o facebook para cria��o de conta
	}
	
}
