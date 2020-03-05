class ContaCorrente {
    int agencia;
    int numero;
    double saldo;
    Pessoa cliente;

    double deposita(double valor) {
        double saldoAtual = saldo + valor;
        saldo = saldoAtual;
        // Outras maneiras de implementacao
        // saldo = saldo + valor;
        // saldo += valor;
        return saldo;
    }

    double saca(double valor) {
        double saldoAtual = saldo - valor;
        saldo = saldoAtual;
        return saldo;
    }

    void exibeSaldo() {
        System.out.printf("Seu saldo eh R$ %d", saldo);
    }

    void exibeCliente() {
        cliente.exibeDadosCadastrais();
    }
}