
public class TestaValores {

	public static void main(String[] args) {
		Conta conta1 = new Conta(5263,696963);
		Conta conta2 = new Conta(5263,696964);
		Conta conta3 = new Conta(5263,696965);
		
		System.out.println(Conta.getTotal());
		//conta.setAgencia(-50);
		//conta.setConta(-220);
	}
}
