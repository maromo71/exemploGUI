package view;

import model.Conta;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormConta {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton depositarButton;
    private JButton sacarButton;
    private JButton consultarButton;
    private JButton sairButton;
    private JTextArea txtMsg;
    private JPanel painelConta;

    public JPanel getPainelConta() {
        return painelConta;
    }

    Conta conta;

    public FormConta() {
        conta = new Conta();
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        consultarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(conta.getSaldo()));
            }
        });
        depositarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                conta.depositar(valor);
                JOptionPane.showMessageDialog(null,
                        "Depósito efetuado com sucesso",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        sacarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                conta.sacar(valor);
                JOptionPane.showMessageDialog(null,
                        "Saque efetuado com sucesso",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
