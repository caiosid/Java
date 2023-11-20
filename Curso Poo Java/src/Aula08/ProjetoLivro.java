public class ProjetoLivro {
    public static void main(String[] args) {
     Pessoa[] pessoa = new Pessoa[2];
     Livro [] livro = new Livro[3];

     pessoa[0] = new Pessoa("Pedro", 22, "Masculino");
     pessoa[1] = new Pessoa("Maria", 25, "Feminino");

     livro[0] = new Livro("A Última Música", "Nicholas Sparks", 300, true, pessoa[0] );
     livro[1] = new Livro("Os Sete Maridos de Evelyn Hugo", "Taylor Jenkins Reid", 400, true, pessoa[1]);
     livro[2] = new Livro("A cidade do Sol", "Khaled Housseini ", 500, true, null);

     livro[0].abrir();
     livro[0].folhear(50);

     System.out.println(livro[0].detalhes());



    }
}
