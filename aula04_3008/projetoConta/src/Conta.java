public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    //getters and setters

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Dados da Conta \n" +
                "Num Conta: " + conta + "\n" +
                "Saldo: " + saldo + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "-----------------------------------\n";
    }

    public int sacar(double valor) {
        if(valor <= saldo){
            saldo-= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        saldo += valor;
    }

}
