/*Desafio
Na Academia dos Desafios de Codigo, cada aprendiz precisa atravessar um corredor de portais numerados. Um portal so se 
abre quando o numero informado segue uma regra simples de treinamento: ele deve ser positivo e divisivel por 3. O mestre 
quer um verificador automatico para analisar varios portais em sequencia e registrar o resultado de cada tentativa.

Implemente um programa que leia uma quantidade de testes e, para cada numero recebido, decida qual mensagem deve ser exibida. 
Se o numero for menor ou igual a zero, a tentativa e invalida. Se for positivo e divisivel por 3, o portal abre. Caso contrario, 
o portal permanece fechado. Esse desafio foi criado para praticar condicionais e lacos, portanto a solucao deve processar todos 
os casos usando repeticao e decisoes simples. Cada resultado deve ser produzido de forma independente, na mesma ordem em que os 
numeros forem lidos.

Entrada
A primeira linha contem um inteiro N, indicando quantas tentativas serao analisadas. Nas N linhas seguintes, ha um inteiro X por 
linha, representando o numero digitado em um portal.

Saída
Para cada tentativa, imprima uma linha. Use exatamente INVALID se X for menor ou igual a zero, OPEN se X for positivo e divisivel 
por 3, ou CLOSED nos demais casos.

Exemplos
A tabela abaixo apresenta exemplos de entrada e saída:

Entrada	Saída
1 9	OPEN
1 10	CLOSED
1 0	INVALID
3 3 4 -2	OPEN CLOSED INVALID
 */

import java.util.Scanner;

public class Desafio2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTentativas = scanner.nextInt();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < totalTentativas; i++) {
            long numeroPortal = scanner.nextLong();

            if (numeroPortal <= 0) {
                resultado.append("INVALID");
            } 
            else if (numeroPortal % 3 == 0) {
                resultado.append("OPEN");
            }
            else {
                resultado.append("CLOSED");
            }

            if (i < totalTentativas - 1) {
                resultado.append(" ");
            }
        }

        System.out.print(resultado);
        scanner.close();
    }
}