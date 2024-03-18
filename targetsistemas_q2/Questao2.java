/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e 
o próximo valor sempre será a soma dos 2 valores anteriores 
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado 
um número, ele calcule a sequência de Fibonacci e retorne uma 
mensagem avisando se o número informado pertence ou não a sequência.

*/

package targetsistemas_q2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();

        if (fibonacci(numero)) {
            System.out.println(numero + " pertence à sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequencia de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean fibonacci(int numero) {
        int a = 0;
        int b = 1;

        if (numero == 0 || numero == 1) {
            return true;
        }

        while (b < numero) {
            int auxB = b;
            b = a + b;
            a = auxB;

            if (b == numero) {
                return true;
            }
        }

        return false;
    }
}

