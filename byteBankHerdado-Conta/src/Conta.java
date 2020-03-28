public abstract class Conta {

    protected double Saldo;
    private int Agencia;
    private int Numero;
    private Cliente Titular;
    private static int Total = 0;

    
    public Conta(int Agencia, int Numero){ //construtor
        Conta.Total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.Agencia = Agencia;
        this.Numero = Numero;
        this.Saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    //metodos
    
    public abstract void Deposita(double valor); 

    public boolean Saca(double valor) {
        if(this.Saldo >= valor) {
            this.Saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean Transfere(double Valor, Conta Destino) {
        if(this.Saca(Valor)) {
                Destino.Deposita(Valor);
                return true;
        } else {
                return false;
        }
    }

    public double getSaldo(){
        return this.Saldo;
    }

    public int getNumero(){
        return this.Numero;
    }

    public void setNumero(int Numero){
        if(Numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.Numero = Numero;
    }

    public int getAgencia(){
        return this.Agencia;
    }

    public void setAgencia(int Agencia){
       if(Agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.Agencia = Agencia;
    }

    public void setTitular(Cliente Titular){
        this.Titular = Titular;
    }

    public Cliente getTitular(){
        return this.Titular;
    }

    public static int getTotal(){
        return Conta.Total;
    }

}