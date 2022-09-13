public class GerenciarConta {
    public static void main(String[] args) {
        Conta.cpmf = 0.0081;
        Conta contaIgor = new Conta();
        Conta contaJoao = new Conta();

        contaIgor.setNumConta(1);
        contaIgor.setNome("Igor");
        contaIgor.setAgencia("Mogi Mirim");


        contaJoao.setNumConta(2);
        contaJoao.setNome("Joao");
        contaJoao.setAgencia("Mogi Guacu");

        System.out.println(contaJoao.cpmf);
        System.out.println(Conta.cpmf);
        System.out.println(Math.PI);

        int a = 10;
        Integer b = 10;
        System.out.println(Double.BYTES);
    }
}
