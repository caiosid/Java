import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Entre com o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Entre com o terceiro número:");
        int numero3 = scanner.nextInt();

        if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
            // numero1 é menor
            // numero3 é maior
            // numero1 < numero2 < numero3
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);
        } else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
            // numero 1 é menor
            // numero 2 é maior
            // numero 1 < numero 3 < numero 2 
            System.out.println(numero2 + " - " + numero3 + " - " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
            // numero 2 é menor
            // numero 3 é maior
            // numero 2 < numero 1 < numero3
            System.out.println(numero3 + " - " + numero1 + " - " + numero2);
            
        } else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1 ) {
            // numero2 menor
            // numero1 maior
            // numero2 > numero3 > numero1
            System.out.println(numero1 + " - " + numero3 + " - " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
            // numero3 é maior
            // numero2 é menor
            // numero3 > numero2 > numero1
            System.out.println( numero2 + " - " + numero1 + " - " + numero3);
        } else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);
        }
    }
}
