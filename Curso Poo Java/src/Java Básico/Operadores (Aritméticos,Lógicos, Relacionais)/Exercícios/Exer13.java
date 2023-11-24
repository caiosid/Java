package Exercícios;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scanner.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        double horas = scanner.nextDouble();
        double salarioBruto =  valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos =  inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("O salário bruto " + salarioBruto);
        System.out.println("INSS" + inss);
        System.out.println("Sindicato" +  sindicato);
        System.out.println("Salario líquido" + salarioLiquido);
        System.out.println("IR" + ir);
    }
}
