import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTeste ct = new ContaTeste();
        int opc=0;
        do{
            System.out.println("Projeto Conta");
            System.out.println("1) Cadastrar");
            System.out.println("2) Depositar");
            System.out.println("3) Sacar");
            System.out.println("4) Consultar");
            System.out.println("9) Sair");
            System.out.println("Digite sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execDepositar();
                    break;
                case 3:
                    ct.execSacar();
                    break;
                case 4:
                    ct.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrando os dados da conta...");
        System.out.println("Dig. num. da conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Dig. a agencia da conta: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Dig. o nome do cliente da conta: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Nao deixe de efetuar um deposito :-0");
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execConsultar(){
        System.out.println(cc);
    }

    public void execSacar(){
        System.out.println("Efetuando o saque da conta...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe valor a sacar: ");
        if(cc.sacar(Double.parseDouble(sc.nextLine()))==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo para saque");
        }
    }

    public void execDepositar(){
        System.out.println("Efetuando o deposito da conta...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe valor a depositar: ");
        cc.depositar(Double.parseDouble(sc.nextLine()));
        System.out.println("Deposito efetuado com sucesso ");
    }


}