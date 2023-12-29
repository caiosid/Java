import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        double [] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar");
        cotacao = scanner.nextDouble();

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = cotacao * (i+1);
        }

        System.out.println("Notas 2 =");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
    }
}
