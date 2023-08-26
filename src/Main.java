import java.util.Scanner;

public class Main {     //Classe

    // Método da classe Main onde contém o código principal do programa, e onde eu interajo com a classe ContaCorrente
    public static void main(String[] args) {
        String nome = "Maiara Franciely";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("********************************************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("\nNome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoConta);
        System.out.println("Saldo:              R$  " + saldo);
        System.out.println("\n********************************************************");

        String operacoesDoCliente = """
                                    
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """;

        // lerValor é um objeto instânciado ou criado da classe Scanner.
        Scanner lerValor = new Scanner(System.in);
        int opcao = 0;

        // conta é um objeto instânciado da classe ContaCorrente.
        ContaCorrente conta = new ContaCorrente(nome, tipoConta, saldo);

        while (opcao != 4) {
            System.out.println(operacoesDoCliente);
            opcao = lerValor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + conta.consultarSaldo());
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorRecebido = lerValor.nextDouble();
                conta.receberValor(valorRecebido);
                System.out.println("Saldo atual R$ " + conta.consultarSaldo());
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorSacado = lerValor.nextDouble();
                conta.transferirValor(valorSacado);
                System.out.println("Saldo atual R$ " + conta.consultarSaldo());
            } else if (opcao == 4) {
                System.out.println("Obrigada por escolher o nosso Banco! Volte Sempre !!!");
            } else {
                System.out.println("Operação inválida.");
            }
        }
    }
}
