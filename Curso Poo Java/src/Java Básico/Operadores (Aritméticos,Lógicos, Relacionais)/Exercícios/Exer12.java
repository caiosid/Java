package Exercícios;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a altura:");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O Peso ideal é: " + pesoIdeal);
    }
}
