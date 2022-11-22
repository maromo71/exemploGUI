public class Gerente extends Funcionario implements Logavel {
    @Override
    public boolean efetuarLogin() {
        System.out.println("Gerente Logou");
        GerenciarAcesso.logados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogout() {
        System.out.println("Gerente saiu do sistema");
        GerenciarAcesso.logados.remove(this);
        return true;
    }
}
