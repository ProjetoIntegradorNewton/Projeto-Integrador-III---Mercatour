package mercatour;

public class Entrar extends Conta{

	void validaLogin(String email, String senha) {
		//consulta em banco de dados
	}
	public String onError() {
		//método caso aconteça erro no login após consulta em banco de dados
		return "Login inválido";
	}	
}
