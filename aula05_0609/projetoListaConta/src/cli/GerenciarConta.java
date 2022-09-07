package cli;

import model.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarConta {
    public List<Conta> lista = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarConta gc =new GerenciarConta();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            opc = construirMenu(gc, sc);
        }while(opc!=9);
    }

    private static int construirMenu(GerenciarConta gc, Scanner sc) {
        int opc;
        System.out.println("MENU");
        System.out.println("1. Cadastrar Nova Conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Saldo");
        System.out.println("5. Saldo de Todas as Contas");
        System.out.println("6. Patrimonio Liquido");
        System.out.println("9. Sair");
        System.out.println("Digite sua opcao: ");
        opc = Integer.parseInt(sc.nextLine());
        switch (opc){
            case 1:
                gc.execCadastrar(sc);
                break;
            case 2:
                gc.execDepositar(sc);
                break;
            case 3:
                gc.execSacar(sc);
                break;
            case 4:
                gc.execMostrarSaldo(sc);
                break;
            case 5:
                gc.execSaldoTodasContas();
                break;
            case 6:
                gc.execMostrarPatrimonio();
                break;
            case 9:
                System.out.println("FIM");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return opc;
    }

    public void execCadastrar(Scanner sc){
        //Cadastra uma nova e coloca na lista de contas
        Conta conta = new Conta();
        System.out.println("Digite o numero da conta");
        conta.setNumConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome da cliente");
        conta.setNome(sc.nextLine());
        //adicionar na lista
        lista.add(conta);
        System.out.println("Conta cadastrada com sucesso");

    }

    public void execDepositar(Scanner sc){
        System.out.println("Digite o numero da conta a ser depositado: ");
        int proc = Integer.parseInt(sc.nextLine());
        Conta conta = null;
        //varrer a lista a procura do numero informado
        for(Conta c : lista){
            if(c.getNumConta()==proc) {
                conta = c;
                break;
            }
        }
        if(conta!=null){
            System.out.println("Digite o valor do deposito: ");
            boolean ok = conta.depositar(Double.parseDouble(sc.nextLine()));
            if(ok){
                System.out.println("Depósito efetuado com sucesso");
            }else{
                System.out.println("Valor não pode ser menor ou igual a ZERO");
            }
        }else{
            System.out.println("Conta não encontrada");
        }
    }

    public void execSacar(Scanner sc){
        System.out.println("Digite o numero da conta a ser sacado: ");
        int proc = Integer.parseInt(sc.nextLine());
        Conta conta = null;
        //varrer a lista a procura do numero informado
        for(Conta c : lista){
            if(c.getNumConta()==proc) {
                conta = c;
                break;
            }
        }
        if(conta!=null){
            System.out.println("Digite o valor do saque: ");
            boolean ok = conta.sacar(Double.parseDouble(sc.nextLine()));
            if(ok) {
                System.out.println("Saque efetuado com sucesso");
            }else{
                System.out.println("Sem grana para o saque");
            }
        }else{
            System.out.println("Conta não encontrada");
        }
    }

    public void execMostrarSaldo(Scanner sc){
        System.out.println("Digite o numero da conta a verificar o saldo: ");
        int proc = Integer.parseInt(sc.nextLine());
        Conta conta = null;
        //varrer a lista a procura do numero informado
        for(Conta c : lista){
            if(c.getNumConta()==proc) {
                conta = c;
                break;
            }
        }
        if(conta!=null){
            System.out.println("O saldo da conta e: " + conta.getSaldo());
        }
    }

    public void execSaldoTodasContas(){
        for(Conta c: lista){
            System.out.println(c.toString());
        }
    }

    public void execMostrarPatrimonio(){
        double total = 0;
        for(Conta c: lista){
            total +=c.getSaldo();
        }
        System.out.println("O Total de todas as contas: " + total);
    }



}