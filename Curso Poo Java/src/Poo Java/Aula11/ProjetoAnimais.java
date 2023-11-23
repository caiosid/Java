package Aula11;

public class ProjetoAnimais {
    public static void main(String[] args) {
        Mamifero leão = new Mamifero();
        Reptil sapo = new Reptil();
        Peixe  tubarão = new Peixe();
        Ave falcão = new Ave();
        Cachorro cachorro = new Cachorro();

        leão.setPeso(85.6f);
        leão.setIdade(2);
        leão.setMembros(4);
        leão.locomover();
        leão.alimentar();
        leão.emitirSom();

        sapo.setPeso(5f);
        sapo.setIdade(1);
        sapo.setMembros(4);
        sapo.alimentar();
        sapo.emitirSom();
        sapo.locomover();
        

        tubarão.setPeso(0.66f);
        tubarão.setIdade(1);
        tubarão.setMembros(0);
        tubarão.locomover();
        tubarão.alimentar();
        tubarão.emitirSom();
        tubarão.soltarBolha();

        falcão.setPeso(0.89f);
        falcão.setIdade(3);
        falcão.setMembros(2);
        falcão.alimentar();
        falcão.emitirSom();
        falcão.locomover();
        falcão.fazerNinho();

    }
}
