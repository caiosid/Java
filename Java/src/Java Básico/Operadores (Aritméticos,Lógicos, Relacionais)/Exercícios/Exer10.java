package Exercícios;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius");
        double celsius = scanner.nextDouble();  

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura " + celsius + "Celsius é igual a:" + farenheit + "Farenheit");
    
    }
}
