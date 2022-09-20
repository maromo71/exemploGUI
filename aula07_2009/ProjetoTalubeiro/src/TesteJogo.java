import java.util.Scanner;

public class TesteJogo {
    public static void main(String[] args) {
        Tabuleiro t = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        int[] p = new int[2];
        System.out.println("Digite o primeiro palpite: ");
        p[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo palpite: ");
        p[1] = Integer.parseInt(sc.nextLine());
        t.setPalpites(p);
        double premio = t.jogar();
        if(premio > 0.0){
            System.out.println("Parabéns! você ganhou");
            System.out.println("Prêmio: " + premio);
        }else{
            System.out.println("Infelizmente nao ganhou");
        }

    }
}