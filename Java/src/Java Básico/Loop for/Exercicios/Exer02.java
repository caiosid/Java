import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean inforValidas = false;

        do {
            System.out.println("Entre com o nome do usuário");
            String nomeUser = scanner.next();

            System.out.println("Entre com a senha:");
            String senha = scanner.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                // inforValidas = false;
                System.out.println("Senha igual ao nome do usuário, digite novamente");
            } else{
                inforValidas = true;
                System.out.println("Senha e usuários válidos!");
            }

        } while (!inforValidas);
        
    }
}
