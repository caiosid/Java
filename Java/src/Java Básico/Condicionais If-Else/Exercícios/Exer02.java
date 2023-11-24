import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = scanner.nextInt();

        if(numero >= 0){
            System.out.println("O número informado é positivo!");
        } else{
            System.out.println("O número é negativo");
        }
        
    }
}
