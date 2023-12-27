
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] vetorA = new double[15];
        double [] vetorB = new double [vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição:" + i);
            vetorA[i] = scanner.nextDouble();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###,##");
        
        System.out.println("Vetor B = ");
        for(int i = 0;  i < vetorB.length; i++){
            System.out.println(df.format(vetorB[i]) + " ");
        }
        System.out.println();
    }
}
