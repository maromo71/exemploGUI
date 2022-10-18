package model;

public class Corrente extends Conta {
    private double limiteCheque;

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (limiteCheque + getSaldo())){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String resp = super.toString();
        resp += "Limite: " + limiteCheque + "\n";
        return resp;
    }
}
