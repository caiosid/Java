import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean infoValida = true;
        String nome, sexo;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome:");

            nome = scanner.next();
            if (nome.length() >= 3) {
                infoValida = true;
            } else{
                System.out.println("Nome precisa no mínimo 3 caracteres");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            System.out.println("Entre com a sua idade: ");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else{
                System.out.println("Idade precisa ser entre 0 e 150");
            }
            
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o seu salário");
            salario = scanner.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else{
                System.out.println("Salário precisa ser maior que 0");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o seu gênero");
            sexo = scanner.next();
            if (infoValida) {
                
            }
            
        } while (infoValida);

    }
}
