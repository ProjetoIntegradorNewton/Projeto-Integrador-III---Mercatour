package mercatour;
import java.util.Date;

public class Acompanhar extends FinalizarCompra{

	Date time = new Date();
	
	protected String dadosEntregador;
	protected Date estimativaEntrega;
	
	public String contatarEntregador(String dadosEntregador) {
		//integração com chamada do celular e envio de mensagem via aplicativos terceiros
		
		return dadosEntregador;
	}
	
	void map() {
		//integração com API de mapa
	}
	
}
