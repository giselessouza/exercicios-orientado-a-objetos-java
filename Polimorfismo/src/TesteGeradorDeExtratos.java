class TestaGeradorDeExtrato {
	public static void main(String[] args) {
		GeradorDeExtratos gerador = new GeradorDeExtratos();
		ContaPoupança cp = new ContaPoupança();
		cp.setSaldo(1000);
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1000);
		gerador.imprimeExtratoBasico(cp);
		gerador.imprimeExtratoBasico(cc);
	}
}