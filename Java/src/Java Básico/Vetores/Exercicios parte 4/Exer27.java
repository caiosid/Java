
/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá receber 'b' quando Ai for igual a 7; c)Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for igual a 10; e e) B, deverá receer 'e' quando Ai for maior que 10 Sugestão: char B [10] */

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] primeiroVetor = new int[10];
        int [] segundoVetor = new int[primeiroVetor.length];

        for(int i=0; i<primeiroVetor.length; i++){
          System.out.println("Ente com um número para a posição =" + i);
          primeiroVetor[i] = scanner.nextInt();
          if (primeiroVetor[i] < 7 ) {
            segundoVetor[i] = 'a';
        } else if(primeiroVetor[i] == 7){
            segundoVetor[i] = 'b';
        } else if(primeiroVetor[i] > 7 && primeiroVetor[i] < 10){
            segundoVetor[i] = 'c';
        } else if(primeiroVetor[i] == 10){
            segundoVetor[i] = 'd';
        } else if(primeiroVetor[i] > 10){
            segundoVetor[i] = 'd';
        }
        }
    }
}
