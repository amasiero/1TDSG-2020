public class Conta {
	private Cliente titular;
	private int numero;
	private int agencia;
	private double saldo;

	public void deposita(double valor) {
		if (this.valorValido(valor)) {
			// this.saldo = this.saldo + valor;
			this.saldo += valor;
		}
	}

	public boolean saca(double valor) {
		if (this.saldoDisponivel(valor) && this.valorValido(valor)) {
			// this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta conta) {
		if (!this.saca(valor)) {
			return false;
		}
		conta.deposita(valor);
		return true;
	}

	private boolean saldoDisponivel(double valor) {
		return this.saldo >= valor;
	}

	private boolean valorValido(double valor) {
		return valor > 0;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

}