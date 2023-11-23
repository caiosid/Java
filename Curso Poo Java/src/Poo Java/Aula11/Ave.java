package Aula11;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando");
        
    }

    @Override
    public void locomover() {
       System.out.println("Voando");
        
    }
    public void fazerNinho(){
        System.out.println("Fazendo um ninho!");
    }
    
}
