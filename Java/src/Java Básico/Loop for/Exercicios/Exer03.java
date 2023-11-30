import java.util.Scanner;
/*
 * Faça um programa que leia e valide as seguintes informações:
   a. Nome: maior que 3 caracteres;
   b. Idade: entre 0 e 150; 
   c. Salário maior que zero;
   d. Sexo "f" ou "m";   
   e. Estado Civil 'solteiro', 'casado', 'diforciado', 'viuvo'
 */

public class Exer03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean infoValida = true;
        String nome, sexo, estadoCivil;
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
            if (sexo.equalsIgnoreCase("femenino") || sexo.equalsIgnoreCase("masculino")) {
                infoValida =  true;
                System.out.println("Sexo precisa ser 'f' ou 'm'");
            }
            
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o estado civil: ");
            estadoCivil = scanner.next();
            if (estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("casado") || estadoCivil.equalsIgnoreCase("divorciado") || estadoCivil.equalsIgnoreCase("viuvo")) {
                infoValida = true;
            } else{
                System.out.println("Estado civil precisa ser 'solteiro', 'casado','divorvciado', 'viuvo'");
            }
        } while (!infoValida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
