package Aula11;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void emitirSom() {
         System.out.println("SSom Reptil ");        
    }

    @Override
    public void locomover() {
       System.out.println("Rastejando");
        
    }

    
    
}
