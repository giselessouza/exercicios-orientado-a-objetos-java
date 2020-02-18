
public class TestaGerente {
public static void main(String[] args) {
	Gerente g = new Gerente ();
	g.salario = 1000;
	System.out.println("salario " + g.salario);
	System.out.println("aumentando o salario em 10% ");
	g.aumentaSalario();
	System.out.println("salario " + g.salario);
	System.out.println("aumentando o salario em 30%");
	g.aumentaSalario(0.3);
	System.out.println("salario " + g.salario);
}
}
