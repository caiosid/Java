package Exercícios;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Farenheit");
        double farenheit = scanner.nextDouble();  

        double celsius = (5*(farenheit-32) /9);

        System.out.println("A temperatura " + farenheit + "Farenheit é igual a:" + celsius + "Celsius");
    
    }
}
