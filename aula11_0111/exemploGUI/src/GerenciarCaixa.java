import view.Tela;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        Tela minhaTela = new Tela();
        minhaTela.setTitle("Controle de Caixa");
        minhaTela.setVisible(true);
        minhaTela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}