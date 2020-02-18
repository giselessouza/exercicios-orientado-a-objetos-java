
public class TestaContaeAgencia {
	public static void main ( String [] args ) {
		// Criando alguns objetos
		Agencia agencia1 = new Agencia (1234) ;
		Conta conta1 = new Conta (agencia1) ;
		// Carregando alguns dados
		agencia1 . numero = 178;
		conta1 . saldo = 1000.0;
		// Ligando os objetos
		conta1. agencia = agencia1 ;
		System . out . println ( conta1 . agencia . numero ) ;
		System . out . println ( conta1 . saldo ) ;
		}
}
