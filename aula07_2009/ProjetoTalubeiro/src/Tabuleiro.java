import java.util.Random;

public class Tabuleiro {
    private int[][] tabu = new int[10][10];
    private int[] palpites = new int[2];
    public void setPalpites(int[] palpites) {
        this.palpites = palpites;
    }



    public Tabuleiro(){
        //logica para gerar valores aleatorios
        //valores entre 1 e 10
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabu[i][j] = (r.nextInt(100))+1;
            }
        }
    }

    public double jogar(){
        double premio = 0.0;
        int acertos = 0;
        for(int p=0; p<2; p++){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                 if(palpites[p] == tabu[i][j])acertos++;
                }
            }
        }
        if(acertos>=3){
            premio = acertos * 1000;
        }
        imprimir(tabu);
        return premio;
    }
    private static void imprimir(int[][] tabu){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%3d] ", tabu[i][j]);
            }
            System.out.println();
        }
    }
}
