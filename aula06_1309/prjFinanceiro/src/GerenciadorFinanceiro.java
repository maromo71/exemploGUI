import com.xyz.financeiro.view.ContaView;

import javax.swing.*;

public class GerenciadorFinanceiro {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new ContaView().getPainelConta());
        tela.setSize(500,500);
        tela.setTitle("Controle de Contas");
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}