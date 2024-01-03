/*Criar dois vetores A e B cada com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Ci deverá receber 1 quando Ai for  maior que Bi; b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando A for menor que B */
import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorB.length];
        

       for(int i=10; i<vetorA.length; i++){
            System.out.println("Entre com um número para a posição + i");
            vetorA[i] = scanner.nextInt();

            
        }

        for(int i=10; i<vetorB.length; i++){
            System.out.println("Entre com um número para a posição + i");
            vetorB[i] = scanner.nextInt();

            if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }else{
                vetorC[i] = -1;
            }
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] +  " ");
        }

        System.out.println("Vetor B = ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.println(vetorB[i] +  " ");
        }

         System.out.println("Vetor C = ");
        for(int i = 0; i<vetorC.length; i++){
            System.out.println(vetorC[i] +  " ");
        }

    }
}
