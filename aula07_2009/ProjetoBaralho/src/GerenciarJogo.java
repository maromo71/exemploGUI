import java.util.Random;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();
        System.out.println(meuBaralho.listarCartas());
        meuBaralho.embaralhar();
        System.out.println();
        JogoCarta jc = new JogoCarta();
        jc.setJogador1("MAromo");
        jc.setJogador2("Ricardo");
        Random r = new Random();
        Carta carta1 = new Carta();
        carta1 = meuBaralho.baralhoAtual().get(r.nextInt(52));
        jc.setCartaJogador1(carta1);
        Carta carta2 = new Carta();
        carta2 = meuBaralho.baralhoAtual().get(r.nextInt(52));
        jc.setCartaJogador2(carta2);
        System.out.println("Jogador 1: " + jc.getCartaJogador1());
        System.out.println("Jogador 2: " + jc.getCartaJogador2());
        jc.vencedor();

    }
}