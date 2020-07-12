
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario dlucas = new Funcionario();
		dlucas.setNome("Daniel Lucas dos Santos");
		dlucas.setCpf("65085159004");
		dlucas.setSalario(10500.70);
		
		System.out.println(dlucas.getNome());
		System.out.println(dlucas.getBonificacao());
	}
	

}
