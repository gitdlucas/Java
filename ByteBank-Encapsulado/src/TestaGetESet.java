
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta contaDaBella = new Conta(125,35632);
		
		//Não se pode mais
		//contaDaBella.conta = 158696;
		
		//Deve-se usar o Set - Para Alterar
		contaDaBella.setConta(158696);
		
		//Deve-se usar o Get - Para exibir
		System.out.println(contaDaBella.getConta());
		
		Cliente clienteBella = new Cliente();
		clienteBella.setNome("Isabel Zandonai");
		System.out.println(clienteBella.getNome());
		
		contaDaBella.setTitular(clienteBella);
	}

}
