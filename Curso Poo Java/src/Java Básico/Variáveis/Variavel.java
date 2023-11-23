/*Variável
 * Área de memória associada a um nome, que pode armazenar valores de um determinado tipo
*/
public class Variavel {
    public static void main(String[] args) {
        // convenção Java
        int idade = 26;
        String nome = "Caio";
        String nomeDoMeuCachorro = "totó";
        // aceito, mas não utilizado 
        int _idade;
        int $idade;

        // não é convenção Java
        String NomedDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 26;

        System.out.println("Idade: " +  idade);
        System.out.println("Nome: "+  nome);

        // má prática
        int a = 10;
        String b = "Caio";    
    }
}
