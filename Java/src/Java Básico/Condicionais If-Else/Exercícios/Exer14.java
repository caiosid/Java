import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota:");
        double nota1 =  scanner.nextDouble();

        System.out.println("Digite a sua segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) /2;
        
        String aproveitamento = "";
        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media < 4 ) {
            aproveitamento = "E";
        }

        System.out.println("Nota 1 :" + nota1);
        System.out.println("Nota 2 :" + nota2);
        System.out.println("A sua média é: " + media);
        System.out.println("O seu aproveitamento foi: " + aproveitamento);

        switch (aproveitamento) {
            case "A": 
            case "B":
            case "C": System.out.println("Aprovado!"); break;
            case "D": 
            case "E": System.out.println("Reprovado");
                
        }

    }
}
