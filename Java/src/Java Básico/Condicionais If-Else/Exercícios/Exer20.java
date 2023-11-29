import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("Telefonou para a vítima");
        String resposta1 = scanner.next();

        System.out.println("Esteve no local do crime");
        String resposta2 = scanner.next();

        System.out.println("Mora perto da vítima?");
        String resposta3 = scanner.next();

        System.out.println("Já trabalhou com a vítima?");
        String resposta4 = scanner.next();

        System.out.println("Devia para a vítima");
        String resposta5 = scanner.next();

        int cont = 0;

        if (resposta1.equals("S")) {
          cont++;
        }
        if (resposta2.equals("S")) {
          cont++;
        }
        if (resposta3.equals("S")) {
          cont++;
        }
        if (resposta4.equals("S")) {
          cont++;
        }
        if (resposta5.equals("S")) {
          cont++;
        }

        if (cont == 2) {
          System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
          System.out.println("Cúmplice");
        } else if (cont == 5) {
          System.out.println("Assassino");
        } else if (cont == 0) {
          System.out.println("Inocente");
        }

      }
}
