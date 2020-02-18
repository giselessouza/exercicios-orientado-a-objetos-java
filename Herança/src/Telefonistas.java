
public class Telefonistas extends Funcionario {
	private int estacaoDeTrabalho;
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
	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public void setsalario(double salario) {
		// TODO Auto-generated method stub
		super.setsalario(salario);
	}
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
}
