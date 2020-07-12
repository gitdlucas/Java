
public class TesteIR {

	// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de
	// R$ 142
	// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
	// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

	public static void main(String[] args) {
		double salario = 4663;
		double impostoRenda = 0;
		double deduzir;
		double salarioFinal = 0;

		System.out.println("--------------------------------------------");
		System.out.println("   Programa de Cálculo de Desconto de IR ");
		System.out.println("--------------------------------------------");

		if (salario >= 1900.0 && salario <= 2800.0) {
			double deduz = 142.0;
			impostoRenda = ((salario * 0.075) - deduz);
			salarioFinal = (salario - impostoRenda);
			System.out.println("Valor Salário: R$" + salario);
			System.out.println("Desconto de IR: R$" + impostoRenda);
			System.out.println("Valor Salário após IR: R$" + salarioFinal);
		}
		if (salario >= 2800.01 && salario <= 3751.0) {
			double deduz = 350.0;
			impostoRenda = ((salario * 0.15) - deduz);
			salarioFinal = (salario - impostoRenda);
			System.out.println("Valor Salário: R$" + salario);
			System.out.println("Desconto de IR: R$" + impostoRenda);
			System.out.println("Valor Salário após IR: R$" + salarioFinal);

		}
		if (salario >= 3751.01 && salario <= 4664.0) {
			double deduz = 636.0;
			impostoRenda = ((salario * 0.225) - deduz);
			salarioFinal = (salario - impostoRenda);
			System.out.println("Valor Salário: R$" + salario);
			System.out.println("Desconto de IR: R$" + impostoRenda);
			System.out.println("Valor Salário após IR: R$" + salarioFinal);

		}

		System.out.println("--------------------------------------------");

	}

}
