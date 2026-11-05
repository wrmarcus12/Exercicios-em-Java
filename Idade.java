// Recebe o nome e o ano de nascimento de alguem e imprime: "Olá, "fulano", você tem "X" anos".
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
    
    var scanner = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    var nome = scanner.next();
    System.out.println("Informe a sua Idade: ");
    var ida = scanner.nextInt();
    System.out.printf("Olá, %s você tem %s anos. \n", nome, ida);
     }
}