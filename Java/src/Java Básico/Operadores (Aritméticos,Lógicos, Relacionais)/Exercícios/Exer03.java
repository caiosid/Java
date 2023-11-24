package Exercícios;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui o primeiro número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite agora o segundo número:");
        int segundoNumero = scanner.nextInt();
        int resultado = primeiroNumero +segundoNumero;
        System.out.println("A soma dos dois números é: " + resultado);
    }
}
