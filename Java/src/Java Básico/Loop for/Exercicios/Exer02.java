/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações */
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean inforValidas = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Entre com o nome do usuário");
            nomeUser = scanner.next();

            System.out.println("Entre com a senha:");
             senha = scanner.next();

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
