
public class CriaContaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta);
		
		//Conta segundaConta = new Conta();
		//segundaConta.saldo = 350;
		//System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.conta);
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.titular);

		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta);

		System.out.println(segundaConta.saldo);
		
		
		
	}

}
