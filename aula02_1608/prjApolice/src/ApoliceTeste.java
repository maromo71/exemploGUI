public class ApoliceTeste {
    public String nome = "Fatec";
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Ricardo Silva");
        apolice.setIdade(15);
        apolice.setValorPremio(1500.89f);
        ApoliceTeste teste = new ApoliceTeste();
        System.out.println(teste.nome);
        apolice.imprimir();

    }
}