package mercatour;
import java.util.Date;

public class Acompanhar extends FinalizarCompra{

	Date time = new Date();
	
	protected String dadosEntregador;
	protected Date estimativaEntrega;
	
	dadosParceiro parceiro = new Conta();
	
	public String contatarEntregador(parceiro) {
		//integração com chamada do celular e envio de mensagem via aplicativos terceiros
		this.dadosEntregador = parceiro;
		
		return parceiro.nome, parceiro.telefone ;
	}
	
	void map() {
		//integração com API de mapa
	}
	
}
