package mercatour;

public class Atendimento {
	
	String email;
	
	public void chatBot() {
		//implementa��o com bot de chat
	}
	public void enviarEmail(String email) {
		//implementa��o com provedor de email
	}
	public void contatos() {
		
		System.out.println("Nossos contatos s�o:"
				+ "Telefone: (31)99999-9999"
				+ "Email: contato@mercatour.com.br"
				+ "Chat com atendente");
	}
	public void faq() {
		System.out.println("Pergunta 1");
		System.out.println("Resposta pergunta 1");
		System.out.println("Pergunta 2");
		System.out.println("Resposta pergunta 2");
		System.out.println("Pergunta 3");
		System.out.println("Resposta pergunta 3");
	}
}
