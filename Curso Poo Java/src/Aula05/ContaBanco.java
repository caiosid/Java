public class ContaBanco {
    // Atributos
    public int numeroConta; 
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    // Métodos Especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

     // Métodos Personaliados
     public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getnumeroConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
     }
    public void abrirConta(String conta){
        this.setTipo(conta);
        this.setStatus(true);
        if(conta == "Conta Corrente"){
            this.setSaldo(50);
        } else if (conta == "Conta Poupança"){
            this.setSaldo(150); 
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro!");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito!");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
           //this.saldo = this.saldo + v;
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
           v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        } if(this.getStatus()){
             this.setSaldo((this.getSaldo() - v));
             System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        } else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    public int getnumeroConta(){
        return this.numeroConta;
    }
    public void setnumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }


}
