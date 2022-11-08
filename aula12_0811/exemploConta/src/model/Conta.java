package model;

import library.SemSaldoException;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SemSaldoException {
        if(valor > saldo){
            throw new SemSaldoException();
        }
        saldo-= valor;
    }

    public void depositar(double valor){
        saldo+= valor;
    }
}
