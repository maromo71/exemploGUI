import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarAcesso ga = new GerenciarAcesso();
        System.out.println("Acessando agora: " + ga.getNumeroLogados());
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Operador operador = new Operador();
        Secretaria secretaria1 = new Secretaria();
        Gerente gerente1 = new Gerente();
        cliente1.efetuarLogin();
        cliente2.efetuarLogin();
        // operador.efetuarLogin(); nao é possivel
        secretaria1.efetuarLogin();
        gerente1.efetuarLogin();
        System.out.println("Acessando agora: " + ga.getNumeroLogados());
        ga.listarLogados();
        gerente1.efetuarLogout();
        System.out.println("Acessando agora: " + ga.getNumeroLogados());
    }

    public int getNumeroLogados(){
        return  logados.size();
    }

    public void listarLogados(){
        for(Logavel o : logados){
            System.out.println(o.getClass());
        }
    }
}