public class Cliente implements Logavel {

    @Override
    public boolean efetuarLogin() {
        System.out.println("Cliente Logou");
        GerenciarAcesso.logados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogout() {
        System.out.println("Cliente saiu do sistema");
        GerenciarAcesso.logados.remove(this);
        return false;
    }
}
