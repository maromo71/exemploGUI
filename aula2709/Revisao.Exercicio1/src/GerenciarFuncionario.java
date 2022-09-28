import java.time.LocalDate;

public class GerenciarFuncionario {
    public static void main(String[] args) {
     /*  Teste do exercicio antes da associação

      Funcionario func = new Funcionario();
      func.setIdFunc(1);
      func.setNomeFunc("Maromo");
      func.setDepartamento("ADS");
      func.setSalario(3000.0);
      func.setDataContratacao(LocalDate.now());
      func.setEstaAtivo(true);
      func.atualizarSalario(func.getSalario()+100.0);
      func.imprimir();
      func.demitirFuncionario();
      func.imprimir();


      */
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setRazaoSocial("Fatec Mogi Mirim");
        Funcionario f1, f2, f3;
        f1 = new Funcionario();
        f1.setIdFunc(1);
        f1.setNomeFunc("Maromo");
        f1.setDataContratacao(LocalDate.now());
        f2 = new Funcionario();
        f2.setIdFunc(2);
        f2.setNomeFunc("Pedro");
        f2.setDataContratacao(LocalDate.now());

        f3 = new Funcionario();
        f3.setIdFunc(3);
        f3.setNomeFunc("Caio");
        f3.setDataContratacao(LocalDate.now());

        empresa.adicionarEmpregado(f1);
        empresa.adicionarEmpregado(f2);
        empresa.adicionarEmpregado(f3);
        boolean tem = empresa.contemEmpregado(f1);
        if(tem){
            System.out.println("Funcionario pertence ao quadro");
        }else{
            System.out.println("Funcionario nao pertence ao quadro");
        }

        //adicionei este para listar todos os empregados da
        //empresa
        empresa.mostraEmpregado();

    }
}