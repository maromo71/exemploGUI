public class Casa {
    private String cor;
    private Janela janela1;
    private Janela janela2;
    private Janela janela3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela getJanela1() {
        return janela1;
    }

    public void setJanela1(Janela janela1) {
        this.janela1 = janela1;
    }

    public Janela getJanela2() {
        return janela2;
    }

    public void setJanela2(Janela janela2) {
        this.janela2 = janela2;
    }

    public Janela getJanela3() {
        return janela3;
    }

    public void setJanela3(Janela janela3) {
        this.janela3 = janela3;
    }


    public int quantidadeJanelasAbertas(){
        int total = 0;
        if(janela1.estaAberta()) total++;
        if(janela2.estaAberta()) total++;
        if(janela3.estaAberta()) total++;
        return total;
    }
    @Override
    public String toString() {
        return "Casa{" +
                "cor='" + cor + '\'' +
                ", janela1=" + janela1.estaAberta() +
                ", janela2=" + janela2.estaAberta() +
                ", janela3=" + janela3.estaAberta() +
                '}';
    }
}
