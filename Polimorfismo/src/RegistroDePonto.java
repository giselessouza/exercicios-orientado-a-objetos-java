
public class RegistroDePonto {
	private double entrada;
	private double saida;

	public void RegistraEntrada(double entrada) {
		this.setEntrada(this.getEntrada() + entrada);
	}
	public void RegistraSaida (double saida) {
		this.setSaida(this.getSaida() + saida);
	}
	public double getSaida() {
		return saida;
	}
	public void setSaida(double saida) {
		this.saida = saida;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
}
