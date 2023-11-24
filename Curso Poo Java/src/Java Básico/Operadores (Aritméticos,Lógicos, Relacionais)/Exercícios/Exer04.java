package Exercícios;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a primeira nota");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Entre com a segunda nota");
        double segundaNota = scanner.nextDouble();

        System.out.println("Entre com a terceira nota");
        double terceiraaNota = scanner.nextDouble();

        System.out.println("Entre com a quarta nota");
        double quartaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraaNota + quartaNota) / 4;
        System.out.println("A média é: " + media);
    }
}
