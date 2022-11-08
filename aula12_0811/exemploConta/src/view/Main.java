package view;

import library.SemSaldoException;
import model.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.depositar(1000.0);
        try {
            Scanner sc = new Scanner(System.in);
            double v = Double.parseDouble(sc.nextLine());
            conta1.sacar(v);
        } catch (SemSaldoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo da conta: " + conta1.getSaldo());
    }
}