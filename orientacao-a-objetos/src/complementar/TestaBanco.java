package complementar;
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

public class TestaBanco {
	public static void main(String[] args) {
		ContasDoBanco conta1 = new ContasDoBanco ();
		conta1.numero = 10.00;
		conta1.saldo = 10.00;
		conta1.limite = 10.00;	
		
		System.out.println("1 - depositar, 2- sacar ou 3- imprimir extrato?");
		int numero = sc.nextint();
		if (depositar) {
		    System.out.println(“Digite valor”);
		    double depositar = sc.nextDouble ();
		} else if (sacar) {
		    System.out.println(“Digite valor”);
		    double sacar = sc.nextDouble ();
		} else {
		    System.out.println("numero " + conta1.numero + "saldo" + conta1.saldo + "limite" + conta1.limite);
		}
	}
}


