
public class LoopFor {
    public static void main(String[] args) {
       
        for(int i =0; i < 5 ; i++){
           System.out.println(i);
        }

       // System.out.println(i);

        for(int i = 5; i >= 0; i--){
           System.out.println(i);
        }

        // for com mais de uma variável
        for(int i = 0, j = 10; i < j ; i++, j --){
           System.out.println("i = " + i + "; j = " + j);
        }

        // partes ausentes 
        int i = 0;
        for(; i < 10;){
            System.out.println("i tem o valor: " + i);
            i += 2;
        }

        for(int cont = 0; cont < 10; cont +=2){
            System.out.println(cont);
        }

        int soma = 0;
        for(int contador = 1; contador < 5; soma += i++)
        System.out.println("O valor da soma é: " + soma); 

    }
}
