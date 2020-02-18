
public class Secretarios extends Funcionario {
	private int ramal;
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
public int getRamal() {
	return ramal;
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
public void setRamal(int ramal) {
	this.ramal = ramal;
}
}
