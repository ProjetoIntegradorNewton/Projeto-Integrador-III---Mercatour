package mercatour;
import java.util.Date;

public class Acompanhar extends FinalizarCompra{

	Date time = new Date();
	
	protected String dadosEntregador;
	protected Date estimativaEntrega;
	
	Conta parceiro = new Conta();
	
	public String contatarEntregador(String dadosEntregador) {
		//integra��o com chamada do celular e envio de mensagem via aplicativos terceiros
		this.dadosEntregador = dadosEntregador;
		
		return dadosEntregador ;
	}
	
	void map() {
		//integra��o com API de mapa
	}
	
}
