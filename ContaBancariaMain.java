import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== BEM-VINDO AO BANCO DIGITAL ===");
        System.out.print("Informe o valor do primeiro depósito para abrir a conta: R$ ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);
        System.out.println("Conta criada com sucesso!");

        int opcao = 0;

        // Loop do Menu Interativo
        while (opcao != 7) {
            System.out.println("\n---------------------------------");
            System.out.println("         MENU PRINCIPAL          ");
            System.out.println("---------------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Informe o valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Informe o valor a sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Informe o valor do boleto: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar nossos serviços bancários. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 7.");
                    break;
            }
        }

        scanner.close();
    }
}