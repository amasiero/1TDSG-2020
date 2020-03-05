class Pessoa {
    String nome;
    String rg;
    int cpf;
    String endereco;
    String dataNascimento;

    void exibeDadosCadastrais() {
        System.out.printf("Nome: %s CPF: %d RG: %s " +
        "Data de Nascimento: %s", nome, cpf, rg, dataNascimento);
    }

    String informeEndereco() {
        return endereco;
    }
}