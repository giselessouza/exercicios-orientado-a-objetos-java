
public class TestaAlunoeTurma {
	public void meuMetodo() {
		//criando objetos
		Turma t1 = new Turma ();
		Aluno a1 = new Aluno ();
		//carregando dados
		a1.nome = "blabla";
		t1.Periodo = 3;
		t1 .aluno = a1;
		//ligando os objetos
		a1.turma = t1;
		System.out.println(t1.aluno);
		System.out.println(t1.Periodo);
		
	}



}
