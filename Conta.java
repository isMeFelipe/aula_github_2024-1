public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    // Construtor
    public Conta(int numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Métodos de acesso
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } 
    }


}
