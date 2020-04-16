class Conta { 
	String titular;
	int numero;
	int agencia;
	double saldo;
	
	void deposita(double valor) {
		//this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	boolean saca(double valor) {
		if(this.saldo >= valor) {
			//this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	boolean transfere(double valor, Conta conta) {
		if(!this.saca(valor)) {	return false; }
		conta.deposita(valor);
		return true;	
	}
}