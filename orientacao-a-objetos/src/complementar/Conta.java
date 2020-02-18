package complementar;

public class Conta {
	int numero;
	double saldo;
	double limite = 20;
	Agencia agencia;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	Conta ( Agencia agencia ) {
		this . agencia = agencia ;
		} //construtor

	void deposita(double valor) {
		this.saldo += valor;	//this = para acessar os atributos (variaveis)do objeto (conta) q esta processando o metodo (comportamento)	
	}
	void saca (double valor) {
		this.saldo -= valor;
	}
	void imprimeExtrato () {
		System.out.println("saldo = " + this.saldo);
		
	}
	double ConsultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	void transfere ( Conta destino , double valor ) {
		this . saldo -= valor ;
		destino . saldo += valor ;
		}
}