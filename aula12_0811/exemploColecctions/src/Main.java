import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Mara");
        lista.add(12);
        lista.add("Maromo");
        lista.add(12);
        lista.add(12.9);
        System.out.println("Tam: " + lista.size());
        for(Object x : lista){
            System.out.println(x);
        }
        System.out.println(lista.contains(12));
        while(lista.contains("Maromo")){
            lista.remove("Maromo");
        }
        lista.remove(new Integer(12));
        System.out.println(lista.size());
        System.out.println();
        for(Object x : lista){
            System.out.println(x);
        }
    }
}