
public class Funcionario {
	private String nome;
	private double salario;
	private String imprimeDados;
	
	public double calculaBonificacao () {
		return this . salario * 0.1;
		}
	public String imprimeDados () {
		return this.nome; //retornar dois atributos de vez
		
	}
	public String getNome() {
		return nome;
	}
	public double getsalario () {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setsalario(double salario) {
		this.salario = salario;
	}
	public String getImprimeDados() {
		return imprimeDados;
	}
	public void setImprimeDados(String imprimeDados) {
		this.imprimeDados = imprimeDados;
	}
	
}
