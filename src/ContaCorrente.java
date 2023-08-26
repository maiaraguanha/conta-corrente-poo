class ContaCorrente {   // Classe

    // Atributos da classe ContaCorrente
    private String nome;
    private String tipoConta;
    private double saldo;

    public ContaCorrente(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    // Métodos da classe ContaCorrente
    public double consultarSaldo() {
        return saldo;
    }

    public void receberValor(double valor) {
        saldo += valor;
    }

    public void transferirValor(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para essa transferência");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}