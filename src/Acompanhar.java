package mercatour;
import java.util.Date;

public class Acompanhar extends FinalizarCompra{

	Date time = new Date();
	
	protected String dadosEntregador;
	protected Date estimativaEntrega;
	
	dadosParceiro parceiro = new Conta();
	
	public String contatarEntregador(parceiro) {
		//integra��o com chamada do celular e envio de mensagem via aplicativos terceiros
		this.dadosEntregador = parceiro;
		
		return parceiro.nome, parceiro.telefone ;
	}
	
	void map() {
		//integra��o com API de mapa
	}
	
}
