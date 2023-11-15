package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
 
    public Caneta() {
    }
 
    void status() {
       System.out.println("Modelo" + this.modelo);
       System.out.println("Uma caneta " + this.cor);
       System.out.println("Ponta" + this.ponta);
       System.out.println("Carga" + this.carga);
       System.out.println("Est\u00e1 tampada?" + this.tampada);
    }
 
    void rabiscar() {
       if (this.tampada) {
          System.out.println("Erro! N\u00e3o posso rabiscar");
       } else {
          System.out.println("Estou rabiscando!");
       }
 
    }
 
    void tampar() {
       this.tampada = true;
    }
 
    void destampada() {
       this.tampada = false;
    }
}
