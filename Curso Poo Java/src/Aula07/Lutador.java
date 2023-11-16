package Aula07;
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private String categoria;
    private float altura; 
    private float peso;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos públicos
    public void apresentar(){

    }
    public void status(){

    }
    public void ganharLuta(){

    }
    public void perderLuta(){

    }
    public void empatarLuta(){

    }

    // Métodos Especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura,float peso,int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        setEmpates(empates);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome =  nome;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválida";
        }
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){
        return this.peso;
    }
    private void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
        
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

   


}
