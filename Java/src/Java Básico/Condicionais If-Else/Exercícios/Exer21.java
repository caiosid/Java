import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de litros vendidos");
        double litros = scanner.nextDouble();

        System.out.println("Entre com o tipode combustível ");
        String tipo = scanner.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDes = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percDesconto = 3;
            } else{
                percDesconto = 5;
            }

            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else{
                percDesconto = 6;
            }

            total = litros * precoGas;
        }
        
        totalDes = (total / 100) * percDesconto;

        double precoApagar = total - totalDes;

        System.out.println("Valor a ser pago: " + precoApagar);
        
    }
}
