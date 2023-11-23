package Aula13.Aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setnumeroConta(86684129);
        pessoa1.setDono("Caio");
        pessoa1.abrirConta("Conta Corrente");
        pessoa1.depositar(50);
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setnumeroConta(9187451);
        pessoa2.setDono("Cesar");
        pessoa2.abrirConta("Conta Poupança");
        pessoa2.depositar(50);
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}
