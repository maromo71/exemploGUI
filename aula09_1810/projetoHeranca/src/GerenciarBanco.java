import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarBanco {

    private List<Conta> contas = new ArrayList<>();
    public static void main(String[] args) {

        Poupanca conta1 = new Poupanca();
        Corrente conta2 = new Corrente();
        conta1.setNumConta(1);
        conta1.setNomeCliente("Poupanca do chico");
        conta1.setDiaAniversario(18);
        conta1.depositar(5000);
        conta1.sacar(3500);
        System.out.println(conta1);

        conta2.setNumConta(2);
        conta2.setNomeCliente("Cc do Maromo");
        conta2.setLimiteCheque(1000);
        conta2.depositar(100);
        conta2.sacar(1050);
        System.out.println(conta2);
        GerenciarBanco gerenciar = new GerenciarBanco();
        gerenciar.contas.add(conta1);
        gerenciar.contas.add(conta2);

        System.out.println("Patrimonio dos clientes: ");
        System.out.println(gerenciar.patrimonioDosClientes());

    }

    public double patrimonioDosClientes(){
        double total = 0;
        for(Conta c : contas){
            total += c.getSaldo();
        }
        return total;
    }
}