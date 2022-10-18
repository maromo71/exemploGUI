package model;

public class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo+= valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo-= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String resp = "Num Conta: " + numConta + "\n"+
                "Nome Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n";
        return resp;
    }
}
