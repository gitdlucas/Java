
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoDaniel = new Conta();
		
		contaDoDaniel.titular = ("Daniel Lucas dos Santos");

		System.out.println("--------------------------------------------------------");
		System.out.println("	 E X T R A T O   D A   C O N T A ");
		System.out.println(" ");
		System.out.println("      Correntista : "+ contaDoDaniel.titular);
		System.out.println("--------------------------------------------------------");
		System.out.println("- Saldo inicial         - " + contaDoDaniel.saldo);
		// Inicializo a conta com o valor de 100,00
		contaDoDaniel.saldo = 100;

		System.out.println("- Abertura da Conta  	- " + contaDoDaniel.saldo);

		// Deposito 50,00 com o m�todo
		contaDoDaniel.deposita(50);
		System.out.println("- Dep�sito  		- " + contaDoDaniel.saldo);

		// saco 20,00 com o m�todo
		contaDoDaniel.saca(20);
		System.out.println("- Saque     		- " + contaDoDaniel.saldo);

		// Outra conta para testes
		Conta contaDaLuciana = new Conta();
		contaDaLuciana.deposita(1000);
		// Transefere 300
		if (contaDaLuciana.transfere(300, contaDoDaniel)) {
			System.out.println("- Recebe Transfer�ncia  ");
		} else {
			System.out.println("- N�o efetivado - Falta de Fundos ");
		}

		System.out.println("- Saldo                 - " + contaDoDaniel.saldo);
		System.out.println("--------------------------------------------------------");

	}

}
