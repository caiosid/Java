package Aula10;

public class Aula10 {
    public static void main(String[] args) {
    // Pessoa pessoa = new Pessoa();
    //Visitante visitante = new Visitante();
    //visitante.setNome("Caio");
    // visitante.setIdade(26);
    // visitante.setSexo("Masculino");
    //System.out.println(visitante.toString());

    Aluno aluno = new Aluno();
    aluno.setNome("Diego");
    aluno.setMatricula(12345987);
    aluno.setCurso("Engenharia da Computação");
    aluno.setIdade(23);
    aluno.setSexo("Masculino");

    Bolsista alunBolsista = new Bolsista();
    alunBolsista.setMatricula(45632108);
    alunBolsista.setNome("Jubileu");
    alunBolsista.setBolsa(12.5f);
    alunBolsista.setSexo("Masculino");
    alunBolsista.pagarMensalidade();

    
   }

}
