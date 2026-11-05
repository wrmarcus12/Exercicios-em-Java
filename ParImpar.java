/* Escreva um código que o usuário entre com um primeiro número, um segundo
 número maior que o primeiro e escolhe entre a opçãopar e impar, com isso 
 o código deve informar todos os números pares ou ímpares (de acordo com 
a seleção inicial) no intervalo de números informados, incluindo os 
números informados e em ordem decrescente;
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var num1 = scanner.nextInt();
        System.out.println("Informe um número maior que o anterior: ");
        var num2 = scanner.nextInt();
        System.out.println("Escolha a opção: \n 1 para PAR \n 2 para ÍMPAR");
        var escolha = scanner.nextInt();
        
        while (escolha != 1 && escolha != 2) {
        System.out.println("Opção inválida! Escolha 1 para PAR ou 2 para ÍMPAR:");
        escolha = scanner.nextInt();
    
        switch (escolha) {
        case 1:
        // PARES
        for (int i = num2; i >= num1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        break;

        case 2:
        // ÍMPARES
        for (int i = num2; i >= num1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        break;

}
        }       
    }
}
