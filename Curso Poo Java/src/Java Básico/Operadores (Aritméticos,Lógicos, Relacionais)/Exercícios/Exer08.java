package Exercícios;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scanner.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        double horas = scanner.nextDouble();
        double salario =  valorHora * horas;
        
        System.out.println("O salário é de: " + salario);



    }
}
