import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i]  % 2;
        }

        System.out.println("VetorA");
        for(int i=0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VetorB");
        for(int i=0; i < vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("VetorC");
        for(int i=0; i < vetorC.length; i++){
            System.out.println(vetorC[i] + " ");
        }
        System.out.println();
    }
}
