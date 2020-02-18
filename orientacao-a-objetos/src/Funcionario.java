
public class Funcionario {
String cargo;
double salario;
String nome;
static double valeRefeicaoDiario;

void versalario() {
	System.out.println("salario" + this.salario);
}

void aumentaSalario ( double aumento ) {
this . salario += aumento ;
}

void dadosFuncionario () {
	System.out.println("Nome " + this.nome + "cargo " + this.cargo + "salario " + this.salario);
}

}
