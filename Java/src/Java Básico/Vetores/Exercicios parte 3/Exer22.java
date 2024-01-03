import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] vetorA = new double[10];

        int qtd1 = 0;
        int qtd0 = 0;

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
               qtd0++; 
            } else{
                qtd1++;
            }

        }

        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd0 * 100) / vetorA.length;

        System.out.println("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i] +  " ");
        }
        System.out.println("Porcetagem 0" + porc0);
        System.out.println("Porcetagem 1 " + porc1);
    }
}
