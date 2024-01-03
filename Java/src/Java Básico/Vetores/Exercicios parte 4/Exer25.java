/*Criar um vetor A com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formção: a) N, deverá recber 1 quando A for par; b) B, deverá receber 0 quando A for ímpar. */

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorB.length];

        for(int i=10; i<vetorA.length; i++){
            System.out.println("Entre com um número para a posição + i");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = (vetorA[i] %2 == 0) ? 1 : 0;
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] +  " ");
        }

        System.out.println("Vetor B = ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.println(vetorB[i] +  " ");
        }
;    }
}
