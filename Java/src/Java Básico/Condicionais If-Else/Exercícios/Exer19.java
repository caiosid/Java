import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Entre com o segundo número");
        int segundoNumero = scanner.nextInt();

        System.out.println("Entre com a operação (+ / * -)");
        String operacao = scanner.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+": resultado = primeiroNumero + segundoNumero; break;
            case "-": resultado = primeiroNumero - segundoNumero; break;
            case "*": resultado = primeiroNumero * segundoNumero; break;
            case "/": resultado = primeiroNumero / segundoNumero; break;
            default: System.out.println("Operação inválida");
            valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " +  resultado);
            if (resultado >=0) {
                System.out.println("Resultado positivo");
            } else{
                System.out.println("resultado negativo");
            }
            if (resultado % 2 == 0) {
                System.out.println("resultado par");
            } else{
                System.out.println("resultado impar");
            }
        } 
    }
}
