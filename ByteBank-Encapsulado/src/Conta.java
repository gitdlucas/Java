
public class Conta {

	// Atributos

	private double saldo; // Saldo não deve ser informado e nem alterado.
	private int agencia;
	private int conta;
	private Cliente titular;
	private static int total;

	// Construtor
	public Conta(int agencia, int conta) {
		Conta.total++;
		//System.out.println("O Total de contas criadas é " + Conta.total);
		this.agencia = agencia;
		this.conta = conta;
		System.out.println("Construtor está criando uma nova agencia - " + this.agencia + " e conta - " + this.conta);
	}

	// Métodos - Ações da classe Conta

	// - Depositar
	void deposita(double valor) {
		this.saldo += valor;
	}

	// - Sacar
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// - Transferir
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// Saldo com getter

	public double getSaldo() {
		return this.saldo;
	}

	// Getter
	public int getConta() {
		return this.conta;
	}

	// Setter
	public void setConta(int conta) {
		if (conta <= 0) {
			System.out.println("Não são aceitos valores negativos!");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não são aceitos valores negativos!");
		}

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
