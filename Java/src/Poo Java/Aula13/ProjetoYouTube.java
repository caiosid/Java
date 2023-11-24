package Aula13;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video video [] = new Video[3];

        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 12 de PHP");
        video[2] = new Video("Aula 10 de HTML5");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Bruno", 22,"Masculino", "Bru");
        gafanhoto[1] = new Gafanhoto("Cesar", 18, "Masculino", "cesart");

        System.out.println(video[2].toString());
        
    }
}
