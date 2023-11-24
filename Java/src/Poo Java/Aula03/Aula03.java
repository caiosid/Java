package Aula03;

public class Aula03 { 
    public static void main(String[] args) {
        Jogador jogador = new Jogador(); 
        jogador.setNome("Thomas Mülle");
        jogador.setNacionalidade("Alemanha");
        jogador.setPosição("Segundo Atacante");
        jogador.setLocalnascimento("Weilheim in Oberbayern");
        jogador.setClube("Bayern Múnchen");
        jogador.setTitulos("Copa do mundo, Champions League, Bundesliga, Campeão da Alemanha, UEFA-Supercup");
        jogador.setAltura(1.85f);
        jogador.setSalario(12.00f);
        jogador.setGols(125);
        jogador.setIdade(34);
        jogador.setAnonascimento(1985);
        jogador.setAlvo("Borussia Dortmund");
        jogador.obterInformacoes();
    }
}

