import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a primeira nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Entre com a segunda nota");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        
        if (media == 10) {
            System.out.println("Aprovado por distinção");
        } else if(media >=7){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
        
    }
}
