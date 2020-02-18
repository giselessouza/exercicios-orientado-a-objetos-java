
public class Conta {
	private int numero;
	private double saldo;
	private double limite = 20;
	private Agencia agencia;
	
	public int getNumero() {
		return numero;
	}
	public double getsaldo() {
		return saldo;
	}
	public double getlimite() {
		return limite;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	Conta() {
		// TODO Auto-generated constructor stub
	}
	
	Conta ( Agencia agencia ) {
		this . agencia = agencia ;
		} //construtor

	private void deposita(double valor) {
		this.saldo += valor;	//this = para acessar os atributos (variaveis)do objeto (conta) q esta processando o metodo (comportamento)	
	}
	public double getdeposita (double valor) {
		return this.saldo +=valor;
	}
	
	private void saca (double valor) {
		this.saldo -= valor;
	}
	private void imprimeExtrato () {
		System.out.println("saldo = " + this.saldo);
		
	}
	private double ConsultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	void transfere ( Conta destino , double valor ) {
		this . saldo -= valor ;
		destino . saldo += valor ;
		}
	
}