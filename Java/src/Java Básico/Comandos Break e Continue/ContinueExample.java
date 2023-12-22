public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
         int numero = scanner.nextInt();
 
         System.out.println("Entre com um limite");
         int limite = scanner.nextInt();
 
         for (int i = numero; i <= limite; i++){
           System.out.println(i);
            if (i % 7 == 0) {
            continue;
            }
            System.out.println("O valor de i é: " + i);
         }
    }
}
