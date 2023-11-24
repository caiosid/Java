import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com uma letra F ou M");
        String input = scanner.next();
        
       if (input.equals("f")) {
        System.out.println("F - Femenino");
       } else if(input.equals("m")){
        System.out.println("M - Masculino");
       } else{
        System.out.println("Sexo inválido");
       }
    }
}
