
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;

		System.out.println("A primeira conta tem saldo = " + primeiraConta.saldo);
		System.out.println("A segunda conta tem saldo = " + segundaConta.saldo);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("-------- O que � refer�ncia");
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("--- Endere�o de m�moria do objeto 'primeiraConta' " + primeiraConta);
		System.out.println("--- Endere�o de m�moria do objeto 'segundaaConta' " + segundaConta);

	}

}
