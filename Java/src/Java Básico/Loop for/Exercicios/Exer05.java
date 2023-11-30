import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double populacaoA;
        double populacaoB;
        double taxaA;
        double taxaB;

         boolean valido = false;
        do {
            System.out.println("Entre com a população A: ");
            populacaoA = scanner.nextDouble();
            if (populacaoA > 0) {
                valido = true;
            } else{
                System.out.println("População A precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a população B: ");
            populacaoB = scanner.nextDouble();
            if (populacaoB > 0) {
                valido = true;
            } else{
                System.out.println("População B precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = scanner.nextDouble();
            if (taxaA > 0) {
                valido = true;
            } else{
                System.out.println("Taxa de crescimento A precisa ser maior que 0 ");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da populção B: ");
            taxaB = scanner.nextDouble();
            if (taxaB > 0) {
                System.out.println("Taxa de crescumento B precisa ser maior do que 0");
            }
        } while (!valido);

        int cont = 0;
        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA/100) * taxaA;
            populacaoB += (populacaoB/100) * taxaB;
            cont ++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B:" + populacaoB);
        System.out.println("Quantidade de anos: " + cont);

        

        
    }
}
