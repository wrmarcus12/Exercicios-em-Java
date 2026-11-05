/* Escreva um código onde o usuario entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

     var scanner = new Scanner(System.in);
     System.out.println("Informe um número de 1 à 10: ");
     var num = scanner.nextInt();
     System.out.printf("Esta é a tabuada do número %s: \n", num);
     for (int i =1; i <=10; i++) {
     System.out.printf("%s x %s = %s \n", num, i, (num*i));
        }
    }
    
}