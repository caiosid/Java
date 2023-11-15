package Aula02;

public class Aula02 {
    public static void main(String[] args) {
      Caneta caneta1 = new Caneta();
      caneta1.cor = "Azul";
      caneta1.ponta = 0.5F;
      caneta1.tampar();
      caneta1.status();
      caneta1.rabiscar();
      Caneta caneta2 = new Caneta();
      caneta2.modelo = "Hostnet";
      caneta2.cor = "Preta";
      caneta2.destampada();
      caneta2.rabiscar();
    }
}
