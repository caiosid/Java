import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o dia da semana");
        int DiasDaSemana = scanner.nextInt();

        switch (DiasDaSemana) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Dia últil"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é um dia da semana válido");

        }
    }
}
