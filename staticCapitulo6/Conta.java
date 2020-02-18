
public class Conta {
	// atributo de classe
	static int contador;

	// ATRIBUTO DE INSTANCIA
	int numero ;
	
	// construtor
	Conta() {
		Conta.contador++;
		this . numero = Conta . contador ;
	}
	
	static void zeraContador () {
		System . out . println ( " Contador : " + Conta . contador ) ;
		System . out . println ( " Zerando o contador de contas ... " ) ;
		Conta . contador = 0;
		}
}
