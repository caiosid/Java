import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Entre com um segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Entre com o terceiro e último número:");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Número 1 é maior: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Número 2 é maior: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("Número 3 é o maior: " + numero3);
        }

        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("Número 1 é maior: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("Número 2 é maior: " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2) {
            System.out.println("Número 3 é o maior: " + numero3);
        }
    }
}
