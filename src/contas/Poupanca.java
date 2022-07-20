package contas;

public class Poupanca extends AbstractContas {

	public Poupanca() {

	}

	public Poupanca(String nome, int numero) {
		setTitular(nome);
		setNumConta(numero);
	}

	public void resgatar(double valor, ContaCorrente destino) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor); 
			destino.depositar(valor);

		} else {
			System.out.println("saldo insuficiente: Saldo atual: " + getSaldo());
		}
	}

	
	public void mostrarSaldo() {
		System.out.println("Saldo atual da Poupan�a: " + getSaldo());
	}

	
	public void dadosDaConta() {
		System.out.println("+-------------------------------+");
		System.out.println("| Titular Poupan�a: " + this.getTitular());
		System.out.println("| Numero da Conta Poupan�a: " + this.getNumConta() + "-1");
		System.out.println("| Saldo atual: " + this.getSaldo());
		System.out.println("+-------------------------------+\n");
	}

	
	
}