package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Tela extends JFrame implements WindowListener, ActionListener {
    protected Dimension dFrame, dLabel, dtextField, dButton, dTextArea;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextField txtValor, txtSaldo;
    protected Label lblValor, lblSaldo;
    protected TextArea txtMsg;

    //Atributo importante, vamos um atributo agregado
    Caixa caixa;

    //Construtor - definir a aparencia da janela
    public Tela(){
        caixa = new Caixa();
        dFrame = new Dimension(330, 400);
        dLabel = new Dimension(40, 20);
        dtextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(260, 140);
        //Definindo elemento um a um
        //Definir a janela
        setTitle("Controle de Caixa");
        setResizable(false);
        setSize(dFrame);
        setLocation(400,200);
        setLayout(null);

        //Definir os outros componentes
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dtextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dtextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

        cmdSair.addActionListener(this);
        cmdEntrada.addActionListener(this);
        cmdRetirada.addActionListener(this);
        cmdConsulta.addActionListener(this);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Documento salvo",
                "Mensagem final",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair) {
            //mensagem antes de fechar o programa
            JOptionPane.showMessageDialog(null,
                    "Saindo do programa", "Saindo",
                    JOptionPane.INFORMATION_MESSAGE
                    );
            System.exit(0);
        }
        if(e.getSource()==cmdEntrada){
            //para fazer o deposito
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            JOptionPane.showMessageDialog(null, "Depósito realizado",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            txtMsg.append("Depósito de " + valor + " realizado com sucesso\n");
            limparCaixaDeTexto();
            return;
        }
        if(e.getSource()==cmdRetirada){
            //para fazer o saque
            try{
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                JOptionPane.showMessageDialog(null, "Saque realizado",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtMsg.append("Saque de " + valor + " realizado com sucesso\n");
                limparCaixaDeTexto();
                return;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource()==cmdConsulta){
            //para ver o saldo
            txtSaldo.setText(Double.toString(caixa.getSaldo()));

        }

    }

    private void limparCaixaDeTexto() {
        txtSaldo.setText("");
        txtValor.setText("");
    }
}
