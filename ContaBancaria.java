/*Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
 */

public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;
    private double taxaPendente;

    // Construtor: define as regras no momento da criação da conta
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0.0;
        this.taxaPendente = 0.0;

        // Regra do cheque especial baseada no primeiro depósito
        if (depositoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.50; // 50%
        }
    }

    // 1. Consultar saldo
    public void consultarSaldo() {
        System.out.printf("Saldo em conta: R$ %.2f\n", this.saldo);
        double limiteDisponivel = this.limiteChequeEspecial - this.chequeEspecialUsado;
        System.out.printf("Total disponível (Saldo + Cheque Especial): R$ %.2f\n", (this.saldo + limiteDisponivel));
    }

    // 2. Consultar cheque especial
    public void consultarChequeEspecial() {
        double limiteDisponivel = this.limiteChequeEspecial - this.chequeEspecialUsado;
        System.out.printf("Limite total do Cheque Especial: R$ %.2f\n", this.limiteChequeEspecial);
        System.out.printf("Valor em uso no momento: R$ %.2f\n", this.chequeEspecialUsado);
        System.out.printf("Limite disponível para uso: R$ %.2f\n", limiteDisponivel);
        if (this.taxaPendente > 0) {
            System.out.printf("Taxa de 20%% pendente de cobrança: R$ %.2f\n", this.taxaPendente);
        }
    }

    // 3. Verificar se está usando cheque especial
    public void verificarUsoChequeEspecial() {
        if (this.chequeEspecialUsado > 0) {
            System.out.printf("ATENÇÃO: A conta está usando R$ %.2f do cheque especial.\n", this.chequeEspecialUsado);
        } else {
            System.out.println("A conta NÃO está usando cheque especial no momento.");
        }
    }

    // 4. Sacar dinheiro
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return false;
        }

        double limiteDisponivel = this.limiteChequeEspecial - this.chequeEspecialUsado;
        double saldoTotalDisponivel = this.saldo + limiteDisponivel;

        if (valor > saldoTotalDisponivel) {
            System.out.println("Saldo insuficiente (mesmo considerando o cheque especial)!");
            return false;
        }

        // Se o saldo cobre todo o saque
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            // Usa todo o saldo e o restante pega do cheque especial
            double restante = valor - this.saldo;
            this.saldo = 0.0;
            this.chequeEspecialUsado += restante;
            // Regra: gera taxa de 20% sobre o valor usado do cheque especial
            this.taxaPendente += restante * 0.20;
            System.out.printf("Você entrou no cheque especial em R$ %.2f! Taxa de R$ %.2f gerada.\n", restante, (restante * 0.20));
        }

        System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        return true;
    }

    // 5. Pagar boleto (usa a mesma lógica de débito do saque)
    public void pagarBoleto(double valor) {
        System.out.println("Processando pagamento de boleto...");
        if (sacar(valor)) {
            System.out.println("Boleto pago com sucesso!");
        } else {
            System.out.println("Falha ao pagar boleto: saldo insuficiente.");
        }
    }

    // 6. Depositar dinheiro (cobra a taxa assim que possível)
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
            return;
        }

        System.out.printf("Depósito de R$ %.2f recebido.\n", valor);

        // Regra: pagar a taxa pendente assim que possível
        if (this.taxaPendente > 0) {
            if (valor >= this.taxaPendente) {
                valor -= this.taxaPendente;
                System.out.printf("Taxa de 20%% do cheque especial quitada: R$ %.2f\n", this.taxaPendente);
                this.taxaPendente = 0.0;
            } else {
                this.taxaPendente -= valor;
                System.out.printf("Abatido R$ %.2f da taxa. Taxa restante: R$ %.2f\n", valor, this.taxaPendente);
                valor = 0.0;
            }
        }

        // Se ainda sobrou dinheiro, repõe o cheque especial usado
        if (valor > 0 && this.chequeEspecialUsado > 0) {
            if (valor >= this.chequeEspecialUsado) {
                valor -= this.chequeEspecialUsado;
                System.out.println("Cheque especial recomposto integralmente!");
                this.chequeEspecialUsado = 0.0;
            } else {
                this.chequeEspecialUsado -= valor;
                System.out.printf("Cheque especial recomposto parcialmente. Ainda em uso: R$ %.2f\n", this.chequeEspecialUsado);
                valor = 0.0;
            }
        }

        // O que sobrar vai direto para o saldo livre
        if (valor > 0) {
            this.saldo += valor;
        }
    }
}
