import view.FormConta;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new FormConta().getPainelConta());
        tela.setTitle("Cadastro de conta");
        tela.setVisible(true);
    }
}