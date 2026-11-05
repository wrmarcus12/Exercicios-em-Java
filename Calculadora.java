// Calculadora Java
import java.util.Scanner;


public class Calculadora {
    
    // Somar é fácil, agora preciso acrescentar a opção de escolher a operação. 
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.println("Informe a operação (+,-,* ou /)");
        var oper = scanner.next();
        //System.out.println(value1 + oper + value2 + " = " + (value1 + value2));
        System.out.printf("O número %s %s o número %s é igual à: ", value1, oper, value2);
}
 
}