import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("par");
        } else{
            System.out.println("impar");
        }
    }
}
