package model;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        String resp =  super.toString();
        resp += "Dia de Aniversario: " + diaAniversario + "\n";
        return resp;
    }
}
