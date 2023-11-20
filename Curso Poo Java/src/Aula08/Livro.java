public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int pagAtual;
    private int tolPaginas;
    private boolean aberto;
    private Pessoa leitor;
    
    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + "\n ,autor=" + autor + "\n, totPaginas=" + tolPaginas + ", pagAtual=" + pagAtual + "\n, aberto=" + aberto +"\n, leitor=" + leitor.getNome() +
        ", idade=" + leitor.getIdade() +
        ", sexo=" + leitor.getSexo() + '}' ;
    }
    public Livro(String titulo,String autor, int totaPaginas, boolean aberto, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTolPaginas(totaPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setAberto(aberto);
        this.setLeitor(leitor);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getTolPaginas(){
        return this.tolPaginas;
    }
    public void setTolPaginas(int tolPaginas){
        this.tolPaginas = tolPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
   
    @Override
    public void abrir() {
       this.setAberto(true);
    }
    @Override
    public void fechar() {
       this.setAberto(false);
    }
    @Override
    public void folhear(int pagina) {
        if(pagina > this.getTolPaginas()){
            this.setPagAtual(0);
        } else{
            this.setPagAtual(pagina);
        }
      
    }
    @Override
    public void avançarPag() {
       this.pagAtual++;
    }
    @Override
    public void voltarPag() {
       this.pagAtual--;
    }

    

    
}
