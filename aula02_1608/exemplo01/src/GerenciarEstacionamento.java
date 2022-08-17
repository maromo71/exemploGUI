import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    List<Carro> listaDeCarro = new ArrayList<>();

    public static void main(String[] args) {

        //3 objetos novos, que representem 3 carros
        Carro carro1, carro2, carro3;
        carro1 = new Carro();
        carro1.idCarro = 11;
        carro1.marca = "Fiat";
        carro1.modelo = "147";
        carro1.anoFab = 1977;
        carro1.preco = 1500.00;

        carro1.estacionar();
        carro2 = new Carro();
        carro2.idCarro = 22;
        carro2.marca = "VW";
        carro2.modelo = "Fusca";
        carro2.anoFab = 1969;
        carro2.preco = 5000.00;
        GerenciarEstacionamento ge = new GerenciarEstacionamento();
        ge.listaDeCarro.add(carro1);
        ge.listaDeCarro.add(carro2);
        for(Carro obj : ge.listaDeCarro){
            obj.apresentarDados();
        }


    }
}