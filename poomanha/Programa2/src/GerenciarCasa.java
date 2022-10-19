public class GerenciarCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setCor("Azul");

        casa.getJanela1().setCor("Azul");
        casa.getJanela1().setDimensaoX(90);
        casa.getJanela1().setDimensaoY(300);
        casa.getJanela1().abre();
        casa.getJanela2().abre();
        casa.getJanela3().fecha();

        System.out.println("Total de janelas abertas:");
        System.out.println(casa.quantidadeJanelasAbertas());

        System.out.println(casa);
    }
}
