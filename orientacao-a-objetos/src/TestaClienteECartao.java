
public class TestaClienteECartao {
	public static void main ( String [] args ) {
		// Criando alguns objetos
		Cliente cliente = new Cliente () ;
		CartaoDeCredito cartaodecredito = new CartaoDeCredito (111111) ;
		// Carregando alguns dados
		cliente . nome = " Rafael Cosentino " ;
		cartaodecredito . numero = 111111;
		// Ligando os objetos
		cartaodecredito . cliente = cliente ;
		System . out . println ( cartaodecredito . numero ) ;
		System . out . println ( cartaodecredito . cliente . nome ) ;
		}
}
