package model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor){
        //checar o valor. Se for negativo ou zero, disparamos uma exceção
        if(valor <= 0){
            throw new IllegalArgumentException("Valor do deposito deve ser positivo");
        }
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo < valor){
            throw new IllegalArgumentException("Sem saldo para o saque");
        }
        saldo -=valor;
    }
}
