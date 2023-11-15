package Aula03;

public class Jogador {
    private String nome;
    private String nacionalidade;
    private String posição;
    private String localnascimento;
    private String clube;
    private String titulos;
    private  String alvo;
    private float altura;
    private float salario;
    private int gols;
    private int idade;
    private int anonascimento;

   public String getNome(){
       return this.nome;
   }

   public void setNome(String nome){
       this.nome = nome;
   }

   public String getNacionalidade(){
       return this.nacionalidade;
   }

   public void setNacionalidade(String nacionalidade){
       this.nacionalidade = nacionalidade;
   }

   public String getPosição(){
       return this.posição;
   }

   public void setPosição(String posição){
       this.posição = posição;
   }

   public String getLocalnascimento(){
       return this.localnascimento;
   }

   public void setLocalnascimento(String localnascimento){
       this.localnascimento =  localnascimento;
   }

   public String getClube(){
       return this.clube;
   }

   public void setClube(String clube){
       this.clube = clube;
   }

   public String getTitulos(){
       return this.titulos;
   }

   public void setTitulos(String titulos){
       this.titulos = titulos;
   }

   public String getAlvo(){
       return this.alvo;
   }

   public void setAlvo(String alvo){
       this.alvo = alvo;
   }

   public float getAltura(){
       return this.altura;
   }

   public void setAltura(float altura){
       this.altura = altura;
   }

   public float getSalario(){
       return this.salario;
   }

   public void setSalario(float salario){
       this.salario = salario;
   }

   public int getGols(){
       return this.gols;
   }

   public void setGols(int gols){
       this.gols = gols;
   }

   public int getIdade(){
       return this.idade;
   }

   public void setIdade(int idade){
       this.idade = idade;
   }

   public int getAnonascimento(){
       return this.anonascimento;
   }

   public void setAnonascimento(int anonascimento){
       this.anonascimento = anonascimento;
   }

   void status(){
       System.out.println("O nome desse jogador é: " + this.getNome());
       System.out.println("A posição do seu jogador é: " + this.getPosição());
       System.out.println("O Time por onde o seu jogador atua é o : " + this.getClube());
       System.out.println("A quantidade de gols marcados pelo seu jogador até o momento é de: " +  this.getGols());
       System.out.println("Os titulos vencidos por seu jogador são: " + this.getTitulos());
   }

   public void jogar() {
       System.out.println(getNome() + " está jogando!");
   }

   public void atacar(String alvo) {
       System.out.println(getNome() + " está atacando " + getAlvo() + "!");
   }

   public void defender() {
       System.out.println(getNome() + " está se defendendo!");
   }

   public void obterInformacoes() {
       System.out.println("Jogador: " + getNome() + ", Os seus títulos são " + getTitulos() + ", e os gols marcados foram" + getGols()); 
   }

   public void aumentarGols() {
       this.gols++;
   }

   public void atualizarPontuacao(int pontos) {
       this.gols += pontos;
   }

   public void alterarNome(String novoNome) {
       this.nome = novoNome;
   }

}
