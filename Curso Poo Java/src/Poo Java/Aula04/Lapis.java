package Aula04;

public class Lapis {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public  Lapis(String modelo, String cor, float ponta){
      this.setModelo(modelo);
      this.setCor(cor);
      this.setPonta(ponta);
      this.tampar();
      
    }

    public String getModelo(){
      return this.modelo;
    }

    public void setModelo(String m){
      this.modelo = m;
    }

    public float getPonta(){
      return this.ponta;
    }

    public void setPonta(float p){
      this.ponta = p;
    }

    public String getCor(){
      return this.cor;
    }

    public void setCor(String cor){
      this.cor = cor;
    }

    public void tampar(){
      this.tampada =  true;
    }

    public void destampar(){
      this.tampada = false;
    }

    

    public void status(){
      System.out.println("Sobre o lápis");
      System.out.println("Modelo: " + this.getModelo());
      System.out.println("Ponta: " + this.getPonta());
      System.out.println("Cor" + this.getCor());
      System.out.println("Tampado" + this.tampada);
    }
}
