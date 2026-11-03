/* Escreva um código que receba o nome e a idade de 2 pessoas e exiba a
 diferença entre elas.
 */

import java.util.Scanner;

public class DiferençaIdade {
     public static void main(String[] args) {
     var scanner = new Scanner(System.in);
     System.out.println("Informe seu nome da pessoa mas velha: ");
     var nome1 = scanner.next();
     System.out.println("Informe sua idade: ");
     var id1 = scanner.nextInt();
     System.out.println("Informe seu nome da pessoa mais nova: ");
     var nome2 = scanner.next();
     System.out.println("Informe sua idade: ");
     var id2 = scanner.nextInt();
     var dif = id1 - id2;
     System.out.printf("Olá, a diferença de idade de %s e %s é %s anos. \n", nome1, nome2, dif);
     }
}
