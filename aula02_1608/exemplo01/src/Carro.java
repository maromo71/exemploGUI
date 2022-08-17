public class Carro {
    //Definir atributos
    int idCarro;
    String modelo;
    String marca;
    int anoFab;
    double preco;

    private boolean licenciado;

    //Definir os métodos
    void estacionar(){
        System.out.println("Carro sendo estacionado");
        System.out.println("Id: " + idCarro + " Modelo: " + modelo);
    }
    void acelerar(){

    }
    void parar(){

    }
    void apresentarDados(){
        System.out.println("ID: " + idCarro);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("------------");
    }
}
