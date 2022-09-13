import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Digite o primeiro valor");
        num1 = Double.parseDouble(sc.nextLine());
        String nome;
        System.out.println("Digite um nome: ");
        nome = sc.nextLine();
        //System.out.println("Digite o segundo valor");
        //num2 = Double.parseDouble(sc.nextLine());
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        double x = num1 + num2;
        System.out.println("Resultado: " + x);

    }
}