
public class TesteRegistroDePonto {
	public static void main(String[] args) {
		RegistroDePonto testaRegistro = new RegistroDePonto();

		Gerentes gerente = new Gerentes ();
		
		gerente.RegistraEntrada(10.0);
		gerente.RegistraSaida(22.30);
		
		System.out.println("o gerente chegou as " + gerente.getEntrada()+ "H");
		System.out.println("o gerente saiu as " + gerente.getSaida()+ "H");
		
		Telefonistas telefonista = new Telefonistas ();
		
		telefonista.RegistraEntrada(8.40);
		telefonista.RegistraSaida(19.50);
		
		System.out.println("a telefonista entrou as "+ telefonista.getEntrada()+ "H");
		System.out.println("a telefonista saiu as " + telefonista.getSaida() + "H");
		
	}
}
