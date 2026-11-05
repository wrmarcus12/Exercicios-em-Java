/* Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá 
continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o 
primeiro número dever ser ignorados.
 */
import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var num = scanner.nextInt();
        var keepVerify = (true);
        while (keepVerify){
            System.out.println("Informe o número para verificação: ");
            var toVerify = scanner.nextInt();
            if (toVerify < num) {
                System.out.printf("Infome um número maior que %s: ", num);
                continue;
            }


            keepVerify = toVerify % num == 0;
        }
    }
    
}
