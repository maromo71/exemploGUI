import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        aluno1.setRa(1);
        aluno1.setNome("Ricardo");
        aluno2.setRa(2);
        aluno2.setNome("Antonio");
        aluno3.setRa(3);
        aluno3.setNome("Marcos");
        System.out.println(aluno1.hashCode());
        System.out.println(aluno2.hashCode());
        System.out.println(aluno3.hashCode());
        if(aluno1.equals(aluno2)){
            System.out.println("é o mesmo aluno");
        }else{
            System.out.println("nao é o mesmo aluno");
        }
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        Aluno alunoProc = new Aluno();
        alunoProc.setRa(3);
        System.out.println(lista.contains(alunoProc));
        int i = lista.indexOf(alunoProc);
        alunoProc = lista.get(i);

        System.out.println("Aluno: "  + alunoProc.getNome());

    }
}