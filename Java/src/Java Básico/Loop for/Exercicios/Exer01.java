import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean notaValida = false;

        do {
             System.out.println("Entre com uma nota:");

        double nota = scanner.nextDouble();

        if (nota >=0 && nota <= 10) {
            notaValida = true;
            System.out.println("Você digitou: " + nota);
        } else{
            System.out.println("Nota inválida digite novamente!");
            
        }
        } while (!notaValida );

    }
}

