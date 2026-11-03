// Calculadora Java
import java.util.Scanner;


public class Calculadora {
    
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.println("Informe a operação (+,-,* ou /)");
        var oper = scanner.next();
        System.out.println(value1 + oper + value2 + " = " + (value1 + value2));
        
}
 
}