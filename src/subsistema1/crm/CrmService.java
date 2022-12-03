package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarClinte(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no CRM.");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}

}
