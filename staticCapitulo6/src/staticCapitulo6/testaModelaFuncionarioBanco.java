package staticCapitulo6;

public class testaModelaFuncionarioBanco {
	public static void main(String[] args) {
		ModelaFuncionarioBanco FuncionarioBanco = new ModelaFuncionarioBanco();
		FuncionarioBanco.valeRefeicaoDiario = 30.50;
		System.out.println("vale refeição sem taxa " + FuncionarioBanco.valeRefeicaoDiario);
		FuncionarioBanco.valeRefeicaoDiario(5);
		System.out.println("vale refeição com taxa " + FuncionarioBanco.valeRefeicaoDiario(5));
		
	}
	

}
