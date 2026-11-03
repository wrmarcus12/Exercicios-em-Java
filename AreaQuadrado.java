/*Escreva um código que receba o tamanho do lado de um quadrado, calcule sua 
área e exiba na tela.
 */ 
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
         System.out.println("Informe o lado do quadrado em metros: ");
         var lado = scanner.nextInt();
         var area = lado * lado;
         System.out.printf("A área do quadrado é %s m.", area);
    }
}
