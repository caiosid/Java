import java.util.Scanner;

;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Entre com uma letra");
        String letra = scanner.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Vogal");
        } else{
            System.out.println("Consoante");
        }*/
        String letra = scanner.next();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("vogal");
            default:
                
        }
    }
}
