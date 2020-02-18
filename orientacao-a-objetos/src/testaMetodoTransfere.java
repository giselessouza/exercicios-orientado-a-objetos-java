
public class testaMetodoTransfere {
	public static void main(String[] args) {
		Agencia agencia1 = new Agencia (1);
		Conta conta1 = new Conta ( agencia1 ) ;
		conta1 . saldo = 1000;
		Conta destino = new Conta ( agencia1 ) ;
		destino . saldo = 1000;
		conta1.transfere(destino, 500);
		System.out.println(conta1.saldo);
		System.out.println(destino.saldo);
	}
}
