package staticCapitulo6;

public class ModelaFuncionarioBanco {
	 /*
			 * 1 Crie uma classe para modelar os funcionários do banco. Defina nessa classe
			 * um atributo para armazenar o valor do vale refeição diário pago aos
			 * funcionários. 2 Faça um teste para verificar o funcionamento do vale
			 * refeição. 3 Defina um método para reajustar o vale refeição diário a partir
			 * de uma taxa. 4 Faça um teste para verificar o funcionamento do reajuste do
			 * vale refeição.
			 */
	double valeRefeicaoDiario = 20.50;

	public double valeRefeicaoDiario(double taxa) {
		return valeRefeicaoDiario -= taxa;
		/*
		 * O método reajustaValeRefeicaoDiario() é de instância. Consequentemente, ele
		 * deve ser chamado a partir da referência de um objeto da classe Funcionario .
		 * Um método de classe deve ser chamado através do nome da classe na qual ele
		 * foi definido. 1 Funcionario . reajustaValeRefeicaoDiario (0.1) ; Código Java
		 * 6.8: Chamando um método de classe Podemos chamar um método de classe através
		 * de uma referência de um objeto da classe na qual o método foi definido.
		 * Contudo, não seria a maneira conceitualmente correta já que o método pertence
		 * a classe e não ao objeto. 1 2 3 Funcionario f = new Funcionario () ; //
		 * Válido , mas conceitualmente incorreto f . reajustaValeRefeicaoDiario (0.1) ;
		 * Resumindo, instanciar pelo nome da classe, não pela variavel de instaciacao criada (em alguns casos)
		 */
	}
}
