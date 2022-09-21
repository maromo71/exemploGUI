public class JogoCarta {
    private String jogador1;
    private String jogador2;
    private Carta cartaJogador1;
    private Carta cartaJogador2;


    public String getJogador1() {
        return jogador1;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public Carta getCartaJogador1() {
        return cartaJogador1;
    }

    public void setCartaJogador1(Carta cartaJogador1) {
        this.cartaJogador1 = cartaJogador1;
    }

    public Carta getCartaJogador2() {
        return cartaJogador2;
    }

    public void setCartaJogador2(Carta cartaJogador2) {
        this.cartaJogador2 = cartaJogador2;
    }

    public void vencedor(){
        if(cartaJogador1.getValor().ordinal() > cartaJogador2.getValor().ordinal()){
            System.out.println("Vencedor Jogador 1");
        }else{
            if(cartaJogador1.getValor().ordinal() < cartaJogador2.getValor().ordinal()){
                System.out.println("Vencedor Jogador 2");
            } else {
                if(cartaJogador2.getNaipe().ordinal() > cartaJogador1.getNaipe().ordinal()){
                    System.out.println("Vencedor Jogador 2");
                }else{
                    System.out.println("Vencedor Jogador 1");
                }
            }
        }
    }
}
