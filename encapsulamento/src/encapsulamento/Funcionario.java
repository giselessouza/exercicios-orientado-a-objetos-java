package encapsulamento;
/*
 * os nomes dos métodos que permitem a consulta das propriedades de
um objeto devem possuir o prefixo get. Analogamente, os nomes dos métodos que permitem a alte-
ração das propriedades de um objeto devem possuir o prefixo set.
Aplicando a ideia do encapsulamento, os atributos deveriam ser todos privados. Consequente-
mente, os atributos não podem ser acessados ou modificados por código escrito fora da classe na
qual eles foram definidos.
 */

public class Funcionario {
	private double salario;
	private String nome;
	public String getNome() {
		return nome;
	}public double getSalario() {
		return salario;
	}public void setNome(String nome) {
		this.nome = nome;
	}public void setSalario(double salario) {
		this.salario = salario;
	}
}
	