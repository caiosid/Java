import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro preço:");
        double preco1 = scanner.nextDouble();

        System.out.println("Entre com um segundo preço:");
        double preco2 = scanner.nextDouble();

        System.out.println("Entre com o terceiro e último preço:");
        double preco3 = scanner.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
             System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
             System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2 ) {
            System.out.println("Compre o produto 3");
        }
    }
}
