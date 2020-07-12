
public class TestaBanco {

	public static void main(String[] args) {
		//Primeiro cliente
		Cliente A000000001 = new Cliente();
		A000000001.nome = ("Daniel Lucas dos Santos");
		A000000001.cpf = ("65085159004");
		A000000001.profissao = ("Analista de Testes");
		
		//Primeira Conta
		Conta contaB000000001 = new Conta();
		
		//Associa cliente x conta
		contaB000000001.titular = A000000001;
		
		System.out.println(contaB000000001.titular);
		System.out.println(contaB000000001.titular.nome);
		System.out.println(contaB000000001.titular.cpf);
		System.out.println(contaB000000001.titular.profissao);
		
		System.out.println("----------------------------------------------------------");
		//Segunda Conta
		Conta contaB000000002 = new Conta();
		contaB000000002.titular = new Cliente();
		contaB000000002.titular.nome = "Luciana Zandonai";
		System.out.println(contaB000000002.titular.nome);
		
		
		
		
		
	}
}
