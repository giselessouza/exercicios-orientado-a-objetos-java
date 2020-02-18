
public class Gerentes extends Funcionario {
	private int nomeDeUsuario;
	private int senha;
	
	public double calculaBonificacao () {
		return this . getsalario () * 0.6 + 100;
		}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public double getsalario() {
		// TODO Auto-generated method stub
		return super.getsalario();
	}
	public int getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public int getSenha() {
		return senha;
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public void setsalario(double salario) {
		// TODO Auto-generated method stub
		this.setsalario(salario);
	}
	public void setNomeDeUsuario(int nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
