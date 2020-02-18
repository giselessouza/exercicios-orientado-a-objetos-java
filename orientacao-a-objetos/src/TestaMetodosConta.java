
public class TestaMetodosConta {
public static void main(String[] args) {
	Agencia a = new Agencia (1234) ;
	Conta c = new Conta ( a ) ;
	c.deposita(5);
	c.saca(10);
	double saldoDisponivel = c .ConsultaSaldoDisponivel() ;
	System.out.println("saldo dispo " + saldoDisponivel);
	
}
}
