
public class TestaFuncionario {
public static void main(String[] args) {
	Funcionario f = new Funcionario();
f.dadosFuncionario();
Funcionario.valeRefeicaoDiario = 15; //Um atributo de classe deve ser acessado através do nome da classe na qual ele foi definido.
/*
 * Podemos acessar um atributo de classe através de uma referência de um objeto da classe na
qual o atributo foi definido. Contudo, não seria a maneira conceitualmente correta já que o atributo
pertence a classe e não ao objeto.
Funcionario f = new Funcionario () ;
// Válido , mas conceitualmente incorreto
f . valeRefeicaoDiario = 15;
 */
}
}
