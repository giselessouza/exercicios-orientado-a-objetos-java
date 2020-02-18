
public class TestaConta {
	public static void main ( String [] args ) {
		Conta c1 = new Conta () ;
		c1 . setNumero(1234);
		c1 . setSaldo(1000);
		c1 . setLimite(500);
		Conta destino = new Conta () ;
		c1.transfere(c1, 150);
		Conta c2 = new Conta () ;
		c2 .setNumero(215); 
		c2 . setSaldo(142);
		c2 . setLimite(8000);
		System . out . println ( c1 . getNumero() ) ;
		System . out . println ( c1 . getsaldo() ) ;
		System . out . println ( c1 . getlimite() ) ;
		System . out . println ( c2 . getNumero() ) ;
		System . out . println ( c2 . getsaldo() ) ;
		System . out . println ( c2 . getlimite() ) ;
		}
}
