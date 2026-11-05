/*Escreva um código onde o usuário entra com sua altura 
e peso, seja feito o cálculo do seu 
IMC(IMC = peso/(Altura*Altura)) 
e seja exibida a mensagem de acordo com o resultado;
    - Se for menor ou igual a 18,5 "Abaixo do peso";
    - Se for entre 18,5 e 24,9 "Peso Ideal";
    - Se for entre 25 e 29,9 "Levemente Acima do peso";
    - Se for entre 30 e 34,9 "Obesidade Gral I";
    - Se for entre 35 e 39,9 "Obesidade Gral II (Severa)"
    - Se for acima de 40 "Obesidade III (Mórbida)";
 */
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe sua altura em metros: ");
        var altura = scanner.nextDouble();
        System.out.println("Informe seu peso em kg: ");
        var peso = scanner.nextDouble();

        var IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.printf(" %s está abaixo do peso.", nome);
        }   
        else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.printf("Parabéns! %s está no peso ideal.", nome);
        }   
        else if (IMC >= 25 && IMC <= 29.9) {
            System.out.printf(" %s está levemente acima do peso.", nome);
        }  
        else if (IMC >= 30 && IMC <= 34.9) {
            System.out.printf(" %s está em Obesidade Gral I", nome);
        }  
        else if (IMC >= 35 && IMC <= 39.9) {
            System.out.printf(" %s está em Obesidade Gral II (Severa)", nome);
        }
        else {
            System.out.printf("%s está em Obesidade III (Mórbida).", nome);
}
    }
}
