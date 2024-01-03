import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um número para a posição " + i);
            vetorA[i] =  scanner.nextInt();

        }

        boolean palindromo = true;
        for(int i=0; i<vetorA.length; i++){
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] +  " ");
        }

        if (palindromo) {
            System.out.println("Palindromo");
        } else{
            System.out.println("Não é Palindromo");
        }
    

    }
}
