import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aula sobre Gerenciamento de Exceções
        try{
            int x;
            System.out.println("Digite um valor: ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            int y;
            System.out.println("Digite outro valor: ");
            y = sc.nextInt();
            int res = x / y;

            System.out.println("Resultado: " + res);
        }catch (InputMismatchException ex){
            System.out.println("Entrada de dado inválida");
        }catch (ArithmeticException ex){
            System.out.println("Impossivel div por zero");
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
            System.out.println("Procure o adm do sist");
        }


    }
}