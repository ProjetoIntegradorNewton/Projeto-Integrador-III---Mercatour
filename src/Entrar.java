package mercatour;

public class Entrar extends Conta{

	void validaLogin(String email, String senha) {
		//consulta em banco de dados
	}
	public String onError() {
		//m�todo caso aconte�a erro no login ap�s consulta em banco de dados
		return "Login inv�lido";
	}	
}
