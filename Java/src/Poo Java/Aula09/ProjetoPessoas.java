package Aula09;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Caio");
        aluno.setNome("Cesar");
        professor.setNome("Letícia");
        funcionario.setNome("Bruna");

        pessoa.setIdade(22);
        aluno.setIdade(35);
        professor.setIdade(30);
        funcionario.setIdade(40);

    
        aluno.setCurso("Cência da Computação");
        professor.setSalario(1.400f);
        funcionario.setSetor("Estoque");


        pessoa.setSexo("Masculino");
        aluno.setSexo("Masculino");
        professor.setSexo("Feminino");
        funcionario.setSexo("Feminino");
        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}
