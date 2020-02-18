import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtratos {
	public void imprimeExtratoBasico(Contas c) {
		SimpleDateFormat sdf = new SimpleDateFormat(" dd / MM / yyyy HH : mm : ss ");
		Date agora = new Date();
		System.out.println(" DATA : " + sdf.format(agora));
		System.out.println(" SALDO : " + c.getSaldo());
	}
}
