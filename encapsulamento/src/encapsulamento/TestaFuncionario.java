package encapsulamento;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("blabl");
		funcionario1.setSalario(1200);
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
	}

}
