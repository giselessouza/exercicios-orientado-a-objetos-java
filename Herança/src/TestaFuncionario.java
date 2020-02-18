
public class TestaFuncionario {
public static void main(String[] args) {
	Gerentes g = new Gerentes();
	g.setNome("joao");
	g.setNomeDeUsuario(1);
	g.setsalario(258);
	g.setSenha(12);
	
	Telefonistas t = new Telefonistas ();
	t.setEstacaoDeTrabalho(52);
	t.setNome("ana");
	t.setsalario(8750);
	
	Secretarios s = new Secretarios();
	s.setNome("ze");
	s.setRamal(12);
	s.setsalario(690);
	
	System . out . println ( " GERENTE " ) ;
	System . out . println ( " Nome : " + g . getNome () ) ;
	System . out . println ( " Salário : " + g . getsalario () ) ;
	System . out . println ( " Usuário : " + g . getNomeDeUsuario () ) ;
	System . out . println ( " Senha : " + g . getSenha() ) ;
	System . out . println ( " Bonificação : " + t . calculaBonificacao () ) ;
	System . out . println ( " TELEFONISTA " ) ;
	System . out . println ( " Nome : " + t . getNome () ) ;
	System . out . println ( " Salário : " + t . getsalario () ) ;
	System . out . println ( " Estacao de trabalho : " + t . getEstacaoDeTrabalho () ) ;
	System . out . println ( " Bonificação : " + t . calculaBonificacao () ) ;
	System . out . println ( " SECRETARIA " ) ;
	System . out . println ( " Nome : " + s . getNome () ) ;
	System . out . println ( " Salário : " + s . getsalario () ) ;
	System . out . println ( " Ramal : " + s . getRamal () ) ;
	System . out . println ( " Bonificação : " + t . calculaBonificacao () ) ;
	System . out . println ( " dados : " + s . getImprimeDados() ) ;

}
}
