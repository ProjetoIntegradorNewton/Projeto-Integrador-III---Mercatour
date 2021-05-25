package mercatour;

public class LogarFacebook extends Conta{
		
	String email;
	String telefone;
	protected String senha;
	
	void validaLogin (String email, String senha) {
		// método de validação com o facebook, integração com banco de dados
		this.senha = senha;
	}
	
	void esqueceuConta(String email , String telefone) {
		// método de validação com o facebook, integração com banco de dados
	}
	
	void criarConta() {
		//integração com o facebook para criação de conta
	}
	
}
