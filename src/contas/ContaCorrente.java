package contas;

public class ContaCorrente extends AbstractContas {

	public ContaCorrente() {

	}

	public ContaCorrente(String nome, int numero, double saldoInicial) {
		this.titular = nome;
		this.numConta = numero;
		depositar(saldoInicial);
	}

	public ContaCorrente(String nome, int numero) {
		this.numConta = numero;
		this.titular = nome;
	}

	public void dadosDaConta() {
		System.out.println("+-------------------------------+");
		System.out.println("|          DADOS DA CONTA        ");
		System.out.println("| Titular Conta Corrente: " + this.getTitular());
		System.out.println("| Numero da Conta: " + this.getNumConta());
		System.out.println("| Saldo atual: " + this.getSaldo());
		System.out.println("+-------------------------------+");
	}

	public void mostrarSaldo() {
		System.out.printf("Saldo Atual Conta Corrente: %.2f\n", this.getSaldo());

	}

	public void aplicar(double valor, Poupanca destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
		}

	}

}	
