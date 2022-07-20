package contas;

public abstract class AbstractContas {

	protected int numConta;
	protected String titular;
	protected double saldo;
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saque nao Realizado");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Saque Realizado");
		}
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
}