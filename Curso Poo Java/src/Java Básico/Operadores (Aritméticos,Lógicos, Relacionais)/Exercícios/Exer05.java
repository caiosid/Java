package Exercícios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros");
        double metros = scanner.nextDouble();

        double centimentro = metros * 100;

        System.out.println(metros + "metros é igual a" + centimentro + "cm");
    }
}
