public class Secretaria extends Funcionario implements Logavel{
    @Override
    public boolean efetuarLogin() {
        System.out.println("Secretaria logou");
        GerenciarAcesso.logados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogout() {
        System.out.println("Secretaria saiu do sistema");
        GerenciarAcesso.logados.remove(this);
        return true;
    }
}
