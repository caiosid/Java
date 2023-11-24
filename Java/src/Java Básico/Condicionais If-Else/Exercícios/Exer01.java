import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        int segundoNumero = scanner.nextInt();
        
        if(primeiroNumero > segundoNumero){
            System.out.println("O número: " + primeiroNumero + "é maior" );
        } else{
            System.out.println("O número: " + segundoNumero +  "é maior");
        }
    }
}
