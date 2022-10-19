public class Gerenciar {
    public static void main(String[] args) {
        //Testando com janela primeiro
        Janela janela = new Janela();
        janela.pinta("Azul");
        janela.setDimensaoX(110);
        janela.setDimensaoY(300);
        janela.setDimensaoZ(40);
        janela.abre();

        if(janela.estaAberta()){
            System.out.println("Aberta");
        }else{
            System.out.println("Fechada");
        }

        janela.fecha();
        if(janela.estaAberta()){
            System.out.println("Aberta");
        }else{
            System.out.println("Fechada");
        }

    }
}