package complementar;

public class TestaFuncionario {
	
public static void main(String[] args) {
	FuncionariosBanco funcionario1 = new FuncionariosBanco ();
	funcionario1 .nome = "dd";
	funcionario1.Salario = 10.30;
	System.out.println("nome "+funcionario1.nome);
	funcionario1 .nome = "dd'1";
	System.out.println("nome alterado "+funcionario1.nome);
	System.out.println(funcionario1.Salario);

	
}
}
