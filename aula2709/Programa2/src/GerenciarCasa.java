public class GerenciarCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setCor("Azul");
        Janela j1 = new Janela();
        Janela j2 = new Janela();
        Janela j3 = new Janela();
        casa.setJanela1(j1);
        casa.setJanela2(j2);
        casa.setJanela3(j3);
        casa.getJanela1().abre();
        casa.getJanela2().abre();
        casa.getJanela3().fecha();

        System.out.println("Total de janelas abertas:");
        System.out.println(casa.quantidadeJanelasAbertas());

        System.out.println(casa);
    }
}
