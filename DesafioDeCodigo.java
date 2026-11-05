/*  Desafio
Em uma maratona de estudos de Java, a Academia Loop and If criou um painel que avalia sequencias digitadas pelos novatos. 
Cada participante envia varios numeros inteiros, e o painel precisa decidir rapidamente se a sequencia foi equilibrada. 
Uma sequencia sera considerada equilibrada quando contiver pelo menos um numero par, pelo menos um numero impar e nenhum 
valor negativo. Como o painel sera usado em desafios introdutorios, a verificacao deve ser simples, direta e feita com 
condicionais e laços.

Sua tarefa e ler uma quantidade informada de valores e analisar a lista completa. Se todos os numeros forem maiores ou 
iguais a zero e houver ao menos um par e ao menos um impar, imprima equilibrada. Se existir qualquer numero negativo, 
imprima invalida. Caso nao haja negativos, mas todos os numeros sejam apenas pares ou apenas impares, imprima incompleta. 
O problema deve ser resolvido processando os valores em um unico programa, sem depender de arquivos extras ou bibliotecas externas.

Entrada
A primeira linha contem um inteiro N, indicando quantos numeros serao analisados. A segunda linha contem N inteiros separados 
por espaco. Considere 1 <= N <= 100.

Saída
Imprima exatamente uma das tres palavras: equilibrada, invalida ou incompleta, de acordo com a analise da sequencia.
*/

import java.util.Scanner;

public class DesafioDeCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        boolean temPar = false;
        boolean temImpar = false;
        boolean temNegativo = false;

        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                temNegativo = true;
            } 
            else if (numero % 2 == 0) {
            temPar = true; // Achamos um par!
            } 
            else {
            temImpar = true; // Se não for negativo nem par, é ímpar!
            }
        }

        if (temNegativo) {
            System.out.println("invalida");
        } else if (temPar && temImpar) {
            System.out.println("equilibrada");
        } else {
            System.out.println("incompleta");
        }

        scanner.close();
    }
}
