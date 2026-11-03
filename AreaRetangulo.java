/* Escreva um código que receba o lado e a altura de um retangulo, calcule sua 
área e exiba na tela.
 */
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o lado do retângulo, em metros: ");
        var lado = scanner.nextInt();
        System.out.println("Informe a altura do retângulo, em metros: ");
        var altura = scanner.nextInt();
        var area = lado * altura;
        System.out.printf("A área do retângulo é %s m.", area);
    }
}
