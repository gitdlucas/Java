
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta contaDoBernardo = new Conta();
		contaDoBernardo.deposita(100);
		System.out.println(contaDoBernardo.saca(200));
		
		//Proibido !!!
		//contaDoBernardo.saldo = contaDoBernardo.saldo - 101;
		//System.out.println(contaDoBernardo.saldo);
		
		System.out.println(contaDoBernardo.getSaldo());

	}

}
