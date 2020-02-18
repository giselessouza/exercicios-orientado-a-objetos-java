
public class TestaValoresPadrao {
	public static void main ( String [] args ) {
		Agencia a = new Agencia (11);
		Conta c = new Conta (a) ; //atribuir parametro a nova instanciacao
		System . out . println ( c . numero ) ;
		System . out . println ( c . saldo ) ;
		System . out . println ( c . limite ) ;
		}
}
