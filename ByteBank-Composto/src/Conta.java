public class Conta {
	
	//Atributos
	
	private double saldo; // Saldo não deve ser informado e nem alterado.	
	int agencia;
	int conta;
	Cliente titular ;
	
	//Métodos - Ações da classe Conta
	
	//- Depositar
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	//- Sacar
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	//- Transferir
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo>= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
		}	
	
	//Saldo
	
	public double getSaldo() {
		return this.saldo;
	}
		
	}
	
	
